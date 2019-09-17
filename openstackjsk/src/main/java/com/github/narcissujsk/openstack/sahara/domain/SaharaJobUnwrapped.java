package com.github.narcissujsk.openstack.sahara.domain;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.sahara.Job;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * An OpenStack Sahara
 * Unwrap the root name of Job when serialized into json request
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */

public class SaharaJobUnwrapped implements ModelEntity {

    private static final long serialVersionUID = 1L;

    @JsonUnwrapped
    //@JsonProperty("job")
    private Job job;

    public SaharaJobUnwrapped(Job job) {
        this.job = job;
    }

    public Job getJob() { // need for serialization
        return job;
    }
}
