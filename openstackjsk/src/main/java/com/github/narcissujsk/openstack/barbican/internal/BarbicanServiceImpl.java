package com.github.narcissujsk.openstack.barbican.internal;

import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.barbican.BarbicanService;
import com.github.narcissujsk.api.barbican.ContainerService;
import com.github.narcissujsk.api.barbican.SecretService;

/**
 * This class contains getters for all implementation of the available Barbican services
 */
public class BarbicanServiceImpl extends BaseBarbicanServices implements BarbicanService {

    @Override
    public ContainerService containers() {
        return Apis.get(ContainerService.class);
    }

    @Override
    public SecretService secrets() { return Apis.get(SecretService.class); }
}
