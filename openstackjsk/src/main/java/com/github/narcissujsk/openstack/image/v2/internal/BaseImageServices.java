package com.github.narcissujsk.openstack.image.v2.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

/**
 * @author emjburns
 */
public class BaseImageServices extends BaseOpenStackService {

    protected BaseImageServices() {
        super(ServiceType.IMAGE, EnforceVersionToURL.instance("/v2", true));
    }
}
