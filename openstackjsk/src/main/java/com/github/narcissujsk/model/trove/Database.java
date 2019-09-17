package com.github.narcissujsk.model.trove;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.trove.builder.DatabaseBuilder;

/**
 * Database Model Entity
 *
 * @author sumit gandhi
 */
public interface Database extends ModelEntity, Buildable<DatabaseBuilder> {

    String getName();
    String getDbCharacterSet();
    String getDbCollation();

}
