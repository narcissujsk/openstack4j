package com.github.narcissujsk.model.network;

import com.github.narcissujsk.model.ModelEntity;


/**
 * Allowed Address Pair for Neutron Port
 * 
 * @author Nathan Anderson
 */
public interface AllowedAddressPair extends ModelEntity {

  /**
   * @return the ip address
   */
  String getIpAddress();

  /**
   * @return the mac address
   */
  String getMacAddress();
	
}
