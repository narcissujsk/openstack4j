package com.github.narcissujsk.model.network.ext;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.network.ext.LbMethod;
import com.github.narcissujsk.model.network.ext.Protocol;
import com.github.narcissujsk.model.network.ext.SessionPersistence;
import com.github.narcissujsk.model.network.ext.builder.LbPoolV2Builder;
import com.github.narcissujsk.openstack.networking.domain.ext.ListItem;

import java.util.List;

/**
 * A v2 loadbanlance pool
 * @author emjburns
 */
public interface LbPoolV2 extends ModelEntity, Buildable<LbPoolV2Builder> {
    /**
     * @return id. The unique ID for the pool.
     */
    String getId();

    /**
     * @return tenantId.
     * Owner of the pool. Only an administrative user can specify a tenant ID other than its own.
     */
    String getTenantId();

    /**
     * @return Pool name. Does not have to be unique.
     */
    String getName();

    /**
     * @return Description for the pool.
     */
    String getDescription();

    /**
     * @return The protocol of the pool, which is TCP, HTTP, or HTTPS.
     */
    Protocol getProtocol();

    /**
     * @return The load-balancer algorithm, which is round-robin, least-connections, and so on. This value, which must be supported, is dependent on the load-balancer provider. Round-robin must be supported.
     */
    LbMethod getLbMethod();

    /**
     *
     * @return SessionPersistence
     */
    SessionPersistence getSessionPersistence();

    /**
     * @return The administrative state of the lb pool, which is up (true) or
     *         down (false).
     */
    boolean isAdminStateUp();

    /**
     * Listeners associated with the pool
     * @return listeners associated with the pool
     */
    List<ListItem> getListeners();


    /**
     * @return List of members that belong to the pool.
     */
    List<ListItem> getMembers();

    /**
     * @return Health monitor associated with the pool.
     */
    String getHealthMonitorId();
}
