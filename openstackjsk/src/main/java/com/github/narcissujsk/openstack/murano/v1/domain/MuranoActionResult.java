package com.github.narcissujsk.openstack.murano.v1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.model.murano.v1.domain.ActionResult;

/**
 * @author Nikolay Mahotkin.
 */
public class MuranoActionResult implements ActionResult {
    @JsonProperty
    private Boolean isException;

    @JsonProperty
    private Object result;

    @Override
    public Boolean isException() {
        return this.isException;
    }

    @Override
    public Object getResult() {
        return this.result;
    }
}
