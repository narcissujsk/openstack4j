package com.github.narcissujsk.openstack.storage.object.internal;

import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.storage.ObjectStorageAccountService;
import com.github.narcissujsk.api.storage.ObjectStorageContainerService;
import com.github.narcissujsk.api.storage.ObjectStorageObjectService;
import com.github.narcissujsk.api.storage.ObjectStorageService;

/**
 * OpenStack Object Storage service implementation
 * 
 * @author Jeremy Unruh
 */
public class ObjectStorageServiceImpl implements ObjectStorageService {

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectStorageAccountService account() {
        return Apis.get(ObjectStorageAccountService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectStorageContainerService containers() {
        return Apis.get(ObjectStorageContainerService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectStorageObjectService objects() {
        return Apis.get(ObjectStorageObjectService.class);
    }

}
