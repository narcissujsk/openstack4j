package com.github.narcissujsk.openstack.networking.internal.ext;

import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.networking.ext.FlowClassifierService;
import com.github.narcissujsk.api.networking.ext.PortChainService;
import com.github.narcissujsk.api.networking.ext.PortPairGroupService;
import com.github.narcissujsk.api.networking.ext.PortPairService;
import com.github.narcissujsk.api.networking.ext.ServiceFunctionChainService;
import com.github.narcissujsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * {@inheritDoc}
 */
public class ServiceFunctionChainServiceImpl extends BaseNetworkingServices implements ServiceFunctionChainService {

    /**
     * {@inheritDoc}
     */
    @Override
    public FlowClassifierService flowclassifiers() {
        return Apis.get(FlowClassifierService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairService portpairs() {
        return Apis.get(PortPairService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairGroupService portpairgroups() {
        return Apis.get(PortPairGroupService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortChainService portchains() {
        return Apis.get(PortChainService.class);
    }
}
