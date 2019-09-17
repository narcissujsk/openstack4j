package com.github.narcissujsk.openstack.trove.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;


/**
 * Trove services
 *
 * @author sumit gandhi
 */

public class BaseTroveServices extends BaseOpenStackService {

    protected BaseTroveServices() {
        super(ServiceType.DATABASE);
    }

}
