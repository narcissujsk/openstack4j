package com.github.narcissujsk.api.networking;

import java.util.List;
import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.network.AvailabilityZone;
import com.github.narcissujsk.openstack.networking.domain.NeutronAvailabilityZone;

/**
 * Neutron Availability Zone Service
 * 
 * @author Taemin
 *
 */
public interface AvailabilityZoneService extends RestService {


	/**
     * List all availability zone that the current neutron has.
     * 
     * @return list of all availability zones
     * @author Taemin
     */
    List<? extends AvailabilityZone> list();

}
