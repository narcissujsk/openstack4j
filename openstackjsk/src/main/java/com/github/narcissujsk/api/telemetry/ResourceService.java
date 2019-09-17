package com.github.narcissujsk.api.telemetry;

import java.util.List;

import com.github.narcissujsk.model.telemetry.Resource;

public interface ResourceService {

    List<? extends Resource> list();

    Resource get(String resourceId);

}
