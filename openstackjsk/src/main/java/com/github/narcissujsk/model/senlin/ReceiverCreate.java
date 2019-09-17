package com.github.narcissujsk.model.senlin;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.senlin.Receiver;
import com.github.narcissujsk.model.senlin.builder.ReceiverCreateBuilder;

/**
 * This interface describes the model of a {@link Receiver}, before it is sent to
 * the server for creation
 * 
 * @author lion
 * 
 */
public interface ReceiverCreate extends ModelEntity, Buildable<ReceiverCreateBuilder> {

}
