package com.github.narcissujsk.model.storage.block;

import com.github.narcissujsk.model.ModelEntity;

public interface VolumeBackupRestore extends ModelEntity{
	
	/**
     * @return the UUID for a backup
     */
    String getBackupId();
	
    /**
     * @return indicates the volume identifier of the volume being transfer
     */
    String getVolumeId();
    
    /**
     * @return the name of the transfer
     */
    String getName();

}
