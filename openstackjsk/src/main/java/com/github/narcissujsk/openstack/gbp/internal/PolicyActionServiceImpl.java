package com.github.narcissujsk.openstack.gbp.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.api.gbp.PolicyActionService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.gbp.PolicyAction;
import com.github.narcissujsk.model.gbp.PolicyActionUpdate;
import com.github.narcissujsk.openstack.gbp.domain.GbpPolicyAction;
import com.github.narcissujsk.openstack.gbp.domain.GbpPolicyAction.PolicyActions;
import com.github.narcissujsk.openstack.networking.internal.BaseNetworkingServices;
/**
 * Policy Action API Implementation
 * 
 * @author vinod borole
 */
public class PolicyActionServiceImpl extends BaseNetworkingServices implements PolicyActionService {

    /**
     * {@inheritDoc}
     */
    @Override 
    public List<? extends PolicyAction> list() {
        return get(PolicyActions.class, uri("/grouppolicy/policy_actions")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PolicyAction> list(Map<String, String> filteringParams) {
        Invocation<PolicyActions> policyactionInvocation = buildInvocation(filteringParams);
        return policyactionInvocation.execute().getList();
    }
    
    private Invocation<PolicyActions> buildInvocation(Map<String, String> filteringParams) {
        Invocation<PolicyActions> policyactionInvocation = get(PolicyActions.class, "/grouppolicy/policy_actions");
        if (filteringParams == null) { 
            return policyactionInvocation;
        } 
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                policyactionInvocation = policyactionInvocation.param(entry.getKey(), entry.getValue());
            }
        }
        return policyactionInvocation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyAction get(String id) {
        checkNotNull(id);
        return get(GbpPolicyAction.class, uri("/grouppolicy/policy_actions/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/grouppolicy/policy_actions/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyAction create(PolicyAction policyAction) {
        return post(GbpPolicyAction.class, uri("/grouppolicy/policy_actions")).entity(policyAction).execute();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyAction update(String policyActionId, PolicyActionUpdate policyAction) {
        checkNotNull(policyActionId);
        checkNotNull(policyAction);
        return put(GbpPolicyAction.class, uri("/grouppolicy/policy_actions/%s", policyActionId)).entity(policyAction).execute();
    }

}
