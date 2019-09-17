package com.github.narcissujsk.model.gbp;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.common.Resource;
import com.github.narcissujsk.model.gbp.Direction;
import com.github.narcissujsk.model.gbp.Protocol;
import com.github.narcissujsk.model.gbp.builder.PolicyClassifierBuilder;

/**
 * Policy Classifier Model Entity
 * 
 * @author vinod borole
 */
public interface PolicyClassifier extends Buildable<PolicyClassifierBuilder>, Resource {
    
    /**
     * Is Policy classifier shared
     *
     * @return the true if shared and false if not shared
     */
    boolean isShared();

    /**
     * Gets the Protocol
     *
     * @return the Protocol
     */
    Protocol getProtocol();

    /**
     * Gets the Direction
     *
     * @return the Direction
     */
    Direction getDirection();

    /**
     * Gets the Port range
     *
     * @return the Port range
     */
    String getPortRange();

    /**
     * Gets the description
     *
     * @return the description
     */
    String getDescription();


}
