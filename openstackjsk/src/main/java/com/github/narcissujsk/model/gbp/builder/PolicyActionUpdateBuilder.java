package com.github.narcissujsk.model.gbp.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.gbp.PolicyActionUpdate;
/**
 * A builder which produces a Policy Action Update object
 * 
 * @author vinod borole
 */
public interface PolicyActionUpdateBuilder extends Builder<PolicyActionUpdateBuilder, PolicyActionUpdate>{
    PolicyActionUpdateBuilder name(String name);
    PolicyActionUpdateBuilder description(String description);
    PolicyActionUpdateBuilder shared(boolean shared);
}
