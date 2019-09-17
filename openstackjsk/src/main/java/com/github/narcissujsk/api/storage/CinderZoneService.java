package com.github.narcissujsk.api.storage;

import java.util.List;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.openstack.storage.block.domain.AvailabilityZone;

/**
  * @author Jeff Hu
  * list all available cinder zones
  */
public interface CinderZoneService extends RestService {

	List<? extends AvailabilityZone> list();
}
