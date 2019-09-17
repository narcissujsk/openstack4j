package com.github.narcissujsk.openstack.networking.domain;

import java.util.List;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.network.Subnet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Encapsulates the updateable view for a Subnet within Neutron
 * 
 * @author Jeremy Unruh
 */
@JsonRootName("subnet")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronSubnetUpdate implements ModelEntity {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty
    private String name;
    @JsonProperty("dns_nameservers")
    private List<String> dnsNames;
    @JsonProperty("allocation_pools")
    private List<NeutronPool> pools;
    @JsonProperty("host_routes")
    private List<NeutronHostRoute> hostRoutes;
    @JsonProperty("gateway_ip")
    @JsonInclude
    private String gateway;
    @JsonProperty("enable_dhcp")
    private boolean enabledhcp;
    
    @SuppressWarnings("unchecked")
    public static NeutronSubnetUpdate createFromSubnet(Subnet in) {
        NeutronSubnetUpdate ns = new NeutronSubnetUpdate();
        ns.name = in.getName();
        ns.dnsNames = in.getDnsNames();
        ns.pools = (List<NeutronPool>) in.getAllocationPools();
        ns.hostRoutes = (List<NeutronHostRoute>) in.getHostRoutes();
        ns.gateway = in.getGateway();
        ns.enabledhcp = in.isDHCPEnabled();
        return ns;
    }

}
