package com.github.narcissujsk.api.telemetry;

import java.util.List;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.telemetry.Sample;
import com.github.narcissujsk.model.telemetry.SampleCriteria;


public interface SampleService extends RestService{
	
	List<? extends Sample> list();

	List<? extends Sample> list(SampleCriteria criteria);
	
	Sample get(String sampleId);
}
