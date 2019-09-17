package com.github.narcissujsk.api.compute;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.openstack.compute.domain.NovaServerTag;

public interface ServerTagService extends RestService {
	
	NovaServerTag list(String serverId);
	
	NovaServerTag replace(String serverId, NovaServerTag tag);
	
	ActionResponse deleteAll(String serverId);
	
	ActionResponse delete(String serverId, String tag);
	
	ActionResponse check(String serverId, String tag);
	
	ActionResponse addSingle(String serverId, String tag);

}
