package com.github.narcissujsk.model.tacker;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.tacker.builder.VnfUpdateBuilder;
import com.github.narcissujsk.openstack.tacker.domain.VnfUpdateAttributes;

/**
 * A Builder to Update Firewall of FwaaS
 * 
 * @author Vishvesh Deshmukh
 */
public interface VnfUpdate extends ModelEntity, Buildable<VnfUpdateBuilder> {

	/**
	 * @return attributes : VnfUpdateAttributes
	 */
	VnfUpdateAttributes getAttributes();
}
