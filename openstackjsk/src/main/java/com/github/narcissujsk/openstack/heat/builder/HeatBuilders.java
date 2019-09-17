package com.github.narcissujsk.openstack.heat.builder;

import com.github.narcissujsk.model.heat.builder.OrchestrationBuilders;
import com.github.narcissujsk.model.heat.builder.ResourceHealthBuilder;
import com.github.narcissujsk.model.heat.builder.SoftwareConfigBuilder;
import com.github.narcissujsk.model.heat.builder.StackCreateBuilder;
import com.github.narcissujsk.model.heat.builder.StackUpdateBuilder;
import com.github.narcissujsk.model.heat.builder.TemplateBuilder;
import com.github.narcissujsk.openstack.heat.domain.HeatResourceHealth;
import com.github.narcissujsk.openstack.heat.domain.HeatSoftwareConfig;
import com.github.narcissujsk.openstack.heat.domain.HeatStackCreate;
import com.github.narcissujsk.openstack.heat.domain.HeatStackUpdate;
import com.github.narcissujsk.openstack.heat.domain.HeatTemplate;

/**
 * The Orchestration V3 Builders
 */
public class HeatBuilders implements OrchestrationBuilders {

    private OrchestrationBuilders HeatBuilders() {
        return this;
    }

    @Override
    public TemplateBuilder template() {
        return HeatTemplate.build();
    }

    @Override
    public StackCreateBuilder stack() {
        return HeatStackCreate.build();
    }

    @Override
    public SoftwareConfigBuilder softwareConfig() {
        return new HeatSoftwareConfig.Builder();
    }

    @Override
    public StackUpdateBuilder stackUpdate() {
        return HeatStackUpdate.builder();
    }

    @Override
    public ResourceHealthBuilder resourceHealth() {
        return HeatResourceHealth.builder();
    }
}
