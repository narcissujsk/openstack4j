package com.github.narcissujsk.api.compute.ext;


import java.util.List;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.compute.ext.AvailabilityZone;

/**
 * API which supports the "os-availability-zone" extension.  
 * 
 * @author octopus zhang
 */
public interface ZoneService extends RestService {

	/**
	 * List availability zone info .
	 *  
	 * NOTE: This is an extension and not all deployments support os-availability-zone
	 *  
	 * @return the available zones in brief form
	 */
	List<? extends AvailabilityZone> list();
	
	/**
     * List availability zone info .
     *  
     * NOTE: This is an extension and not all deployments support os-availability-zone
     *  
     * @param detailed if true (admin only) details information will be populated
     * @return the available zones resolved to the specified {@code detailed} param
     */
    List<? extends AvailabilityZone> list(boolean detailed);
}
