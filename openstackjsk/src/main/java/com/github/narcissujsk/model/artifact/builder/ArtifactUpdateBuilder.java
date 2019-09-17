package com.github.narcissujsk.model.artifact.builder;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.artifact.ArtifactUpdate;

/**
 * A Builder which creates a ArtifactUpdate
 *
 * @author Pavan Vadavi
 */
public interface ArtifactUpdateBuilder extends Buildable.Builder<ArtifactUpdateBuilder, ArtifactUpdate> {

    ArtifactUpdateBuilder op(String op);

    ArtifactUpdateBuilder path(String path);

    ArtifactUpdateBuilder value(String value);
}
