package com.github.narcissujsk.model.identity.v2.builder;

import java.net.URI;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.identity.v2.Endpoint;

/**
 * A Builder which creates an Endpoint
 *  
 * @author jeremy
 */
public interface EndpointBuilder extends Builder<EndpointBuilder, Endpoint>{

	/**
	 * @see Endpoint#getRegion()
	 */
	EndpointBuilder region(String region);
	
	/**
	 * @see Endpoint#getPublicURL()
	 */
	EndpointBuilder publicURL(URI publicURL);
	
	/**
	 * @see Endpoint#getInternalURL()
	 */
	EndpointBuilder internalURL(URI internalURL);
	
	/**
	 * @see Endpoint#getTenantId()
	 */
	EndpointBuilder tenantId(String tenantId);
	
	/**
	 * @see Endpoint#getType()
	 */
	EndpointBuilder type(String type);
	
	/**
	 * @see Endpoint#getId()
	 */
	EndpointBuilder id(String id);
	
	/**
	 * @see Endpoint#getName()
	 */
	EndpointBuilder name(String name);
	
	/**
	 * @see Endpoint#getAdminURL()
	 */
	EndpointBuilder adminURL(URI adminURL);
	
	/**
	 * @see Endpoint#getVersionInfo()
	 */
	EndpointBuilder versionInfo(URI versionInfo);
	
	/**
	 * @see Endpoint#getVersionList()
	 */
	EndpointBuilder versionList(URI versionList);
	
}
