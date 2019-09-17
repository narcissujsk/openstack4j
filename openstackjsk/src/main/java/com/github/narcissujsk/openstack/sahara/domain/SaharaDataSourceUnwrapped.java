package com.github.narcissujsk.openstack.sahara.domain;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.sahara.DataSource;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * An OpenStack Sahara
 * Unwrap the root name of Data Source when serialized into json request 
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */

public class SaharaDataSourceUnwrapped implements ModelEntity {

    private static final long serialVersionUID = 1L;
    
    @JsonUnwrapped
    //@JsonProperty("data_source")
    private DataSource dataSource;

    public SaharaDataSourceUnwrapped(DataSource datasource) {
        this.dataSource = datasource;
    }

    public DataSource getDataSource() { // need for serialization
        return dataSource;
    }
}
