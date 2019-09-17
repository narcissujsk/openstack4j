package com.github.narcissujsk.openstack.storage.object.internal;

import static com.github.narcissujsk.core.transport.HttpEntityHandler.closeQuietly;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

/**
 * Base OpenStack Storage Service
 * 
 * @author Jeremy Unruh
 */
public class BaseObjectStorageService extends BaseOpenStackService {

    public BaseObjectStorageService() {
        super(ServiceType.OBJECT_STORAGE);
    }
    
    protected boolean isResponseSuccess(HttpResponse res, int status) {
        return isResponseSuccess(res, status, true);
    }
    
    protected boolean isResponseSuccess(HttpResponse res, int status, boolean closeResponse) {
        boolean result = res.getStatus() == status;
        if (closeResponse) {
            closeQuietly(res);
        }
        return result;
    }
}
