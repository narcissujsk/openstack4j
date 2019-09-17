package com.github.narcissujsk.model.network.ext.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.network.ext.SessionPersistence;
import com.github.narcissujsk.model.network.ext.SessionPersistenceType;

/**
 * A builder to create and update a SessionPersistence
 * @author liujunpeng
 *
 */
public interface SessionPersistenceBuilder extends Builder<SessionPersistenceBuilder, SessionPersistence>{

	/**
	 * required
	 * 
	 * @param type
	 *            APP_COOKIE,HTTP_COOKIE,SOURCE_IP
	 * @return SessionPersistenceBuilder
	 */
	public SessionPersistenceBuilder type(SessionPersistenceType type);

	/**
	 * optional
	 * 
	 * @param cookieName
	 * @return SessionPersistenceBuilder
	 */
	public SessionPersistenceBuilder cookieName(String cookieName);
}
