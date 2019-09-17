package com.github.narcissujsk.model.compute;

import com.github.narcissujsk.model.ModelEntity;

/**
 * A network which allows an association to a network UUID and a specified Fix IP Address
 * 
 * @author Jeremy Unruh
 */
public interface NetworkCreate extends ModelEntity {
	
	/**
	 * @return the network UUID
	 */
	String getId();

	/**
	 * @return the fixed IP Address
	 */
	String getFixedIp();
	
	/**
	 * port id of a pre-made port
	 * @return 
	 */
	String getPort();

}
