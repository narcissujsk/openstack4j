package com.github.narcissujsk.openstack.gbp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.model.gbp.NetworkServicePolicy;
import com.github.narcissujsk.model.gbp.PolicyTargetGroup;
import com.github.narcissujsk.model.gbp.builder.NetworkServicePolicyBuilder;
import com.github.narcissujsk.openstack.common.ListResult;
import com.github.narcissujsk.openstack.gbp.domain.GbpNetworkServiceParams;

import java.util.List;

/**
 * Created by sumit gandhi on 7/4/2016.
 */

@JsonRootName("network_service_policy")
public class GbpNetworkServicePolicy implements NetworkServicePolicy {
    private static final long serialVersionUID = 1L;
    private String name;
    private String id;
    private String description;
    private boolean shared;
    @JsonProperty("tenant_id")
    private String tenantId;
    @JsonProperty("network_service_params")
    private List<com.github.narcissujsk.openstack.gbp.domain.GbpNetworkServiceParams> gbpNetworkServiceParamsList;
    @JsonProperty("policy_target_groups")
    private List<PolicyTargetGroup> policyTargetGroupList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) { this.id = id; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public List<com.github.narcissujsk.openstack.gbp.domain.GbpNetworkServiceParams> getGbpNetworkServiceParamsList() {
        return gbpNetworkServiceParamsList;
    }

    public void setGbpNetworkServiceParamsList(List<com.github.narcissujsk.openstack.gbp.domain.GbpNetworkServiceParams> gbpNetworkServiceParamsList) {
        this.gbpNetworkServiceParamsList = gbpNetworkServiceParamsList;
    }

    public List<PolicyTargetGroup> getPolicyTargetGroupList() {
        return policyTargetGroupList;
    }

    @Override
    public NetworkServicePolicyBuilder toBuilder() {
        return new NetworkServicePolicyConcreteBuilder();
    }

    public static class NetworkServicePolicies extends ListResult<GbpNetworkServicePolicy> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("network_service_policies")
        private List<GbpNetworkServicePolicy> gbpNetworkServicePolicyList;

        @Override
        protected List<GbpNetworkServicePolicy> value() {
            return gbpNetworkServicePolicyList;
        }

    }

    public static class NetworkServicePolicyConcreteBuilder implements NetworkServicePolicyBuilder {

        private GbpNetworkServicePolicy networkServicePolicy;

        public NetworkServicePolicyConcreteBuilder(GbpNetworkServicePolicy gbpServicePolicy) {
            this.networkServicePolicy = gbpServicePolicy;
        }

        public NetworkServicePolicyConcreteBuilder() {
            this(new GbpNetworkServicePolicy());
        }

        @Override
        public NetworkServicePolicy build() {
            return networkServicePolicy;
        }

        @Override
        public NetworkServicePolicyBuilder from(NetworkServicePolicy in) {
            this.networkServicePolicy=(GbpNetworkServicePolicy) in;
            return this;
        }

        @Override
        public NetworkServicePolicyBuilder name(String name) {
            this.networkServicePolicy.name=name;
            return this;
        }

        @Override
        public NetworkServicePolicyBuilder description(String description) {
            this.networkServicePolicy.description=description;
            return this;
        }

        @Override
        public NetworkServicePolicyBuilder isShared(boolean shared) {
            this.networkServicePolicy.shared=shared;
            return this;
        }

        @Override
        public NetworkServicePolicyBuilder gbpNetworkServiceParams(List<GbpNetworkServiceParams> gbpNetworkServiceParamsList) {
            this.networkServicePolicy.gbpNetworkServiceParamsList=gbpNetworkServiceParamsList;
            return this;
        }

    }

    public static NetworkServicePolicyBuilder builder() {
        return new NetworkServicePolicyConcreteBuilder();
    }
}
