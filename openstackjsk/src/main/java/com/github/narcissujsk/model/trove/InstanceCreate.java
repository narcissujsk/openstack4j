package com.github.narcissujsk.model.trove;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.trove.Datastore;
import com.github.narcissujsk.model.trove.builder.InstanceCreateBuilder;

public interface InstanceCreate extends ModelEntity, Buildable<InstanceCreateBuilder> {

    void setFlavor(String flavorRef);

    void setName(String name);

    void setDatastore(Datastore datastore);

    void setVolumetype(String volumeType);

    void setvolumeSize(int size);
}
