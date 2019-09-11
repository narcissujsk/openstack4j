package org.openstack4j.openstack.baremetal.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    @JsonProperty("node_uuid")
    public String nodeUuid;

    public List<GenericLink> links;


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
            return null;
        }

        @Override
        public IronicPortBuilder nodeUuid(String nodeUuid) {
            return null;
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
