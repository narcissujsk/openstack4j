package com.github.narcissujsk.openstack.senlin.internal;

import com.github.narcissujsk.api.senlin.SenlinPolicyTypeService;
import com.github.narcissujsk.model.senlin.PolicyType;
import com.github.narcissujsk.openstack.senlin.domain.SenlinPolicyType;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class contains getters for all implementation of the available policy-type services
 * 
 * @author lion
 */
public class SenlinPolicyTypeServiceImpl extends BaseSenlinServices implements SenlinPolicyTypeService {

	@Override
	public List<? extends PolicyType> list() {
		return get(SenlinPolicyType.PolicyType.class, uri("/policy-types")).execute().getList();
	}

	@Override
	public PolicyType get(String policyType) {
		checkNotNull(policyType);
		return get(SenlinPolicyType.class, uri("/policy-types/%s", policyType)).execute();
	}
}
