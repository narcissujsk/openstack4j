package com.github.narcissujsk.model.gbp.builder;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.gbp.NetworkServicePolicy;
import com.github.narcissujsk.openstack.gbp.domain.GbpNetworkServiceParams;

import java.util.List;

/**
 * Created by sumigand on 7/7/2016.
 */
public interface NetworkServicePolicyBuilder extends Buildable.Builder<NetworkServicePolicyBuilder, NetworkServicePolicy> {
    NetworkServicePolicyBuilder name(String name);
    NetworkServicePolicyBuilder description(String description);
    NetworkServicePolicyBuilder isShared(boolean shared);
    NetworkServicePolicyBuilder gbpNetworkServiceParams(List<GbpNetworkServiceParams> gbpNetworkServiceParams);
}
