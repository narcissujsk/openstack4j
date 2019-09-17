package com.github.narcissujsk.model.network.ext;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.network.ext.builder.HealthMonitorAssociateBuilder;

/**
 * An entity used to associate  a healthMonitor with a lb pool
 * 
 * @author liujunpeng
 *
 */
public interface HealthMonitorAssociate extends ModelEntity,
		Buildable<HealthMonitorAssociateBuilder> {

	/**
	 * @return id the healthMonitor identifier
	 */
	public String getId();
}
