package com.github.narcissujsk.model.tacker.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.tacker.VnfUpdate;
import com.github.narcissujsk.openstack.tacker.domain.VnfUpdateAttributes;

/**
 * A Builder to Update Vnf
 * 
 * @author Vishvesh Deshmukh
 */
public interface VnfUpdateBuilder extends Builder<VnfUpdateBuilder, VnfUpdate> {

	/**
	 * @param attributes : VnfUpdateAttributes
	 * @return VnfUpdateBuilder
	 */
	public VnfUpdateBuilder attributes(VnfUpdateAttributes attributes);
}
