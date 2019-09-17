package com.github.narcissujsk.model.common;


import com.github.narcissujsk.model.common.IdEntity;

/**
 * A basic resource that captures an Id and Name of the resource
 * 
 * @author Jeremy Unruh
 */
public interface BasicResource extends IdEntity {

	/**
	 * @return the name for this resource
	 */
	String getName();
	
	/**
	 * Sets the name for this resource
	 * 
	 * @param name the name to set
	 */
	void setName(String name);
	
}
