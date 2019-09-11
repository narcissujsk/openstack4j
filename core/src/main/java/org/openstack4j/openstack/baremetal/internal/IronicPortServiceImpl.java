package org.openstack4j.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.api.baremetal.IronicPortService;
import org.openstack4j.api.baremetal.NodeService;
import org.openstack4j.core.transport.HttpResponse;
import org.openstack4j.model.baremetal.*;
import org.openstack4j.model.baremetal.builder.NodeCreateBuilder;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.options.PortListOptions;
import org.openstack4j.openstack.baremetal.domain.IronicNode;
import org.openstack4j.openstack.baremetal.domain.IronicNodeCreate;
import org.openstack4j.openstack.baremetal.domain.IronicPort;
import org.openstack4j.openstack.baremetal.domain.Target;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.compute.functions.ToActionResponseFunction;
import org.openstack4j.openstack.networking.domain.NeutronPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

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
    public Port get(String uuid) {
        checkNotNull(uuid);
        return get(IronicPort.class, uri("v1/ports/%s", uuid)).execute();
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
