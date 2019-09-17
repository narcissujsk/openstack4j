package com.github.narcissujsk.model.compute;

import java.util.Date;

import com.github.narcissujsk.model.ModelEntity;

/**
 * Represents a Fault with the Nova OpenStack service
 * 
 * @author Jeremy Unruh
 */
public interface Fault extends ModelEntity {

	/**
	 * @return the fault code
	 */
	int getCode();

	/**
	 * @return the message of the fault
	 */
	String getMessage();

	/**
	 * @return details for the fault
	 */
	String getDetails();

	/**
	 * @return the date the fault was created
	 */
	Date getCreated();
	
}
