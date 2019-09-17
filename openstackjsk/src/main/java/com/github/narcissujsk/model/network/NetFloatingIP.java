package com.github.narcissujsk.model.network;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.network.builder.NetFloatingIPBuilder;

/**
 * The Interface NetFloatingIP.
 * 
 *
 * @author nanderson
 */
public interface NetFloatingIP extends ModelEntity, Buildable<NetFloatingIPBuilder> {

  /**
   * Gets the id.
   *
   * @return the id
   */
   String getId();

  /**
   * Gets the router id.
   *
   * @return the router id
   */
   String getRouterId();

  /**
   * Gets the tenant id.
   *
   * @return the tenant id
   */
   String getTenantId();

  /**
   * Gets the floating network id.
   *
   * @return the floating network id
   */
   String getFloatingNetworkId();

  /**
   * Gets the floating ip address.
   *
   * @return the floating ip address
   */
   String getFloatingIpAddress();

  /**
   * Gets the fixed ip address.
   *
   * @return the fixed ip address
   */
   String getFixedIpAddress();

  /**
   * Gets the port id.
   *
   * @return the port id
   */
   String getPortId();
   
   /**
    * Gets the floating ip status
    * 
    * @return the floating ip status
    */
   String getStatus();
   

}