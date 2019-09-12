package org.openstack4j.openstack.baremetal.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.openstack4j.model.baremetal.Port;
import org.openstack4j.model.baremetal.builder.IronicPortBuilder;
import org.openstack4j.model.common.Link;
import org.openstack4j.model.network.builder.PortBuilder;
import org.openstack4j.openstack.common.GenericLink;
import org.openstack4j.openstack.networking.domain.NeutronPort;

import java.util.List;

/**
 * @program: openstack4j-core
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-11 16:19
 **/
@JsonIgnoreProperties(ignoreUnknown=true)
public class IronicPort implements Port {

    @JsonProperty("uuid")
    public String uuid;
    @JsonProperty("address")
    public String address;

    @JsonProperty("created_at")
    public String createdAt;

    @JsonProperty("updated_at")
    public String updatedAt;

    @JsonProperty("physical_network")
    public String physicalNetwork;

    @JsonProperty("portgroup_uuid")
    public String portgroupUuid;

    @JsonProperty("node_uuid")
    public String nodeUuid;

    public List<GenericLink> links;



    @JsonProperty("pxe_enabled")
    public boolean pxeEnabled;

    @JsonProperty("extra")
    public JSONObject extra;

    @JsonProperty("internal_info")
    public JSONObject internalInfo;

    @JsonProperty("local_link_connection")
    public IronicPortLocalLinkConnection localLinkConnection;

    @Override
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String getPhysicalNetwork() {
        return physicalNetwork;
    }

    public void setPhysicalNetwork(String physicalNetwork) {
        this.physicalNetwork = physicalNetwork;
    }

    @Override
    public String getPortgroupUuid() {
        return portgroupUuid;
    }

    public void setPortgroupUuid(String portgroupUuid) {
        this.portgroupUuid = portgroupUuid;
    }


    public boolean isPxeEnabled() {
        return pxeEnabled;
    }

    public void setPxeEnabled(boolean pxeEnabled) {
        this.pxeEnabled = pxeEnabled;
    }

    @Override
    public JSONObject getExtra() {
        return extra;
    }

    public void setExtra(JSONObject extra) {
        this.extra = extra;
    }

    @Override
    public JSONObject getInternalInfo() {
        return internalInfo;
    }

    public void setInternalInfo(JSONObject internalInfo) {
        this.internalInfo = internalInfo;
    }

    @Override
    public IronicPortLocalLinkConnection getLocalLinkConnection() {
        return localLinkConnection;
    }

    @Override
    public boolean getPxeEnabled() {
        return pxeEnabled;
    }

    public void setLocalLinkConnection(IronicPortLocalLinkConnection localLinkConnection) {
        this.localLinkConnection = localLinkConnection;
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getNodeUuid() {
        return nodeUuid;
    }

    public void setNodeUuid(String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }

    @Override
    public List<GenericLink> getLinks() {
        return links;
    }

    public void setLinks(List<GenericLink> links) {
        this.links = links;
    }

    public static IronicPortBuilder builder() {
         return new IronicPortConcreteBuilder();
    }

    @Override
    public IronicPortBuilder toBuilder() {
        return new IronicPortConcreteBuilder(this);
    }
    public static class IronicPortConcreteBuilder implements IronicPortBuilder {

        private IronicPort m;

        IronicPortConcreteBuilder() {
            this(new IronicPort());
        }

        IronicPortConcreteBuilder(IronicPort model) {
            this.m = model;
        }

        @Override
        public IronicPort build() {
            return m;
        }

        @Override
        public IronicPortBuilder from(Port in) {
            m = (IronicPort) in;
            return this;
        }

        @Override
        public IronicPortBuilder address(String address) {
            m.address = address;
            return this;
        }

        @Override
        public IronicPortBuilder nodeUuid(String nodeUuid) {
            m.nodeUuid = nodeUuid;
            return this;
        }
    }
    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this.uuid;
    }
}
