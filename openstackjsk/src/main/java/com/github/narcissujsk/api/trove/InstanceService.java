package com.github.narcissujsk.api.trove;

import java.util.List;

import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.trove.Instance;
import com.github.narcissujsk.model.trove.InstanceCreate;

public interface InstanceService {

    List<? extends Instance> list();

    Instance get(String instanceId);

    Instance create(InstanceCreate instanceCreate);

    ActionResponse delete(String id);

}
