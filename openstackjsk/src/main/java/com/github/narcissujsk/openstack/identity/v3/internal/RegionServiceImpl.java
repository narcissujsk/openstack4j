package com.github.narcissujsk.openstack.identity.v3.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.core.transport.ClientConstants.PATH_REGIONS;

import java.util.List;

import com.github.narcissujsk.api.identity.v3.RegionService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.identity.v3.Region;
import com.github.narcissujsk.openstack.identity.v3.domain.KeystoneRegion;
import com.github.narcissujsk.openstack.identity.v3.domain.KeystoneRegion.Regions;

/**
 * Implementation of v3 region service
 *
 */
public class RegionServiceImpl extends BaseIdentityServices implements RegionService {

    @Override
    public Region create(Region region) {
        checkNotNull(region);
        return post(KeystoneRegion.class, uri(PATH_REGIONS)).entity(region).execute();
    }

    @Override
    public Region create(String regionId, String description, String parentRegionId) {
        checkNotNull(regionId);
        checkNotNull(description);
        checkNotNull(parentRegionId);
        return create(KeystoneRegion.builder().id(regionId).description(description).parentRegionId(parentRegionId).build());
    }

    @Override
    public Region get(String regionId) {
        checkNotNull(regionId);
        return get(KeystoneRegion.class, PATH_REGIONS, "/", regionId).execute();
    }

    @Override
    public Region update(Region region) {
        checkNotNull(region);
        return patch(KeystoneRegion.class, PATH_REGIONS, "/", region.getId()).entity(region).execute();
    }

    @Override
    public ActionResponse delete(String regionId) {
        checkNotNull(regionId);
        return deleteWithResponse(PATH_REGIONS, "/", regionId).execute();
    }

    @Override
    public List<? extends Region> list() {
        return get(Regions.class, uri(PATH_REGIONS)).execute().getList();
    }

}
