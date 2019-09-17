package com.github.narcissujsk.model.identity.v2;

import java.net.URI;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.identity.v2.Service;
import com.github.narcissujsk.model.identity.v2.builder.ServiceEndpointBuilder;

/**
 * OpenStack ServiceEndpoint is an endpoint which is mapped to a {@link Service}
 * 
 * @author Jeremy Unruh
 */
public interface ServiceEndpoint extends ModelEntity, Buildable<ServiceEndpointBuilder> {

	/**
	 * @return the endpoint identifier
	 */
	String getId();
	
	/**
	 * @return the region for this endpoint
	 */
	String getRegion();
	
	/**
	 * @return the service id this endpoint is asssociated with
	 */
	String getServiceId();
	
	/**
	 * @return the public URL for this endpoint
	 */
	URI getPublicURL();
	
	/**
	 * @return the admin URL for this endpoint
	 */
	URI getAdminURL();
	
	/**
	 * @return the internal URL for this endpoint
	 */
	URI getInternalURL();
	
}
