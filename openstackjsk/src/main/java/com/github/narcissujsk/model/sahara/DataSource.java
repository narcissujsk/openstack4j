package com.github.narcissujsk.model.sahara;

import java.util.Date;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.sahara.DataSourceCredentials;
import com.github.narcissujsk.model.sahara.builder.DataSourceBuilder;

/**
 * An OpenStack Data Source
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface DataSource extends ModelEntity, Buildable<DataSourceBuilder> {

    /**
     * @return the description of the data source
     */
    String getDescription();

    /**
     * @return the URL of the data source
     */
    String getURL();

    /**
     * @return the tenant id of the data source
     */
    String getTenantId();

    /**
     * @return the created date of the data source
     */
    Date getCreatedAt();

    /**
     * @return the updated date of the data source
     */
    Date getUpdatedAt();

    /**
     * @return the type of the data source
     */
    String getType();

    /**
     * @return the identifier of the data source
     */
    String getId();

    /**
     * @return the name of the data source
     */
    String getName();

    /**
     * @return the credentials of the data source
     */
    DataSourceCredentials getCredentials();
}
