package com.github.narcissujsk.openstack.manila.internal;

import com.github.narcissujsk.api.manila.SchedulerStatsService;
import com.github.narcissujsk.model.manila.BackendStoragePool;
import com.github.narcissujsk.openstack.manila.domain.ManilaBackendStoragePool;

import java.util.List;

public class SchedulerStatsServiceImpl extends BaseShareServices implements SchedulerStatsService {
    @Override
    public List<? extends BackendStoragePool> pools() {
        return list(false);
    }

    @Override
    public List<? extends BackendStoragePool> poolsDetail() {
        return list(true);
    }

    private List<? extends BackendStoragePool> list(boolean detail) {
        return get(ManilaBackendStoragePool.BackendStoragePools.class, uri("/scheduler-stats/pools" +  (detail ? "/detail" : "")))
                .execute()
                .getList();
    }
}
