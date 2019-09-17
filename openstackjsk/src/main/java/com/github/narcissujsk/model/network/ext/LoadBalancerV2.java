package com.github.narcissujsk.model.network.ext;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.network.ext.LbOperatingStatus;
import com.github.narcissujsk.model.network.ext.LbProvisioningStatus;
import com.github.narcissujsk.model.network.ext.builder.LoadBalancerV2Builder;
import com.github.narcissujsk.openstack.networking.domain.ext.ListItem;

import java.util.List;

/**
 * An entity used to update an lbaas v2 loadbalancer
 * @author emjburns
 */
public interface LoadBalancerV2  extends ModelEntity, Buildable<LoadBalancerV2Builder> {
    /**
     * @return id. The unique ID for the loadbalancer.
     */
    String getId();

    /**
     * @return tenantId.
     * Owner of the loadbalancer. Only an administrative user can specify a tenant ID other than its own.
     */
    String getTenantId();

    /**
     * @return loadbalancer name. Does not have to be unique.
     */
    String getName();

    /**
     * @return Description for the loadbalancer.
     */
    String getDescription();

    /**
     * @return The vip subnet id of the loadbalancer.
     */
    String getVipSubnetId();

    /**
     * @return The vip address of the loadbalancer.
     */
    String getVipAddress();

    /***
     * @return the vip port id of the loadbalancer
     */
    String getVipPortId();

    /**
     * @return The administrative state of the loadbalancer, which is up (true) or
     *         down (false).
     */
    boolean isAdminStateUp();

    /**
     * @return The listeners of the loadbalancer.
     */
    List<ListItem> getListeners();

    /**
     * @return provisioningStatus.The provisioning status of the loadbalancer. Indicates whether the
     *         loadbalancer is provisioning.
     *         Either ACTIVE, PENDING_CREATE or ERROR.
     */
    LbProvisioningStatus getProvisioningStatus();

    /**
     * @return operatingStatus.The operating status of the loadbalancer. Indicates whether the
     *         loadbalancer is operational.
     */
    LbOperatingStatus getOperatingStatus();

    /**
     * Retrieve provider the load balancer is provisioned with
     * @return provider
     */
    String getProvider();
}
