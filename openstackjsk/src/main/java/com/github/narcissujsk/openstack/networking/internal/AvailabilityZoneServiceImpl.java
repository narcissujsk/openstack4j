package com.github.narcissujsk.openstack.networking.internal;

import java.util.List;

import com.github.narcissujsk.api.networking.AvailabilityZoneService;
import com.github.narcissujsk.model.network.AvailabilityZone;
import com.github.narcissujsk.openstack.networking.domain.NeutronAvailabilityZone.AvailabilityZones;


/**
 * Availability Zone Service
 * 
 * @author Taemin
 *
 */
public class AvailabilityZoneServiceImpl extends BaseNetworkingServices implements AvailabilityZoneService {

    /**
     * List all availability zone that the current neutron has
     * {@inheritDoc}
     * @author Taemin
     */
	@Override
	public List<? extends AvailabilityZone> list() {		
		return get(AvailabilityZones.class, uri("/availability_zones")).execute().getList();	
	}

   
}
