package com.github.narcissujsk.model.artifact;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.artifact.builder.ArtifactUpdateBuilder;

/**
 * A Glare ArtifactUpdate
 *
 * @author Pavan Vadavi
 */
public interface ArtifactUpdate extends ModelEntity, Buildable<ArtifactUpdateBuilder> {

    public String getOp();

    public String getPath();

    public String getValue();
}
