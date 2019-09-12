package org.openstack4j.model.baremetal;

import org.openstack4j.model.ModelEntity;

public interface LocalLinkConnection extends ModelEntity {

    public String getPortId();

    public String getSwitchId();

    public String getSwitchInfo();

}
