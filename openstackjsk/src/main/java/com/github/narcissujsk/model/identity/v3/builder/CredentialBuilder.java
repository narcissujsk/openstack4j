package com.github.narcissujsk.model.identity.v3.builder;

import java.util.Map;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.identity.v3.Credential;

public interface CredentialBuilder extends Builder<CredentialBuilder, Credential>{

    /**
     * @see Credential#getId()
     */
    CredentialBuilder id(String id);

    /**
     * @see Credential#getUserId()
     */
    CredentialBuilder userId(String userId);

    /**
     * @see Credential#getProjectId()
     */
    CredentialBuilder projectId(String projectId);

    /**
     * @see Credential#getType()
     */
    CredentialBuilder type(String type);

    /**
     * @see Credential#getBlob()
     */
    CredentialBuilder blob(String blob);

    /**
     * @see Credential#getLinks()
     */
    CredentialBuilder links(Map<String, String> links);

}
