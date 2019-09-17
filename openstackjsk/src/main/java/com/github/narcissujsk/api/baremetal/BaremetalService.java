package com.github.narcissujsk.api.baremetal;

import com.github.narcissujsk.api.compute.*;
import com.github.narcissujsk.api.compute.ext.*;
import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.common.Extension;

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
