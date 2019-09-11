package org.openstack4j.api.baremetal;

import org.openstack4j.common.RestService;
import org.openstack4j.model.baremetal.*;
import org.openstack4j.model.baremetal.builder.NodeCreateBuilder;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.compute.builder.ServerCreateBuilder;

import java.util.List;
import java.util.Map;


/**
 * @author jiangsk
 */
public interface NodeService extends RestService {

	List<? extends Node> list();

    List<? extends Node> list(boolean detail);

	Node get(String nodeid);

    Node create(NodeCreate nodeid);

    ActionResponse delete(String nodeid);

    NodeCreateBuilder nodeBuilder();


    ActionResponse power(String nodeid,NodePowerState nodePowerState);

    ActionResponse provision(String nodeid, NodeProvisionState nodeProvisionState);

}
