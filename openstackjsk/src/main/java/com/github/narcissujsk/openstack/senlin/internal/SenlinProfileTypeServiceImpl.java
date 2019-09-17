package com.github.narcissujsk.openstack.senlin.internal;

import com.github.narcissujsk.api.senlin.SenlinProfileTypeService;
import com.github.narcissujsk.model.senlin.ProfileType;
import com.github.narcissujsk.openstack.senlin.domain.SenlinProfileType;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class contains getters for all implementation of the available profile-type services
 * 
 * @author lion
 */
public class SenlinProfileTypeServiceImpl extends BaseSenlinServices implements SenlinProfileTypeService {

	@Override
	public List<? extends ProfileType> list() {
		return get(SenlinProfileType.ProfileType.class, uri("/profile-types")).execute().getList();
	}

	@Override
	public ProfileType get(String ProfileType) {
		checkNotNull(ProfileType);
		return get(SenlinProfileType.class, uri("/profile-types/%s", ProfileType)).execute();
	}
}
