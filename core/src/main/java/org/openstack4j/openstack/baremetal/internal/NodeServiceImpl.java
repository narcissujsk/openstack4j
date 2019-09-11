package org.openstack4j.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.api.Apis;
import org.openstack4j.api.baremetal.BaremetalService;
import org.openstack4j.api.baremetal.NodeService;
import org.openstack4j.api.compute.ServerService;
import org.openstack4j.api.compute.ext.InstanceActionsService;
import org.openstack4j.api.compute.ext.InterfaceService;
import org.openstack4j.core.transport.ExecutionOptions;
import org.openstack4j.core.transport.HttpResponse;
import org.openstack4j.core.transport.propagation.PropagateOnStatus;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.baremetal.Node;
import org.openstack4j.model.baremetal.NodeCreate;
import org.openstack4j.model.baremetal.NodePowerState;
import org.openstack4j.model.baremetal.NodeProvisionState;
import org.openstack4j.model.baremetal.builder.NodeCreateBuilder;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.compute.*;
import org.openstack4j.model.compute.Server.Status;
import org.openstack4j.model.compute.VNCConsole.Type;
import org.openstack4j.model.compute.actions.BackupOptions;
import org.openstack4j.model.compute.actions.EvacuateOptions;
import org.openstack4j.model.compute.actions.LiveMigrateOptions;
import org.openstack4j.model.compute.actions.RebuildOptions;
import org.openstack4j.model.compute.builder.ServerCreateBuilder;
import org.openstack4j.openstack.baremetal.domain.IronicNode;
import org.openstack4j.openstack.baremetal.domain.IronicNodeCreate;
import org.openstack4j.openstack.baremetal.domain.Target;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.common.Metadata;
import org.openstack4j.openstack.compute.domain.*;
import org.openstack4j.openstack.compute.domain.NovaServer.Servers;
import org.openstack4j.openstack.compute.domain.actions.*;
import org.openstack4j.openstack.compute.domain.actions.BasicActions.*;
import org.openstack4j.openstack.compute.functions.ToActionResponseFunction;
import org.openstack4j.openstack.compute.functions.WrapServerIfApplicableFunction;
import org.openstack4j.openstack.compute.internal.BaseComputeServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.openstack4j.openstack.compute.domain.actions.CreateSnapshotAction.create;

/**
 * Server Operation API implementation
 *
 * @author Jeremy Unruh
 */
public class NodeServiceImpl extends BaseBaremetalServices implements NodeService {

    private static final Logger LOG = LoggerFactory.getLogger(NodeServiceImpl.class);

    public static class Nodes extends ListResult<IronicNode> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("nodes")
        private List<IronicNode> nodes;

        @Override
        public List<IronicNode> value() {
            return nodes;
        }
    }

    @Override
    public List<? extends Node> list() {
       return listAll(false);
    }

    @Override
    public List<? extends Node> list(boolean detail) {
        return listAll(detail);
    }

    @Override
    public Node get(String nodeid) {
        checkNotNull(nodeid);
        return get(IronicNode.class, uri("/nodes/%s", nodeid)).execute();
    }


    @Override
    public Node create(NodeCreate node) {
        checkNotNull(node);
        return post(IronicNode.class, uri("/v1/nodes"))
                .entity(node)
                .execute();
    }

    @Override
    public ActionResponse delete(String nodeid) {
        checkNotNull(nodeid);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/v1/nodes/%s", nodeid)).executeWithResponse()
        );
    }

    @Override
    public NodeCreateBuilder nodeBuilder() {
        return  IronicNodeCreate.builder();
    }

    @Override
    public ActionResponse power(String nodeid, NodePowerState nodePowerState) {
        return ToActionResponseFunction.INSTANCE.apply(invokePowerActionWithResponse(nodeid, nodePowerState), nodePowerState.getTarget());
    }

    @Override
    public ActionResponse provision(String nodeid, NodeProvisionState nodeProvisionState) {
        return null;
    }


    protected HttpResponse invokePowerActionWithResponse(String nodeid, NodePowerState powerState)  {
        Target action = new Target();
        HttpResponse response  = post(Void.class, uri("v1/nodes/%s/states/power", nodeid))
                .entity(action)
                .executeWithResponse();
        return response;
    }

    public List<? extends Node> listAll(boolean detail) {
        Invocation<Nodes> req = get(Nodes.class, uri("/v1/nodes"+  ((detail) ? "/detail" : "")));
        return req.execute().getList();
    }



}
