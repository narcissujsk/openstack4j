package com.github.narcissujsk.model.network.ext;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.network.ext.MemberV2;
import com.github.narcissujsk.model.network.ext.builder.MemberV2UpdateBuilder;

/**
 * An entity used to update a member of an lbaas v2 pool
 * @author emjburns
 */
public interface MemberV2Update extends ModelEntity, Buildable<MemberV2UpdateBuilder> {
    /**
     * @see com.github.narcissujsk.model.network.ext.MemberV2#isAdminStateUp()
     */
    public boolean isAdminStateUp();

    /**
     * @see MemberV2#getWeight()
     */
    public Integer getWeight();
}
