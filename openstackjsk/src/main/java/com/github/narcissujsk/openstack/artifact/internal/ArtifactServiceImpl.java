package com.github.narcissujsk.openstack.artifact.internal;

import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.artifact.ArtifactService;
import com.github.narcissujsk.api.artifact.ToscaTemplatesArtifactService;
import com.github.narcissujsk.model.artifact.ArtifactType;
import com.github.narcissujsk.model.artifact.Artifacts;
import com.github.narcissujsk.model.artifact.ToscaTemplatesArtifacts;

/**
 * Created by vadavi on 18-01-2017.
 */
public class ArtifactServiceImpl implements ArtifactService {


    @Override
    public ToscaTemplatesArtifactService toscaTemplatesArtifact() {
        return Apis.get(ToscaTemplatesArtifactService.class);
    }
}
