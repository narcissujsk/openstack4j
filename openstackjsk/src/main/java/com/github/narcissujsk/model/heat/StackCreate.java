package com.github.narcissujsk.model.heat;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.heat.BaseStackCreateUpdate;
import com.github.narcissujsk.model.heat.Stack;
import com.github.narcissujsk.model.heat.builder.StackCreateBuilder;

/**
 * This interface describes the model of a {@link Stack}, before it is sent to
 * the server for creation
 * 
 * @author Matthias Reisser
 * 
 */
public interface StackCreate extends BaseStackCreateUpdate, Buildable<StackCreateBuilder> {

	boolean getDisableRollback();
	
	/**
     * Returns the name of the stack to create
     * 
     * @return the name of the stack to create
     */
    String getName();
}
