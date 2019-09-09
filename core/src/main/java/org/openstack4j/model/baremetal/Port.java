package org.openstack4j.model.baremetal;
import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.common.Link;
import java.util.List;

public interface Port extends ModelEntity {

    String getUuid();

    String getNodeUid();


    String getMaintenance();

    String getPowerState();

    String getProvisionState();

	List<? extends Link> getLinks();


}
