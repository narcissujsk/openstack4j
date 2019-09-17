package com.github.narcissujsk.openstack.storage.object.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.model.storage.object.SwiftHeaders.ACCOUNT_METADATA_PREFIX;
import static com.github.narcissujsk.model.storage.object.SwiftHeaders.ACCOUNT_REMOVE_METADATA_PREFIX;
import static com.github.narcissujsk.model.storage.object.SwiftHeaders.ACCOUNT_TEMPORARY_URL_KEY;

import java.util.Map;

import com.github.narcissujsk.api.storage.ObjectStorageAccountService;
import com.github.narcissujsk.model.storage.object.SwiftAccount;
import com.github.narcissujsk.openstack.storage.object.functions.MetadataToHeadersFunction;
import com.github.narcissujsk.openstack.storage.object.functions.ParseAccountFunction;

/**
 * The Object Storage Account based services
 * 
 * @author Jeremy Unruh
 */
public class ObjectStorageAccountServiceImpl extends BaseObjectStorageService implements ObjectStorageAccountService {

    /**
     * {@inheritDoc}
     */
    @Override
    public SwiftAccount get() {
        return ParseAccountFunction.INSTANCE.apply(head(Void.class).executeWithResponse());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean updateMetadata(Map<String, String> metadata) {
        checkNotNull(metadata);
        return invokeMetadata(ACCOUNT_METADATA_PREFIX, metadata);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean deleteMetadata(Map<String, String> metadata) {
        checkNotNull(metadata);
        return invokeMetadata(ACCOUNT_REMOVE_METADATA_PREFIX, metadata);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean updateTemporaryUrlKey(String temporaryUrlKey) {
        checkNotNull(temporaryUrlKey);
        return isResponseSuccess(post(Void.class).header(ACCOUNT_TEMPORARY_URL_KEY, temporaryUrlKey).executeWithResponse(), 204);
    }

    private boolean invokeMetadata(String prefix, Map<String, String> metadata) {
        return isResponseSuccess(post(Void.class)
                                  .headers(MetadataToHeadersFunction.create(prefix).apply(metadata))
                                  .executeWithResponse(), 204);
    }
}
