package com.github.narcissujsk.model.sahara;

import java.util.Map;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.sahara.builder.ServiceConfigBuilder;

/**
 * Service Configuration Model
 *
 * @author Ekasit Kijsipongse
 */
public interface ServiceConfig extends ModelEntity, Buildable<ServiceConfigBuilder> {

    /**
     * @param name the name of the parameter
     * @return the value of the parameter
     */
    Object get(String name);
    
    /**
     * @return map of all configurations or null
     */
    Map<String, Object> getConfigs();
    
}
