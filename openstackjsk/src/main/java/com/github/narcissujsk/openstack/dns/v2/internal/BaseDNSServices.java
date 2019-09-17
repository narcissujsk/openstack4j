package com.github.narcissujsk.openstack.dns.v2.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

public class BaseDNSServices extends BaseOpenStackService {

	protected BaseDNSServices() {
		super(ServiceType.DNS, EnforceVersionToURL.instance("/v2"));
	}
}