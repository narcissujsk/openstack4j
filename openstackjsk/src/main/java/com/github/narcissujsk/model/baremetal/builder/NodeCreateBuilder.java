package com.github.narcissujsk.model.baremetal.builder;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.baremetal.*;

/**
 * Builds a Server used for a Create Action
 * @author Jeremy Unruh
 */
public interface NodeCreateBuilder extends Buildable.Builder<NodeCreateBuilder, NodeCreate> {

    /**
     * @see Node#getName()
     */
    NodeCreateBuilder name(String name);


    NodeCreateBuilder driver(String driver);


}
