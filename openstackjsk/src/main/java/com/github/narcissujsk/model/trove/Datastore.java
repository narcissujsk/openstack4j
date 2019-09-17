package com.github.narcissujsk.model.trove;

import java.util.List;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.openstack.trove.domain.TroveDatastoreVersion;

/**
 * Datastore Model Entity
 *
 * @author sumit gandhi
 */
public interface Datastore extends ModelEntity {

    String getName();

    String getId();

    String getDefault_version();

    List<TroveDatastoreVersion> getTroveDatastoreVersionList();
}
