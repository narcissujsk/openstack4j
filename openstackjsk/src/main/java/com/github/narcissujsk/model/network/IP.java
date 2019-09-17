package com.github.narcissujsk.model.network;

import com.github.narcissujsk.model.ModelEntity;


/**
 * A Fixed IP Address
 * 
 * @author Jeremy Unruh
 */
public interface IP extends ModelEntity {

  /**
   * @return the fixed ip address
   */
  String getIpAddress();

  /**
   * @return the id of the subnet of this ip
   */
  String getSubnetId();
	
}
