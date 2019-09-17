package com.github.narcissujsk.api.telemetry;

import java.util.List;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.telemetry.Alarm;

/**
 * Provides alarms within an OpenStack deployment
 * 
 * @author Massimiliano Romano
 */
public interface AlarmService extends RestService {

	/**
	 * Return all alarms.
	 * 
	 * @return list of all alarms
	 */
	List<? extends Alarm> list();

	/**
	 * Return a specified alarm
	 * 
	 * @return the alarm
	 */
	Alarm getById(String id);
	
	/**
	 * Update a specified alarm
	 * 
	 */
	void update(String id, Alarm a);
	
	/**
	 * Create an alarm
	 * 
	 */
	Alarm create(Alarm alarm);

	/**
	 * Delete a specified alarm
	 * 
	 */
	ActionResponse delete(String id);
}
