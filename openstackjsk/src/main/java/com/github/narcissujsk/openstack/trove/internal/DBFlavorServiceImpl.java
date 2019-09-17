package com.github.narcissujsk.openstack.trove.internal;

import com.github.narcissujsk.api.trove.InstanceFlavorService;
import com.github.narcissujsk.model.trove.Flavor;
import com.github.narcissujsk.openstack.trove.domain.TroveInstanceFlavor;
import com.github.narcissujsk.openstack.trove.domain.TroveInstanceFlavor.Flavors;
import com.github.narcissujsk.openstack.trove.internal.BaseTroveServices;

import java.util.List;

/**
 * Flavor API Implementation
 *
 * @author sumit gandhi
 */
public class DBFlavorServiceImpl extends BaseTroveServices implements InstanceFlavorService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Flavor> list() {
        return get(Flavors.class, uri("/flavors")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flavor get(String id) {
        return get(TroveInstanceFlavor.class, uri("/flavors/%s", id)).execute();
    }

}
