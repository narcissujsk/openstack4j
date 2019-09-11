package org.openstack4j.model.baremetal;
import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.baremetal.builder.IronicPortBuilder;
import org.openstack4j.model.common.Link;

import java.util.List;

public interface Port extends ModelEntity, Buildable<IronicPortBuilder> {

    String getUuid();

    String getNodeUuid();


    String getAddress();


	List<? extends Link> getLinks();




}
