package com.github.narcissujsk.openstack.workflow.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;


/**
 * Base class for all Mistral services.
 *
 * @author Renat Akhmerov
 */

class BaseMistralService extends BaseOpenStackService {
    BaseMistralService() {
        super(ServiceType.WORKFLOW);
    }
}
