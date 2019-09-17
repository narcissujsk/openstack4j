package com.github.narcissujsk.api.storage;

import com.github.narcissujsk.api.storage.ObjectStorageAccountService;
import com.github.narcissujsk.api.storage.ObjectStorageContainerService;
import com.github.narcissujsk.api.storage.ObjectStorageObjectService;
import com.github.narcissujsk.common.RestService;

/**
 * OpenStack Object Storage service
 * 
 * @author Jeremy Unruh
 */
public interface ObjectStorageService extends RestService {

    /**
     * The Object Storage Account Service
     * 
     * @return the account service
     */
    ObjectStorageAccountService account();
    
    /**
     * The Object Storage Container Service
     * 
     * @return the container service
     */
    ObjectStorageContainerService containers();
    
    /**
     * The Object Storage file and directory service
     * 
     * @return the object service
     */
    ObjectStorageObjectService objects();
}