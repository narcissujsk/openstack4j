package com.github.narcissujsk.model.senlin;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.senlin.Node;
import com.github.narcissujsk.model.senlin.builder.NodeActionCreateBuilder;

/**
 * This interface describes the model of a {@link Node}, before it is sent to
 * the server for creation
 * 
 * @author Matthias Reisser
 * 
 */
public interface NodeActionCreate extends ModelEntity, Buildable<NodeActionCreateBuilder> {

}
