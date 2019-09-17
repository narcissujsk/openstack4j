package com.github.narcissujsk.openstack.sahara.internal;

import com.github.narcissujsk.api.types.ServiceType;
import com.github.narcissujsk.openstack.internal.BaseOpenStackService;

/**
 * This class is extended by every Sahara Service. It is necessary to determine
 * the correct endpoint (url) for sahara calls.
 * 
 * @author Ekasit Kijipongse
 * 
 */
public class BaseSaharaServices extends BaseOpenStackService {

	protected BaseSaharaServices() {
		super(ServiceType.SAHARA);
	}

}
