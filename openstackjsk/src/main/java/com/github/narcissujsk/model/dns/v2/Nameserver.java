package com.github.narcissujsk.model.dns.v2;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.dns.v2.builder.NameserverBuilder;

/**
 * Nameserver model
 *
 * @see <a href="https://developer.openstack.org/api-ref/dns/">API reference</a>
 */
public interface Nameserver extends ModelEntity, Buildable<NameserverBuilder> {

    /**
     * @return the hostname of the nameserver that the zone should be delegated to
     */
    String getHostname();

    /**
     * @return the priority of the nameserver
     */
    Integer getPriority();

}
