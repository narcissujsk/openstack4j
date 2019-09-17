package com.github.narcissujsk.openstack.networking.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;
import com.github.narcissujsk.api.networking.ext.HealthMonitorService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.network.ext.HealthMonitor;
import com.github.narcissujsk.model.network.ext.HealthMonitorUpdate;
import com.github.narcissujsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstack.networking.domain.ext.NeutronHealthMonitor;
import com.github.narcissujsk.openstack.networking.domain.ext.NeutronHealthMonitor.HealthMonitors;
import com.github.narcissujsk.openstack.networking.internal.BaseNetworkingServices;
/**
 *  OpenStack (Neutron) Lbaas healthmonitor based Operations
 * @author liujunpeng
 *
 */
public class HealthMonitorServiceImpl extends BaseNetworkingServices implements
HealthMonitorService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends HealthMonitor> list() {
		return get(HealthMonitors.class, uri("/lb/health_monitors")).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends HealthMonitor> list(Map<String, String> filteringParams) {
		Invocation<HealthMonitors> req = get(HealthMonitors.class, uri("/lb/health_monitors"));
		if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
            	req = req.param(entry.getKey(), entry.getValue());
            }
        }
		return req.execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HealthMonitor get(String healthMonitorId) {
		checkNotNull(healthMonitorId);
		return get(NeutronHealthMonitor.class,uri("/lb/health_monitors/%s",healthMonitorId)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse delete(String healthMonitorId) {
		checkNotNull(healthMonitorId);
		return ToActionResponseFunction.INSTANCE.apply(delete(Void.class,uri("/lb/health_monitors/%s",healthMonitorId)).executeWithResponse());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HealthMonitor create(HealthMonitor healthMonitor) {
		checkNotNull(healthMonitor);
		return post(NeutronHealthMonitor.class,uri("/lb/health_monitors")).entity(healthMonitor).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HealthMonitor update(String healthMonitorId,
			HealthMonitorUpdate healthMonitor) {
		checkNotNull(healthMonitorId);
		checkNotNull(healthMonitor);
		return put(NeutronHealthMonitor.class,uri("/lb/health_monitors/%s",healthMonitorId)).entity(healthMonitor).execute();
	}

}
