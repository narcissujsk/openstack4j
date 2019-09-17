package com.github.narcissujsk.api.baremetal;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.model.baremetal.*;
import com.github.narcissujsk.model.common.ActionResponse;

import java.util.List;


public interface IronicPortService extends RestService {

	List<? extends Port> list();
	List<? extends Port> list(boolean detail);

	Port get(String uuid);

     Port create(Port port);
    Port update(String portid, List<ArtifactUpdate> update);


    ActionResponse delete(String uuid);
}
