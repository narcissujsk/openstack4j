package com.github.narcissujsk.model.gbp;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.gbp.builder.PolicyActionUpdateBuilder;

/**
 * Policy Action Model Entity
 * 
 * @author vinod borole
 */
public interface PolicyActionUpdate extends ModelEntity, Buildable<PolicyActionUpdateBuilder> {

    /**
     * Is Policy Action shared
     *
     * @return the true if shared and false if not shared
     */
    boolean isShared();

    /**
     * Gets the description
     *
     * @return the description
     */ 
    String getDescription();

    /**
     * Gets the name
     *
     * @return the name
     */ 
    String getName();

}
  