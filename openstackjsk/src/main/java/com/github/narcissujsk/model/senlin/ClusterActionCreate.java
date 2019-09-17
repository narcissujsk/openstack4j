package com.github.narcissujsk.model.senlin;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.senlin.Cluster;
import com.github.narcissujsk.model.senlin.builder.ClusterActionCreateBuilder;

/**
 * This interface describes the model of a {@link Cluster}, before it is sent to
 * the server for creation
 * 
 * @author lion
 * 
 */
public interface ClusterActionCreate extends ModelEntity, Buildable<ClusterActionCreateBuilder> {

}
