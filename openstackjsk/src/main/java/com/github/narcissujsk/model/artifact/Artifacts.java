package com.github.narcissujsk.model.artifact;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.artifact.ArtifactType;

import java.util.List;

/**
 * A Glare list of Artifacts
 *
 * @author Pavan Vadavi
 */
public interface Artifacts extends ModelEntity {

    ArtifactType artifactType = ArtifactType.ALL;

    public String getSchema();

    public String getFirst();

}
