package com.github.narcissujsk.api.baremetal;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.model.baremetal.*;
import com.github.narcissujsk.model.baremetal.builder.NodeCreateBuilder;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.compute.builder.ServerCreateBuilder;

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

    Node update(String nodeid, List<ArtifactUpdate> update);

    ActionResponse power(String nodeid, NodePowerState nodePowerState);

    ActionResponse provision(String nodeid, NodeProvisionState nodeProvisionState);

}
