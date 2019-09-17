package com.github.narcissujsk.model.heat;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.heat.builder.TemplateBuilder;

/**
 * This interface describes a template object. 
 * @author Matthias Reisser
 *
 */
public interface Template extends ModelEntity, Buildable<TemplateBuilder> {
	
	/**
	 * Returns the JSON-representation of the template
	 * 
	 * @return the JSON formatted template
	 */
	String getTemplateJson();
	
	/**
	 * The URL of the template to instantiate. This value is ignored if the template is supplied inline.
	 * 
	 * @return the template URL
	 */
	String getTemplateURL();
	
	

}
