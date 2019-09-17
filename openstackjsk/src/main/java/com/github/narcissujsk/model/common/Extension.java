package com.github.narcissujsk.model.common;

import java.net.URI;
import java.util.Date;
import java.util.List;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.common.Link;

/**
 * Represents an Extension which adds additional functionality to the OpenStack API
 * 
 * @author Jeremy Unruh
 */
public interface Extension extends ModelEntity {

	/**
	 * @return the name of the extension
	 */
	String getName();
	
	/**
	 * @return the namespace of this extension
	 */
	URI getNamespace();
	
	/**
	 * @return the alias which is used within RestFul and other operational calls
	 */
	String getAlias();
	
	/**
	 * @return when the extension was last updated
	 */
	Date getUpdated();
	
	/**
	 * @return the description of this extension
	 */
	String getDescription();
	
	/**
	 * @return the additional information and documentation based links for this extension
	 */
	List<? extends Link> getLinks();
}
