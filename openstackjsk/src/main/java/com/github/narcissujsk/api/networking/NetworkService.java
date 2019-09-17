package com.github.narcissujsk.api.networking;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.api.Builders;
import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.network.Network;
import com.github.narcissujsk.model.network.NetworkUpdate;

/**
 * OpenStack (Neutron) Network based Operations
 * 
 * @author Jeremy Unruh
 */
public interface NetworkService extends RestService {
	
	/**
	 * @author HY(huangyi813 @ qq.com)
	 * Lists the networks to which the current authorized tenant has access
	 * @param filteringParams map (name, value) of filtering parameters
	 * 
	 * @return List of Network
	 */
	List<? extends Network> list(Map<String, String> filteringParams);
	

	/**
	 * Lists the networks to which the current authorized tenant has access
	 * 
	 * @return List of Network
	 */
	List<? extends Network> list();
	
	/**
	 * Gets the network by ID
	 * 
	 * @param networkId the network identifier
	 * @return the Network or null if not found
	 */
	Network get(String networkId);
	
	/**
	 * Updates a network associated by the specified {@code networkId}
	 * 
	 * @param networkId the network identifier
	 * @param network the network options to update (see {@link Builders#networkUpdate()}
	 * @return the updated network
	 */
	Network update(String networkId, NetworkUpdate network);
	
	/**
	 * Deletes a specified network and its associated resources
	 *  
	 * @param networkId the network identifier
	 * @return the action response
	 */
	ActionResponse delete(String networkId);

	/**
	 * Creates a new Network
	 * 
	 * @param network the network to create
	 * @return the newly created network
	 */
	Network create(Network network);
	
}
