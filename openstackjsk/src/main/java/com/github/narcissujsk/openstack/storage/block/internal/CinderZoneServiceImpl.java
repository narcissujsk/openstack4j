package com.github.narcissujsk.openstack.storage.block.internal;

import java.util.List;

import com.github.narcissujsk.api.storage.CinderZoneService;
import com.github.narcissujsk.openstack.storage.block.domain.AvailabilityZone;
import com.github.narcissujsk.openstack.storage.block.domain.ExtAvailabilityZone.AvailabilityZones;

public class CinderZoneServiceImpl  extends BaseBlockStorageServices implements CinderZoneService
{

    @Override
    public List<? extends AvailabilityZone> list()
    {
        String uri =  "/os-availability-zone";
        return get(AvailabilityZones.class, uri).execute().getList();
    }


}
