package org.openstack4j.openstack.baremetal.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.baremetal.BaremetalService;
import org.openstack4j.api.baremetal.IronicPortService;
import org.openstack4j.api.baremetal.NodeService;

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

    @Override
    public IronicPortService ports() {
        return Apis.get(IronicPortService.class);
    }


}
