package org.openstack4j.api.baremetal;

import org.openstack4j.common.RestService;
import org.openstack4j.model.baremetal.Node;
import org.openstack4j.model.baremetal.Port;

import java.util.List;


public interface IronicPortService extends RestService {

	List<? extends Port> list();
	

	Port get(String uuid);
	

	
}
