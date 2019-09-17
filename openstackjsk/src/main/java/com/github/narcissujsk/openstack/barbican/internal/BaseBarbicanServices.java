package com.github.narcissujsk.openstack.barbican.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

/**
 * Base class for Barbican / Key Management services
 */
public class BaseBarbicanServices extends BaseOpenStackService {
    protected BaseBarbicanServices() {
        super(ServiceType.BARBICAN, EnforceVersionToURL.instance("/v1"));
    }
}
