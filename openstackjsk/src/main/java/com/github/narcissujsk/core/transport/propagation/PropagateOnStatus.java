package com.github.narcissujsk.core.transport.propagation;

import static com.github.narcissujsk.core.transport.HttpExceptionHandler.mapException;

import com.github.narcissujsk.core.transport.HttpResponse;
import com.github.narcissujsk.core.transport.PropagateResponse;
import com.github.narcissujsk.core.transport.functions.ResponseToActionResponse;
import com.github.narcissujsk.model.common.ActionResponse;

/**
 * Propagates an exception based on the specified Status code
 * 
 * @author Jeremy Unruh
 */
public class PropagateOnStatus implements PropagateResponse {

    private final int statusCode;
    
    private PropagateOnStatus(int statusCode) {
        this.statusCode = statusCode;
    }
    
    public static PropagateOnStatus on(int statusCode) {
        return new PropagateOnStatus(statusCode);
    }
    
    @Override
    public void propagate(HttpResponse response) {
        if (response.getStatus() == statusCode) {
            ActionResponse ar = ResponseToActionResponse.INSTANCE.apply(response);
            throw mapException(ar.getFault(), response.getStatus());
        }
    }

}
