package com.github.narcissujsk.model.gbp;

import java.util.List;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.common.Resource;
import com.github.narcissujsk.model.gbp.builder.ExternalSegmentBuilder;
import com.github.narcissujsk.openstack.gbp.domain.GbpExternalRoutes;
/**
 * External Segment Model Entity
 * 
 * @author vinod borole
 */
public interface ExternalSegment extends Resource, Buildable<ExternalSegmentBuilder> {

    /**
     * Gets the external policies
     *
     * @return the external policies
     */
    List<String> getExternalPolicies();

    /**
     * Gets the Ip version
     *
     * @return the Ip version
     */
    int getIpVersion();

    /**
     * Gets the cidr
     *
     * @return the cidr
     */
    String getCidr();

    /**
     * Gets the description
     *
     * @return the description
     */
    String getDescription();

    /**
     * Is external segment shared
     *
     * @return the true if shared and false if not shared
     */
    boolean isShared();

    /**
     * Gets the subnet Id
     *
     * @return the subnet Id
     */
    String getSubnetId();

    /**
     * Gets the L3 policies
     *
     * @return the L3 Policies
     */
    List<String> getL3Policies();

    /**
     * Gets Is Port address Transalation
     *
     * @return True or False
     */
    boolean isPortAddressTranslation();

    /**
     * Gets the list of external routes
     *
     * @return the list of external routes
     */
    List<GbpExternalRoutes> getExternalRoutes();

    /**
     * Gets the list of nat pools
     *
     * @return the list of nat pools
     */
    List<String> getNatpools();

}
 