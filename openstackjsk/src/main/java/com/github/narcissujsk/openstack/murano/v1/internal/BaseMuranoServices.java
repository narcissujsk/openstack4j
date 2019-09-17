package com.github.narcissujsk.openstack.murano.v1.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

/**
 * This class is extended by every Murano Service. It is necessary to determine
 * the correct endpoint (url) for murano calls.
 *
 * @author Nikolay Makhotkin
 *
 */
class BaseMuranoServices extends BaseOpenStackService {

    BaseMuranoServices() {
        super(ServiceType.APP_CATALOG, EnforceVersionToURL.instance("/v1", true));
    }

}
