package com.github.narcissujsk.openstack.heat.internal;


import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.heat.EventsService;
import com.github.narcissujsk.api.heat.HeatService;
import com.github.narcissujsk.api.heat.ResourcesService;
import com.github.narcissujsk.api.heat.SoftwareConfigService;
import com.github.narcissujsk.api.heat.StackService;
import com.github.narcissujsk.api.heat.TemplateService;
import com.github.narcissujsk.openstack.heat.internal.BaseHeatServices;

/**
 * This class contains getters for all implementation of the available Heat services
 * 
 * @author Matthias Reisser
 */
public class HeatServiceImpl extends BaseHeatServices implements HeatService {

	@Override
	public StackService stacks() {
		return Apis.get(StackService.class);
	}

	@Override
	public TemplateService templates() {
		return Apis.get(TemplateService.class);
	}

	@Override
	public EventsService events() {
		return Apis.get(EventsService.class);
	}

	@Override
	public ResourcesService resources() {
		return Apis.get(ResourcesService.class);
	}

    @Override
    public SoftwareConfigService softwareConfig() {
        return Apis.get(SoftwareConfigService.class);
    }
	

}
