package com.github.narcissujsk.model.identity.v3.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.identity.v3.Region;

public interface RegionBuilder extends Builder<RegionBuilder, Region> {

    /**
     * @see Region#getId()
     */
    RegionBuilder id(String id);

    /**
     * @see Region#getDescription()
     */
    RegionBuilder description(String description);

    /**
     * @see Region#getParentRegionId()
     */
    RegionBuilder parentRegionId(String parentRegionId);

}
