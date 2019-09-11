package org.openstack4j.model.baremetal.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.baremetal.Port;


public interface IronicPortBuilder extends Builder<IronicPortBuilder, Port> {


    IronicPortBuilder address(String address);


    IronicPortBuilder nodeUuid(String nodeUuid);
	

}
