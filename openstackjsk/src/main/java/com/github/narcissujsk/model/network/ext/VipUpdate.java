package com.github.narcissujsk.model.network.ext;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.network.ext.SessionPersistence;
import com.github.narcissujsk.model.network.ext.Vip;
import com.github.narcissujsk.model.network.ext.builder.VipUpdateBuilder;

/**
 * An entity used to update a vip
 * 
 * @author liujunpeng
 */
public interface VipUpdate extends ModelEntity, Buildable<VipUpdateBuilder> {
	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.model.network.ext.Vip#isAdminStateUp()
	 */
	public boolean isAdminStateUp();

	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.model.network.ext.Vip#getConnectionLimit()
	 */
	public Integer getConnectionLimit();

	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.model.network.ext.Vip#getDescription()
	 */
	public String getDescription();

	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.model.network.ext.Vip#getName()
	 */
	public String getName();

	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.model.network.ext.Vip#getPoolId()
	 */
	public String getPoolId();

	/**
	 * Optional
	 * 
	 * @see Vip#getSessionPersistence()
	 */
	public SessionPersistence getSessionPersistence();

}
