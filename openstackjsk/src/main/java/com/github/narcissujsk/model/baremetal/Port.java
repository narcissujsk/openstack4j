package com.github.narcissujsk.model.baremetal;
import net.sf.json.JSONObject;
import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.baremetal.builder.IronicPortBuilder;
import com.github.narcissujsk.model.common.Link;

import java.util.List;

public interface Port extends ModelEntity, Buildable<IronicPortBuilder> {

    String getUuid();

    String getNodeUuid();

    String getPortgroupUuid();

    String getAddress();

    LocalLinkConnection getLocalLinkConnection();

    Boolean getPxeEnabled();

    String getPhysicalNetwork();

	List<? extends Link> getLinks();

	JSONObject getExtra();

    JSONObject getInternalInfo();

    String getCreatedAt();

    String getUpdatedAt();

    Boolean getIsSmartnic();
}
