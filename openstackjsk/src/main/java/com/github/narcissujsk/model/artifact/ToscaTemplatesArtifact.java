package com.github.narcissujsk.model.artifact;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.artifact.Artifact;
import com.github.narcissujsk.model.artifact.Template;
import com.github.narcissujsk.model.artifact.builder.ToscaTemplatesArtifactBuilder;
import com.github.narcissujsk.model.common.BasicResource;

/**
 * A Glare Tosca Templates Artifact
 *
 * @author Pavan Vadavi
 */
public interface ToscaTemplatesArtifact extends Artifact, Buildable<ToscaTemplatesArtifactBuilder> {

    Template getTemplate();

    String getTemplateFormat();

}
