package com.github.narcissujsk.openstack.storage.block.builder;


import com.github.narcissujsk.model.storage.block.builder.*;
import com.github.narcissujsk.openstack.storage.block.domain.*;

public class CinderBuilders implements StorageBuilders {

    private CinderBuilders StorageBuilders() {
        return this;
    }

    @Override
    public BlockQuotaSetBuilder blockQuotaSet() {
        return CinderBlockQuotaSet.builder();
    }

    @Override
    public VolumeBuilder volume() {
        return CinderVolume.builder();
    }

    @Override
    public VolumeSnapshotBuilder volumeSnapshot() {
        return CinderVolumeSnapshot.builder();
    }
    
    @Override
    public VolumeBackupCreateBuilder volumeBackupCreate(){
    	return CinderVolumeBackupCreate.builder();
    }
}
