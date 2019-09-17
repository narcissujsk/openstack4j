package com.github.narcissujsk.model.heat.builder;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.heat.Template;


/**
 * This interface describes a builder for {@link Template} objects 
 * @author Matthias Reisser
 *
 */
public interface TemplateBuilder extends Buildable.Builder<TemplateBuilder, Template>{
	
	/**
	 * Sets the template in JSON format. This value takes precedence over the template URL if both are supplied.
	 * 
	 * @param template template in JSON format
	 * @return modified TemplateBuilder
	 */
	TemplateBuilder templateJson(String template);
	
	
	/**
	 * The URL of the template to instantiate. This value is ignored if the template is supplied inline
	 * 
	 * @param templateURL the template URL
	 * @return TemplateBuilder
	 */
	TemplateBuilder templateURL(String templateURL);

}
