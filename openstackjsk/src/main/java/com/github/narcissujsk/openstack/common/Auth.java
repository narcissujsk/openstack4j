package com.github.narcissujsk.openstack.common;

import com.github.narcissujsk.model.ModelEntity;

public interface Auth extends ModelEntity {

	public enum Type { CREDENTIALS, TOKEN, RAX_APIKEY, TOKENLESS }

}
