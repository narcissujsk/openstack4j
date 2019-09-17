package com.github.narcissujsk.model.compute;

import com.github.narcissujsk.model.ModelEntity;

/**
 * An OpenStack Flavor Access for tenants
 * 
 * @author Moodpo
 */
public interface FlavorAccess extends ModelEntity{
	
	/**
	 * @return the id for this flavor
	 */
	String getFlavorId();
	
	/**
	 * @return the id for this tenant
	 */
	String getTenantId();
	
}
