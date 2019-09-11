package org.openstack4j.api.baremetal;

import org.openstack4j.api.compute.*;
import org.openstack4j.api.compute.ext.*;
import org.openstack4j.common.RestService;
import org.openstack4j.model.common.Extension;

import java.util.List;

/**
 * Compute (Nova) Operations API
 * 
 * @author Jeremy Unruh
 */
public interface BaremetalService extends RestService {

	/**
	 * Flavor Service API
	 *
	 * @return the flavor service
	 */
    NodeService nodes();

    IronicPortService ports();


}
