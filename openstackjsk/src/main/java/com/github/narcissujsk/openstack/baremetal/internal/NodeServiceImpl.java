package com.github.narcissujsk.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.baremetal.BaremetalService;
import com.github.narcissujsk.api.baremetal.NodeService;
import com.github.narcissujsk.api.compute.ServerService;
import com.github.narcissujsk.api.compute.ext.InstanceActionsService;
import com.github.narcissujsk.api.compute.ext.InterfaceService;
import com.github.narcissujsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.core.transport.HttpResponse;
import com.github.narcissujsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.model.baremetal.*;
import com.github.narcissujsk.model.baremetal.builder.NodeCreateBuilder;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.compute.*;
import com.github.narcissujsk.model.compute.Server.Status;
import com.github.narcissujsk.model.compute.VNCConsole.Type;
import com.github.narcissujsk.model.compute.actions.BackupOptions;
import com.github.narcissujsk.model.compute.actions.EvacuateOptions;
import com.github.narcissujsk.model.compute.actions.LiveMigrateOptions;
import com.github.narcissujsk.model.compute.actions.RebuildOptions;
import com.github.narcissujsk.model.compute.builder.ServerCreateBuilder;
import com.github.narcissujsk.openstack.baremetal.domain.IronicNode;
import com.github.narcissujsk.openstack.baremetal.domain.IronicNodeCreate;
import com.github.narcissujsk.openstack.baremetal.domain.IronicPort;
import com.github.narcissujsk.openstack.baremetal.domain.Target;
import com.github.narcissujsk.openstack.common.ListEntity;
import com.github.narcissujsk.openstack.common.ListResult;
import com.github.narcissujsk.openstack.common.Metadata;
import com.github.narcissujsk.openstack.compute.domain.*;
import com.github.narcissujsk.openstack.compute.domain.NovaServer.Servers;
import com.github.narcissujsk.openstack.compute.domain.actions.*;
import com.github.narcissujsk.openstack.compute.domain.actions.BasicActions.*;
import com.github.narcissujsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstack.compute.functions.WrapServerIfApplicableFunction;
import com.github.narcissujsk.openstack.compute.internal.BaseComputeServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.openstack.compute.domain.actions.CreateSnapshotAction.create;

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
    public Node update(String nodeid, List<ArtifactUpdate> update) {
        checkNotNull(update);
        return  patch(IronicNode.class, uri("/v1/nodes/%s", nodeid)).entity(new ListEntity<ArtifactUpdate>(update)).execute();

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



    protected HttpResponse invokePowerActionWithResponse(String nodeid, NodePowerState powerState)  {
        Target action = new Target();
        action.setTarget(powerState.getTarget());
        HttpResponse response  = put(Void.class, uri("v1/nodes/%s/states/power", nodeid))
                .entity(action)
                .executeWithResponse();
        return response;
    }
    @Override
    public ActionResponse provision(String nodeid, NodeProvisionState nodeProvisionState) {
        return ToActionResponseFunction.INSTANCE.apply(invokeProvisionActionWithResponse(nodeid, nodeProvisionState), nodeProvisionState.name());

    }

    protected HttpResponse invokeProvisionActionWithResponse(String nodeid, NodeProvisionState nodeProvisionState)  {
        Target action = new Target();
        action.setTarget(nodeProvisionState.getTarget());
        HttpResponse response  = put(Void.class, uri("v1/nodes/%s/states/provision", nodeid))
                .entity(action)
                .executeWithResponse();
        return response;
    }
    public List<? extends Node> listAll(boolean detail) {
        Invocation<Nodes> req = get(Nodes.class, uri("/v1/nodes"+  ((detail) ? "/detail" : "")));
        return req.execute().getList();
    }



}
