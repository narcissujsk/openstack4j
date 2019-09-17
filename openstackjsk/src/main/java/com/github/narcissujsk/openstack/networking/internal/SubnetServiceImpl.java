package com.github.narcissujsk.openstack.networking.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.api.networking.SubnetService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.network.Subnet;
import com.github.narcissujsk.openstack.networking.domain.NeutronSubnet;
import com.github.narcissujsk.openstack.networking.domain.NeutronSubnet.Subnets;
import com.github.narcissujsk.openstack.networking.domain.NeutronSubnetUpdate;

/**
 * OpenStack (Neutron) Subnet based Operations implementation
 * 
 * @author Jeremy Unruh
 */
public class SubnetServiceImpl extends BaseNetworkingServices implements SubnetService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Subnet> list() {
        return get(Subnets.class, uri("/subnets")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Subnet get(String subnetId) {
        checkNotNull(subnetId);
        return get(NeutronSubnet.class, uri("/subnets/%s", subnetId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String subnetId) {
        checkNotNull(subnetId);
        return deleteWithResponse(uri("/subnets/%s", subnetId)).execute();
    }

    @Override
    public Subnet create(Subnet subnet) {
        checkNotNull(subnet);
        return post(NeutronSubnet.class, uri("/subnets")).entity(subnet).execute();
    }

    public Subnet update(Subnet subnet) {
        checkNotNull(subnet);
        return update(subnet.getId(), subnet);
    }

    public Subnet update(String subnetId, Subnet subnet) {
        checkNotNull(subnetId);
        checkNotNull(subnet);
        return put(NeutronSubnet.class, uri("/subnets/%s", subnetId))
                .entity(NeutronSubnetUpdate.createFromSubnet(subnet))
                .execute();
    }
}
