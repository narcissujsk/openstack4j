package com.github.narcissujsk.openstack.octavia.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

/**
 * Base Networking Operations Implementation is responsible for insuring the proper endpoint is used for all extending operation APIs
 * 
 * @author wei
 */
public class BaseOctaviaServices extends BaseOpenStackService {

	protected BaseOctaviaServices() {
		super(ServiceType.OCTAVIA, EnforceVersionToURL.instance("/v2.0"));
	}
}
