package org.openstack4j.model.baremetal.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.baremetal.*;

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
