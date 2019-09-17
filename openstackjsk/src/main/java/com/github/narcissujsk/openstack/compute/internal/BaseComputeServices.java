package com.github.narcissujsk.openstack.compute.internal;

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
public class BaseComputeServices extends BaseOpenStackService {

    protected BaseComputeServices() {
        super(ServiceType.COMPUTE);
    }

    protected ActionResponse invokeAction(String serverId, ServerAction action)  {
        return ToActionResponseFunction.INSTANCE.apply(invokeActionWithResponse(serverId, action), action.getClass().getName());
    }

    protected HttpResponse invokeActionWithResponse(String serverId, ServerAction action)  {
        HttpResponse response  = post(Void.class, uri("/servers/%s/action", serverId))
                                        .entity(action)
                                        .executeWithResponse();
        return response;
    }

}
