package com.github.narcissujsk.model.workflow.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.workflow.EventTrigger;

/**
 * Builder for a {@link EventTrigger} model class
 * 
 * @author Renat Akhmerov
 */
public interface EventTriggerBuilder extends Builder<EventTriggerBuilder, EventTrigger> {

	/**
	 * @see EventTrigger#getId()
	 */
	EventTriggerBuilder id(String id);

	/**
	 * @see EventTrigger#getName()
	 */
	EventTriggerBuilder name(String name);

	// TODO(rakhmerov): add all methods
}
