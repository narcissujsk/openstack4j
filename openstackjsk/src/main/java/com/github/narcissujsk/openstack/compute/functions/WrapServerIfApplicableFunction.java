package com.github.narcissujsk.openstack.compute.functions;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.compute.ServerCreate;
import com.github.narcissujsk.openstack.compute.domain.NovaServerCreateWithHintsWrapper;

import com.google.common.base.Function;

/**
 * Wraps a ServerCreate entity to another type if applicable.  For example if a server container scheduler hints
 * this function is responsible for wrapping it in a higher level class to support booting.  
 * 
 * @author Jeremy Unruh
 */
public class WrapServerIfApplicableFunction implements Function<ServerCreate, ModelEntity>{

    public static final WrapServerIfApplicableFunction INSTANCE = new WrapServerIfApplicableFunction();
    
    /**
     * Wraps the ServerCreate if applicable or returns {@code server} if the operation is a no-op
     */
    @Override
    public ModelEntity apply(ServerCreate server) {
        if (server.getSchedulerHints() != null)
            return NovaServerCreateWithHintsWrapper.wrap(server);
        
        return server;
    }

}
