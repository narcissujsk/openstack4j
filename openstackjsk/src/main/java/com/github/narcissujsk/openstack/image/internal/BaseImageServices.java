package com.github.narcissujsk.openstack.image.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

/**
 * Base Image Operations Implementation is responsible for insuring the proper endpoint is used for all extending operation APIs
 * 
 * @author Jeremy Unruh
 */
public class BaseImageServices extends BaseOpenStackService {

	protected BaseImageServices() {
		super(ServiceType.IMAGE, EnforceVersionToURL.instance("/v1", true));
	}
}
