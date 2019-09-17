package com.github.narcissujsk.api.octavia;

import com.github.narcissujsk.api.octavia.HealthMonitorV2Service;
import com.github.narcissujsk.api.octavia.LbPoolV2Service;
import com.github.narcissujsk.api.octavia.ListenerV2Service;
import com.github.narcissujsk.api.octavia.LoadBalancerV2Service;
import com.github.narcissujsk.common.RestService;

/**
 * OpenStack Octavia Operations API
 * 
 * @author wei
 */
public interface OctaviaService extends RestService {

    /**
     * @return the LoadBalancerV2 Service API
     */
    LoadBalancerV2Service loadBalancerV2();

    /**
     * @return the ListenerV2 Service API
     */
    ListenerV2Service listenerV2();

    /**
     * @return the LbPoolV2 Service API
     */
    LbPoolV2Service lbPoolV2();

    /**
     * @return the healthMonitorV2 Service API
     */
    HealthMonitorV2Service healthMonitorV2();
}
