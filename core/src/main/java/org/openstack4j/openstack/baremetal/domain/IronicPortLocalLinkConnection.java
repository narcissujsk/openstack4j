package org.openstack4j.openstack.baremetal.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openstack4j.model.baremetal.LocalLinkConnection;

/**
 * @program: openstack4j-core
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-12 09:43
 **/
@JsonIgnoreProperties(ignoreUnknown=true)
public class IronicPortLocalLinkConnection implements LocalLinkConnection {

    @JsonProperty("port_id")
    public String portId;

    @JsonProperty("switch_id")
    public  String switchId;

    @JsonProperty("switch_info")
    public String switchInfo;

    @Override
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    @Override
    public String getSwitchId() {
        return switchId;
    }

    public void setSwitchId(String switchId) {
        this.switchId = switchId;
    }

    @Override
    public String getSwitchInfo() {
        return switchInfo;
    }

    public void setSwitchInfo(String switchInfo) {
        this.switchInfo = switchInfo;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this.portId;
    }
}
