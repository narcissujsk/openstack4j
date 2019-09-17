package com.github.narcissujsk.api.artifact;

import com.github.narcissujsk.api.OSClient;
import com.github.narcissujsk.api.artifact.ToscaTemplatesArtifactService;
import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.artifact.Artifacts;

/**
 * OpenStack (Glare) Artifact Type
 *
 * @author Pavan Vadavi
 */
public interface ArtifactService extends RestService {

    /**
     * Tosca Template Service
     *
     * @return Tosca Template Service
     */
    ToscaTemplatesArtifactService toscaTemplatesArtifact();
}
