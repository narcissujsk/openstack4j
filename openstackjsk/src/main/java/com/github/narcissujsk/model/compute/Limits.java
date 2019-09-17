package com.github.narcissujsk.model.compute;

import java.util.List;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.compute.AbsoluteLimit;
import com.github.narcissujsk.model.compute.RateLimit;

/**
 * Accounts may be pre-configured with a set of thresholds (or limits) to manage capacity and prevent abuse of the system. 
 * The system recognizes two kinds of limits: rate limits and absolute limits. Rate limits are thresholds that are reset after a 
 * certain amount of time passes. Absolute limits are fixed.
 * 
 * @author Jeremy Unruh
 * @see http://docs.openstack.org/api/openstack-compute/2/content/Limits-d1e846.html
 */
public interface Limits extends ModelEntity {

	/**
	 * @return the rate limits (limits that are reset as X time passes)
	 */
	List<? extends RateLimit> getRate();
	
	/**
	 * @return the absolute fixed layout limits
	 */
	AbsoluteLimit getAbsolute();
	
}
