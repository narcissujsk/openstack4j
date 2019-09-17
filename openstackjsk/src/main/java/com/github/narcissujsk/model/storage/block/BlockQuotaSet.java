package com.github.narcissujsk.model.storage.block;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.storage.block.builder.BlockQuotaSetBuilder;

/**
 * An OpenStack Quota-Set
 *
 * @author Jeremy Unruh
 */
public interface BlockQuotaSet extends ModelEntity, Buildable<BlockQuotaSetBuilder> {

    /**
     * @return the identifier
     */
    String getId();

    /**
     *
     * @return the Snapshots.
     */
    int getSnapshots();

    /**
     *
     * @return the Volumes
     */
    int getVolumes();

    /**
     *
     * @return the gigabytes
     */
    int getGigabytes();
}
