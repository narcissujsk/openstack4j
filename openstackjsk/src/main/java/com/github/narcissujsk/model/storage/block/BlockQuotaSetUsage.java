package com.github.narcissujsk.model.storage.block;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.common.QuotaDetails;

/**
 * Block Quota-Set Usage Details
 * 
 * @author Jeremy Unruh
 */
public interface BlockQuotaSetUsage extends ModelEntity {

    /**
     * Usage details for Snapshots
     * 
     * @return usage for snapshots
     */
    QuotaDetails getSnapshots();
    
    /**
     * Usage details for Volumes
     * 
     * @return usage for volumes
     */
    QuotaDetails getVolumes();

    /**
     * Usage details for gigabytes used
     * 
     * @return usage for gigabytes
     */
    QuotaDetails getGigabytes();

}
