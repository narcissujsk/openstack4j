package org.openstack4j.api.baremetal;

import org.openstack4j.common.RestService;
import org.openstack4j.model.baremetal.*;
import org.openstack4j.model.common.ActionResponse;

import java.util.List;


public interface IronicPortService extends RestService {

	List<? extends Port> list();
	List<? extends Port> list(boolean detail);

	Port get(String uuid);

    public Port create(Port port);

    ActionResponse delete(String uuid);
}
