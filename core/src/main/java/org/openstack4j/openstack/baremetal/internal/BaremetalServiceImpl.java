package org.openstack4j.openstack.baremetal.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.baremetal.BaremetalService;
import org.openstack4j.api.baremetal.NodeService;
import org.openstack4j.api.baremetal.PortService;
import org.openstack4j.api.compute.*;
import org.openstack4j.api.compute.ext.*;
import org.openstack4j.model.common.Extension;
import org.openstack4j.openstack.common.ExtensionValue.Extensions;
import org.openstack4j.openstack.compute.internal.BaseComputeServices;

import java.util.List;

/**
 * Compute (Nova) Operations API implementation
 * 
 * @author Jeremy Unruh
 */
public class BaremetalServiceImpl extends BaseBaremetalServices implements BaremetalService {


    @Override
    public NodeService nodes() {
        return Apis.get(NodeService.class);
    }


}
