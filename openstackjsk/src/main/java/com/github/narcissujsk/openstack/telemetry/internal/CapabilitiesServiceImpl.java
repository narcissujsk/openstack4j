package com.github.narcissujsk.openstack.telemetry.internal;

import com.github.narcissujsk.api.telemetry.CapabilitiesService;
import com.github.narcissujsk.model.telemetry.Capabilities;
import com.github.narcissujsk.openstack.telemetry.domain.CeilometerCapabilities;

/**
 * Provides Measurements for Telemetry capabilities within an OpenStack deployment
 * 
 * @author Shital Patil
 */
public class CapabilitiesServiceImpl extends BaseTelemetryServices implements CapabilitiesService {

    /**
     * {@inheritDoc}
     */
    @Override
    public Capabilities get() {
        CeilometerCapabilities capabilities = get(CeilometerCapabilities.class, uri("/capabilities")).execute();
        return capabilities;
    }

}
