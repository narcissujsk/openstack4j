package com.github.narcissujsk.model.octavia;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.octavia.status.LoadBalancerV2Status;

/**
 * The status tree of an lbaas v2 loadbalancer
 * @author wei
 */
public interface LoadBalancerV2StatusTree extends ModelEntity {
    /**
     * Get the status tree of a loadbalancer
     * @return the loadbalancer status tree
     */
    public LoadBalancerV2Status getLoadBalancerV2Status();
}
