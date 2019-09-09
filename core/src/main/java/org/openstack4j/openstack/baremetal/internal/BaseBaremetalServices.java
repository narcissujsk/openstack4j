package org.openstack4j.openstack.baremetal.internal;

import org.openstack4j.api.types.ServiceType;
import org.openstack4j.core.transport.HttpResponse;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.openstack.compute.domain.actions.ServerAction;
import org.openstack4j.openstack.compute.functions.ToActionResponseFunction;
import org.openstack4j.openstack.internal.BaseOpenStackService;

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
