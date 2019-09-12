package org.openstack4j.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.api.baremetal.IronicPortService;
import org.openstack4j.api.baremetal.NodeService;
import org.openstack4j.core.transport.HttpResponse;
import org.openstack4j.model.artifact.ArtifactUpdate;
import org.openstack4j.model.baremetal.*;
import org.openstack4j.model.baremetal.builder.NodeCreateBuilder;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.options.PortListOptions;
import org.openstack4j.openstack.baremetal.domain.IronicNode;
import org.openstack4j.openstack.baremetal.domain.IronicNodeCreate;
import org.openstack4j.openstack.baremetal.domain.IronicPort;
import org.openstack4j.openstack.baremetal.domain.Target;
import org.openstack4j.openstack.common.ListEntity;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.compute.functions.ToActionResponseFunction;
import org.openstack4j.openstack.networking.domain.NeutronPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.openstack4j.core.transport.ClientConstants.*;

/**
 * Server Operation API implementation
 *
 * @author Jeremy Unruh
 */
public class IronicPortServiceImpl extends BaseBaremetalServices implements IronicPortService {

    private static final Logger LOG = LoggerFactory.getLogger(IronicPortServiceImpl.class);

    @Override
    public List<? extends Port> list() {
        return get(IronicPorts.class, uri("v1/ports")).execute().getList();
    }
    @Override
    public List<? extends Port> list(boolean detail) {
        return get(IronicPorts.class, uri("v1/ports/detail")).execute().getList();
    }

    @Override
    public Port get(String uuid) {
        checkNotNull(uuid);
        return get(IronicPort.class, uri("v1/ports/%s", uuid)).execute();
    }


    @Override
    public Port create(Port port) {
        checkNotNull(port);
        return post(IronicPort.class, uri("/v1/ports"))
                .entity(port)
                .execute();
    }

    @Override
    public Port update(String portid, List<ArtifactUpdate> update) {
        checkNotNull(update);
        return  patch(IronicPort.class, uri("/v1/ports/%s", portid)).entity(new ListEntity<ArtifactUpdate>(update)).execute();

    }

    @Override
    public ActionResponse delete(String portid) {
        checkNotNull(portid);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/v1/ports/%s", portid)).executeWithResponse()
        );
    }


    public static class IronicPorts extends ListResult<IronicPort> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("ports")
        private List<IronicPort> ports;

        @Override
        public List<IronicPort> value() {
            return ports;
        }
    }





}
