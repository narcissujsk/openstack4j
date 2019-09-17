package com.github.narcissujsk.model.baremetal.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.baremetal.Port;


public interface IronicPortBuilder extends Builder<IronicPortBuilder, Port> {


    IronicPortBuilder address(String address);


    IronicPortBuilder nodeUuid(String nodeUuid);
	

}
