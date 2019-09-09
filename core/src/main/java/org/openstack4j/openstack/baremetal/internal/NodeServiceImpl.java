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
import org.openstack4j.model.baremetal.Node;
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
    public Node create(String nodeid) {
        return null;
    }


    public List<? extends Node> listAll(boolean detail) {
        Invocation<Nodes> req = get(Nodes.class, uri("/v1/nodes"+  ((detail) ? "/detail" : "")));
        return req.execute().getList();
    }


    public static class Nodes extends ListResult<IronicNode> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("nodes")
        private List<IronicNode> nodes;

        @Override
        public List<IronicNode> value() {
            return nodes;
        }
    }
}
