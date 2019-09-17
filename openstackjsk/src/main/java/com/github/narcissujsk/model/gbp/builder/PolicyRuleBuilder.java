package com.github.narcissujsk.model.gbp.builder;

import java.util.List;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.gbp.PolicyRule;
/**
 * A builder which produces a Policy Rule object
 * 
 * @author vinod borole
 */
public interface PolicyRuleBuilder extends Builder<PolicyRuleBuilder, PolicyRule> {
    PolicyRuleBuilder name(String name);
    PolicyRuleBuilder description(String description);
    PolicyRuleBuilder shared(boolean shared);
    PolicyRuleBuilder classifier(String classifierId);
    PolicyRuleBuilder actions(List<String> actionIds);
}
 