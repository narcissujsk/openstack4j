package com.github.narcissujsk.openstack.baremetal.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.core.transport.HttpResponse;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.openstack.compute.domain.actions.ServerAction;
import com.github.narcissujsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

/**
 * Base class for Computer / Nova services
 * 
 * @author Jeremy Unruh
 */
public class BaseBaremetalServices extends BaseOpenStackService {

    protected BaseBaremetalServices() {
        super(ServiceType.BAREMETAL);
    }



}
