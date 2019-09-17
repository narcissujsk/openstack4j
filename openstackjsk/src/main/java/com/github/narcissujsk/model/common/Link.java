package com.github.narcissujsk.model.common;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.common.builder.LinkBuilder;

/**
 * Model for a generic link
 * 
 * @author Jeremy Unruh
 */
public interface Link extends ModelEntity, Buildable<LinkBuilder> {

	/**
	 * @return the relative URL or null
	 */
	String getRel();
	
	/**
	 * @return the href URL
	 */
	String getHref();
	
	/**
	 * @return the type of link or null
	 */
	String getType();
	
}
