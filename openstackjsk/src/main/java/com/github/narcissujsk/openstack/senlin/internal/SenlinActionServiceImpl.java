package com.github.narcissujsk.openstack.senlin.internal;

import com.github.narcissujsk.api.senlin.SenlinActionService;
import com.github.narcissujsk.model.senlin.Action;
import com.github.narcissujsk.openstack.senlin.domain.SenlinAction;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class contains getters for all implementation of the available action services
 * 
 * @author lion
 */
public class SenlinActionServiceImpl extends BaseSenlinServices implements SenlinActionService {

	@Override
	public List<? extends Action> list() {
		return get(SenlinAction.Action.class, uri("/actions")).execute().getList();
	}

	@Override
	public Action get(String actionID) {
		checkNotNull(actionID);
		return get(SenlinAction.class, uri("/actions/%s", actionID)).execute();
	}
}
