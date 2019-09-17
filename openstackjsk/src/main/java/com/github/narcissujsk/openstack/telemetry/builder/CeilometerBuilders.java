package com.github.narcissujsk.openstack.telemetry.builder;


import com.github.narcissujsk.model.telemetry.builder.*;
import com.github.narcissujsk.openstack.telemetry.domain.*;

/**
 * The Ceilometer V3 Builders
 */
public class CeilometerBuilders implements TelemetryBuilders {

    @Override
    public AlarmBuilder alarm() {
        return CeilometerAlarm.builder();
    }
}
