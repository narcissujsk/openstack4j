package org.openstack4j.api.baremetal;

import org.openstack4j.common.RestService;
import org.openstack4j.model.baremetal.Node;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.compute.Flavor;
import org.openstack4j.model.compute.FlavorAccess;

import java.util.List;
import java.util.Map;


/**
 * @author jiangsk
 */
public interface NodeService extends RestService {

	List<? extends Node> list();

    List<? extends Node> list(boolean detail);

	Node get(String nodeid);

    Node create(String nodeid);
	
}
