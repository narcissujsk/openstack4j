package com.github.narcissujsk.model.compute;

import com.github.narcissujsk.model.ModelEntity;

/**
 * Represents an IP Address
 * 
 * @author Jeremy Unruh
 */
public interface Address extends ModelEntity {

	/**
	 * @return the macaddress for the address
	 */
	String getMacAddr();

	/**
	 * @return the IP version (4 | 6)
	 */
	int getVersion();

	/**
	 * @return the IP Address
	 */
	String getAddr();
	
	/**
	 * @return the type of address
	 */
	String getType();
	
}
