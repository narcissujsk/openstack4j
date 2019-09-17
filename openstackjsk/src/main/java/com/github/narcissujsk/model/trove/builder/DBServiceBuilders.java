package com.github.narcissujsk.model.trove.builder;

import com.github.narcissujsk.model.trove.builder.DatabaseBuilder;
import com.github.narcissujsk.model.trove.builder.DatabaseUserBuilder;
import com.github.narcissujsk.model.trove.builder.InstanceCreateBuilder;

public interface DBServiceBuilders {

    InstanceCreateBuilder instanceCreate();

    DatabaseBuilder databaseCreate();

    DatabaseUserBuilder databaseUserCreate();

}
