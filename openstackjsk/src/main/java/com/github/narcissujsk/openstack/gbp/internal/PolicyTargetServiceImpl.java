package com.github.narcissujsk.openstack.gbp.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.api.gbp.PolicyTargetService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.gbp.PolicyTarget;
import com.github.narcissujsk.openstack.gbp.domain.GbpPolicyTarget;
import com.github.narcissujsk.openstack.gbp.domain.GbpPolicyTarget.PolicyTargets;
import com.github.narcissujsk.openstack.networking.internal.BaseNetworkingServices;
/**
 * Policy target API Implementation
 * 
 * @author vinod borole
 */
public class PolicyTargetServiceImpl extends BaseNetworkingServices implements PolicyTargetService {

    /**
     * {@inheritDoc}
     */
    @Override 
    public List<? extends PolicyTarget> list() {
        return get(PolicyTargets.class, uri("/grouppolicy/policy_targets")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PolicyTarget> list(Map<String, String> filteringParams) {
        Invocation<PolicyTargets> policytargetsInvocation = buildInvocation(filteringParams);
        return policytargetsInvocation.execute().getList();
    }
    
    private Invocation<PolicyTargets> buildInvocation(Map<String, String> filteringParams) {
        Invocation<PolicyTargets> policytargetsInvocation = get(PolicyTargets.class, "/grouppolicy/policy_targets");
        if (filteringParams == null) { 
            return policytargetsInvocation;
        } 
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                policytargetsInvocation = policytargetsInvocation.param(entry.getKey(), entry.getValue());
            }
        }
        return policytargetsInvocation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyTarget get(String id) {
        checkNotNull(id);
        return get(GbpPolicyTarget.class, uri("/grouppolicy/policy_targets/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/grouppolicy/policy_targets/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyTarget create(PolicyTarget policyTarget) {
        return post(GbpPolicyTarget.class, uri("/grouppolicy/policy_targets")).entity(policyTarget).execute();
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public PolicyTarget update(String policyTargetId, PolicyTarget policyTarget) {
        checkNotNull(policyTargetId);
        checkNotNull(policyTarget);
        return put(GbpPolicyTarget.class, uri("/grouppolicy/policy_targets/%s", policyTargetId)).entity(policyTarget).execute();
     }

}
