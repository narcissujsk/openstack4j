package com.github.narcissujsk.model.storage.block.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.storage.block.VolumeBackupCreate;

public interface VolumeBackupCreateBuilder  extends Builder<VolumeBackupCreateBuilder, VolumeBackupCreate> {
	
 
	VolumeBackupCreateBuilder name(String name);
    
	VolumeBackupCreateBuilder description(String description);
	
	VolumeBackupCreateBuilder volumeId(String volumeId);
 
	VolumeBackupCreateBuilder container(String container);
 
	VolumeBackupCreateBuilder incremental(boolean incremental);

	VolumeBackupCreateBuilder force(boolean force);

	VolumeBackupCreateBuilder snapshotId(String snapshotId);

}
