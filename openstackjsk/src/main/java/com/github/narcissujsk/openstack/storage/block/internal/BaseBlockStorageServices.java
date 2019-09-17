package com.github.narcissujsk.openstack.storage.block.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

/**
 * Base Cinder Service Layer
 *
 * @author Jeremy Unruh
 */
public class BaseBlockStorageServices extends BaseOpenStackService {

	public BaseBlockStorageServices() {
		super(ServiceType.BLOCK_STORAGE);
	}

}
