package com.github.narcissujsk.openstack.senlin.internal;

import com.github.narcissujsk.api.senlin.SenlinBuildInfoService;
import com.github.narcissujsk.model.senlin.BuildInfo;
import com.github.narcissujsk.openstack.senlin.domain.SenlinBuildInfo;

/**
 * This class contains getters for all implementation of the available build-info services
 * 
 * @author lion
 */
public class SenlinBuildInfoServiceImpl extends BaseSenlinServices implements SenlinBuildInfoService {

	@Override
	public  BuildInfo get() {
		return get(SenlinBuildInfo.class, uri("/build-info")).execute();
	}
}
