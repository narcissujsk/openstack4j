package com.github.narcissujsk.model.identity.v2;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.identity.v2.builder.ServiceBuilder;

/**
 * OpenStack service, such as Compute (Nova), Object Storage (Swift), or Image Service (Glance).
 * A service provides one or more endpoints through which users can access resources and perform 
 *  
 * @author Jeremy Unruh
 */
public interface Service extends ModelEntity, Buildable<ServiceBuilder> {

	/**
	 * @return the id for the service
	 */
	String getId();
	
	/**
	 * The type of service (compute, identity, image, etc)
	 *
	 * @return the type of the service
	 */
	String getType();
	
	/**
	 * @return the name of the service (nova, neutron, glance ...)
	 */
	String getName();
	
	/**
	 * @return the description of the service
	 */
	String getDescription();
	
}
