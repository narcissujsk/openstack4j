package com.github.narcissujsk.model.gbp;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.common.Resource;
import com.github.narcissujsk.model.gbp.PolicyTargetGroup;
import com.github.narcissujsk.model.gbp.builder.NetworkServicePolicyBuilder;
import com.github.narcissujsk.openstack.gbp.domain.GbpNetworkServiceParams;

import java.util.List;

/**
 * Created by sumit gandhi on 7/4/2016.
 */
public interface NetworkServicePolicy extends Resource, Buildable<NetworkServicePolicyBuilder> {

    /**
     * Is the network service policy shared
     * @return boolean
     */
    boolean isShared();

    /**
     * Gets the network service parameters
     * @return network service parameters
     */
    List<GbpNetworkServiceParams>  getGbpNetworkServiceParamsList();

    /**
     * Gets the policy target groups associated with the service policy
     * @return list of policy target groups
     */
    List<PolicyTargetGroup> getPolicyTargetGroupList();

    /**
     * Gets the description of the network service policy
     * @return description
     */
    String getDescription();

}
