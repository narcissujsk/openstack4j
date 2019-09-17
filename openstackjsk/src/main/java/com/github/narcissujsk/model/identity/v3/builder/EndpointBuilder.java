package com.github.narcissujsk.model.identity.v3.builder;

import java.net.URL;
import java.util.Map;

import com.github.narcissujsk.api.types.Facing;
import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.identity.v3.Endpoint;

/**
 * A Builder which creates an identity v3 endpoint.
 *
 *
 */
public interface EndpointBuilder extends Builder<EndpointBuilder, Endpoint> {

    /**
     * @see Endpoint#getId()
     */
    EndpointBuilder id(String id);

    /**
     * @see Endpoint#getType()
     */
    EndpointBuilder type(String type);

    /**
     * @see Endpoint#getDescription()
     */
    EndpointBuilder description(String description);

    /**
     * @see Endpoint#getIface()
     */
    EndpointBuilder iface(Facing iface);

    /**
     * @see Endpoint#getServiceId()
     */
    EndpointBuilder serviceId(String serviceId);

    /**
     * @see Endpoint#getName()
     */
    EndpointBuilder name(String name);

    /**
     * @see Endpoint#getRegion()
     */
    EndpointBuilder region(String region);

    /**
     * @see Endpoint#getRegionId()
     */
    EndpointBuilder regionId(String regionId);

    /**
     * @see Endpoint#getUrl()
     */
    EndpointBuilder url(URL url);

    /**
     * @see Endpoint#getLinks()
     */
    EndpointBuilder links(Map<String, String> links);

    /**
     * @see Endpoint#isEnabled()
     */
    EndpointBuilder enabled(boolean enabled);

}
