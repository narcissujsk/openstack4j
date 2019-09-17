package com.github.narcissujsk.api.tacker;

import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.tacker.TackerService;
import com.github.narcissujsk.api.tacker.VimService;
import com.github.narcissujsk.api.tacker.VnfService;
import com.github.narcissujsk.api.tacker.VnfdService;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public class TackerServiceImpl implements TackerService {

	@Override
	public com.github.narcissujsk.api.tacker.VnfdService vnfd() {
		return Apis.get(VnfdService.class);
	}

	@Override
	public com.github.narcissujsk.api.tacker.VnfService vnf() {
		return Apis.get(VnfService.class);
	}

	@Override
	public com.github.narcissujsk.api.tacker.VimService vim() {
		return Apis.get(VimService.class);
	}
}
