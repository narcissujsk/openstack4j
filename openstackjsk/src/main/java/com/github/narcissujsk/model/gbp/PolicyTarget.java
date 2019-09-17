package com.github.narcissujsk.model.gbp;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.common.Resource;
import com.github.narcissujsk.model.gbp.builder.PolicyTargetBuilder;

/**
 * Policy Target Model Entity
 * 
 * @author vinod borole
 */
public interface PolicyTarget extends Resource, Buildable<PolicyTargetBuilder> {

    /**
     * Gets the Port Id
     *
     * @return the Port Id
     */
    String getPortId();

    /**
     * Gets the Policy Target Group Id
     *
     * @return the Policy Target Group Id
     */
    String getPolicyTargetGroupId();

    /**
     * Gets the cluster Id
     *
     * @return the cluster Id
     */
    String getClusterId();

    /**
     * Gets the description
     *
     * @return the description
     */
    String getDescription();

}
 