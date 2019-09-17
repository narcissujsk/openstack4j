package com.github.narcissujsk.model.gbp.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.gbp.PolicyAction;
import com.github.narcissujsk.model.gbp.PolicyAction.PolicyActionProtocol;
/**
 * A builder which produces a Policy Action Create object
 * 
 * @author vinod borole
 */
public interface PolicyActionCreateBuilder extends Builder<PolicyActionCreateBuilder, PolicyAction> {
    PolicyActionCreateBuilder name(String name);
    PolicyActionCreateBuilder description(String description);
    PolicyActionCreateBuilder actionType(PolicyActionProtocol actionType);
    PolicyActionCreateBuilder shared(boolean shared);
}
  