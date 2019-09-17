package com.github.narcissujsk.model.network.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.identity.v3.Tenant;
import com.github.narcissujsk.model.network.ExternalGateway;
import com.github.narcissujsk.model.network.Router;

/**
 * A Builder that creates a Router
 * 
 * @author Jeremy Unruh
 */
public interface RouterBuilder extends Builder<RouterBuilder, Router> {

	/**
	 * @see Router#getId()
	 */
	RouterBuilder id(String id);
	
	/**
	 * @see Router#getName()
	 */
	RouterBuilder name(String name);
	
	/**
	 * @see Router#getTenantId()
	 */
	RouterBuilder tenantId(String tenantId);
	
	/**
	 * @see Router#getTenantId()
	 */
	RouterBuilder tenant(Tenant tenant);
	
	/**
	 * @see Router#isAdminStateUp()()
	 */
	RouterBuilder adminStateUp(boolean isAdminStateUp);
	
	/**
	 * @see Router#getExternalGatewayInfo()
	 */
	RouterBuilder externalGateway(String networkId);
	
	/**
	 * @see Router#getExternalGatewayInfo()
	 */
	RouterBuilder externalGateway(String networkId, Boolean enableSNAT);
	
	/**
	 * @see Router#getExternalGatewayInfo()
	 */
	RouterBuilder externalGateway(ExternalGateway externalGateway);
	
	/**
	 * Removes the external gateway from the router during an update operation
	 */
	RouterBuilder clearExternalGateway();

	/**
	 * @see Router#getRoutes()
	 */
	RouterBuilder route(String destination, String nexthop);

	/**
	 * Removes the static routes from the router during an update operation
	 */
	RouterBuilder noRoutes();
	
	/**
	 * 
	 * @param distributed:true indicates a distributed router. It is available when dvr extension is enabled.
	 * @return
	 */
	RouterBuilder distributed(Boolean distributed);
}
