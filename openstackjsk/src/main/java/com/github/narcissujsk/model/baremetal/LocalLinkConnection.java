package com.github.narcissujsk.model.baremetal;

import com.github.narcissujsk.model.ModelEntity;

public interface LocalLinkConnection extends ModelEntity {

    public String getPortId();

    public String getSwitchId();

    public String getSwitchInfo();

}
