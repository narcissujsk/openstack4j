package com.github.narcissujsk.openstack.gbp.internal;

import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.gbp.ExternalPolicyService;
import com.github.narcissujsk.api.gbp.ExternalSegmentService;
import com.github.narcissujsk.api.gbp.GbpService;
import com.github.narcissujsk.api.gbp.GroupService;
import com.github.narcissujsk.api.gbp.L2policyService;
import com.github.narcissujsk.api.gbp.L3policyService;
import com.github.narcissujsk.api.gbp.NatPoolService;
import com.github.narcissujsk.api.gbp.NetworkPolicyService;
import com.github.narcissujsk.api.gbp.PolicyActionService;
import com.github.narcissujsk.api.gbp.PolicyClassifierService;
import com.github.narcissujsk.api.gbp.PolicyRuleService;
import com.github.narcissujsk.api.gbp.PolicyRuleSetService;
import com.github.narcissujsk.api.gbp.PolicyTargetService;
import com.github.narcissujsk.api.gbp.ServiceProfileService;
import com.github.narcissujsk.api.gbp.ServicechainService;
import com.github.narcissujsk.openstack.networking.internal.BaseNetworkingServices;
/**
 * GBP services
 * 
 * @author vinod borole
 */
public class GbpServiceImpl extends BaseNetworkingServices implements GbpService {

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalPolicyService externalPolicy() {
        return Apis.get(ExternalPolicyService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalSegmentService externalSegment() {
        return Apis.get(ExternalSegmentService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupService group() { 
        return Apis.get(GroupService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public L2policyService l2Policy() {
        return Apis.get(L2policyService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public L3policyService l3Policy() {
        return Apis.get(L3policyService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NatPoolService natPool() {
        return Apis.get(NatPoolService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkPolicyService networkPolicyService() {
        return Apis.get(NetworkPolicyService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyActionService policyAction() {
        return Apis.get(PolicyActionService.class);
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public PolicyRuleService policyRule() {
        return Apis.get(PolicyRuleService.class);
    }
   /**
    * {@inheritDoc}
    */
    @Override
    public PolicyRuleSetService policyRuleSet() {
        return Apis.get(PolicyRuleSetService.class);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyTargetService policyTarget() {
        return Apis.get(PolicyTargetService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyClassifierService policyClassifier() {
        return Apis.get(PolicyClassifierService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicechainService servicechain() {
        return Apis.get(ServicechainService.class);
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public ServiceProfileService serviceProfile() {
        return Apis.get(ServiceProfileService.class);
    }

}
