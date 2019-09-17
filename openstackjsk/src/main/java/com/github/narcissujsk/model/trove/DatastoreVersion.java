package com.github.narcissujsk.model.trove;

import com.github.narcissujsk.model.ModelEntity;

/**
 * Datastore Version Model Entity
 *
 * @author sumit gandhi
 */
public interface DatastoreVersion extends ModelEntity {

    String getName();
    String getId();
    String getDatastoreId();
    int getIsActive();
    String getImage();
    String getPackageName();
}
