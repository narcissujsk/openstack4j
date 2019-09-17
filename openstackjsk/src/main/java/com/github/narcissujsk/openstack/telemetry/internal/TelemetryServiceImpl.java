package com.github.narcissujsk.openstack.telemetry.internal;

import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.telemetry.AlarmService;
import com.github.narcissujsk.api.telemetry.CapabilitiesService;
import com.github.narcissujsk.api.telemetry.EventService;
import com.github.narcissujsk.api.telemetry.MeterService;
import com.github.narcissujsk.api.telemetry.ResourceService;
import com.github.narcissujsk.api.telemetry.SampleService;
import com.github.narcissujsk.api.telemetry.TelemetryService;

/**
 * Telemetry allows collection of Alarms and Measurements
 * 
 * @author Jeremy Unruh
 */
public class TelemetryServiceImpl implements TelemetryService {

    /**
     * {@inheritDoc}
     */
    @Override
    public MeterService meters() {
        return Apis.get(MeterService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmService alarms() {
        return Apis.get(AlarmService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventService events() {
        return Apis.get(EventService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleService samples() {
        return Apis.get(SampleService.class);
    }

    @Override
    public ResourceService resources() {
        return Apis.get(ResourceService.class);
    }

    @Override
    public CapabilitiesService capabilities() {
        return Apis.get(CapabilitiesService.class);
    }

}
