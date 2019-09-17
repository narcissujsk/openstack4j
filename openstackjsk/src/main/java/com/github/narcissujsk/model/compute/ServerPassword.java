package com.github.narcissujsk.model.compute;

import com.github.narcissujsk.model.ModelEntity;
/**
 * Server password  
 * 
 * @author vinod borole
 */
public interface ServerPassword  extends ModelEntity {
    /**
     * @return the password of the server
     */
    String getPassword();
}
