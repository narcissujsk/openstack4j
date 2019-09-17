package com.github.narcissujsk.openstack.heat.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import com.github.narcissujsk.api.heat.SoftwareConfigService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.heat.SoftwareConfig;
import com.github.narcissujsk.openstack.heat.domain.HeatSoftwareConfig;
import com.github.narcissujsk.openstack.heat.internal.BaseHeatServices;

/**
 * Software Configuration Service for HEAT Orchestration
 * 
 * @author Jeremy Unruh
 */
public class SoftwareConfigServiceImpl extends BaseHeatServices implements SoftwareConfigService {

    private static final String BASE_URI = "/software_configs";
    
    /**
     * {@inheritDoc}
     */
    @Override
    public SoftwareConfig create(SoftwareConfig sc) {
        checkNotNull(sc);
        return post(HeatSoftwareConfig.class, BASE_URI).entity(sc).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SoftwareConfig show(String configId) {
        checkNotNull(configId);
        return get(HeatSoftwareConfig.class, uri(BASE_URI+"/%s", configId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String configId) {
        checkNotNull(configId);
        return deleteWithResponse(uri(BASE_URI+"/%s", configId)).execute();
    }

}
