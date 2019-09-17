package com.github.narcissujsk.model.artifact;

import com.github.narcissujsk.model.ModelEntity;

/**
 * A Glare Artifact Template
 *
 * @author Pavan Vadavi
 */
public interface Template extends ModelEntity {

    public String getMd5();

    public String getSha256();

    public String getContentType();

    public Boolean getExternal();

    public String getUrl();

    public String getSha1();

    public String getStatus();
}
