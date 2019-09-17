package com.github.narcissujsk.model.telemetry.builder;

import com.github.narcissujsk.model.telemetry.Alarm;
import com.github.narcissujsk.model.telemetry.builder.AlarmBuilder;

/**
 * The Ceilometer builders
 */
public interface TelemetryBuilders {

    /**
     * The builder to create an Alarm
     *
     * @return the image builder
     */
    public AlarmBuilder alarm();

}
