package com.github.narcissujsk.openstack.storage.block.internal;

import java.util.List;

import com.github.narcissujsk.api.storage.ext.BlockStorageServiceService;
import com.github.narcissujsk.model.storage.block.ext.Service;
import com.github.narcissujsk.openstack.storage.block.domain.ext.ExtService.Services;

/**
 * Block Storage Services service provides CRUD capabilities for Cinder service(s).
 *
 * @author Taemin
 */
public class BlockStorageServiceServiceImpl extends BaseBlockStorageServices implements BlockStorageServiceService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends Service> list() {
		return get(Services.class, uri("/os-services")).execute().getList();
	}

}