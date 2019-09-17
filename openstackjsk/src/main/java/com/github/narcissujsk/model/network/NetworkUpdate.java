package com.github.narcissujsk.model.network;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.network.builder.NetworkUpdateBuilder;

/**
 * An entity used to update a network
 * 
 * @author Jeremy Unruh
 */
public interface NetworkUpdate extends ModelEntity, Buildable<NetworkUpdateBuilder> {

    /**
     * The name of the network
     * 
     * @return the network name
     */
    String getName();
    
    /**
     * The administrative state of the network, which is up (true) or down (false).
     * 
     * @return the admin state up state
     */
    boolean isAdminStateUp();
    
    /**
     * Admin-only. Indicates whether this network is shared across all tenants.
     * 
     * @return true if this network is shared
     */
    boolean isShared();
    
}
