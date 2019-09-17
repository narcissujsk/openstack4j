package com.github.narcissujsk.model.manila;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.manila.builder.ShareNetworkCreateBuilder;

/**
 * Object used to create new share networks
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface ShareNetworkCreate extends ModelEntity, Buildable<ShareNetworkCreateBuilder> {
    /**
     * @return the neutron network ID
     */
    String getNeutronNetId();

    /**
     * @return the neutron subnet ID
     */
    String getNeutronSubnetId();

    /**
     * @return the nova network ID
     */
    String getNovaNetId();

    /**
     * @return the share network name
     */
    String getName();

    /**
     * @return the share network description
     */
    String getDescription();
}
