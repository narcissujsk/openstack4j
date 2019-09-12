package org.openstack4j.api.baremetal;

import org.openstack4j.common.RestService;
import org.openstack4j.model.artifact.ArtifactUpdate;
import org.openstack4j.model.baremetal.*;
import org.openstack4j.model.common.ActionResponse;

import java.util.List;


public interface IronicPortService extends RestService {

	List<? extends Port> list();
	List<? extends Port> list(boolean detail);

	Port get(String uuid);

     Port create(Port port);
    Port update(String portid,List<ArtifactUpdate> update);


    ActionResponse delete(String uuid);
}
