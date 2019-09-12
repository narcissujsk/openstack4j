package org.openstack4j.api.baremetal;

import org.openstack4j.common.RestService;
import org.openstack4j.model.baremetal.*;

import java.util.List;


public interface IronicPortService extends RestService {

	List<? extends Port> list();
	

	Port get(String uuid);

    public Port create(Port port);

}
