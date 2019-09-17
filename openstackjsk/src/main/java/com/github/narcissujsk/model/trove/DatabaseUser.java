package com.github.narcissujsk.model.trove;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.trove.builder.DatabaseUserBuilder;
import com.github.narcissujsk.openstack.trove.domain.TroveDatabase;

import java.util.List;

/**
 * Database User Model Entity
 *
 * @author sumit gandhi
 */
public interface DatabaseUser extends ModelEntity, Buildable<DatabaseUserBuilder> {

    String getUsername();
    List<TroveDatabase> getTroveDatabaseList();
}
