package com.github.narcissujsk.model.heat;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.heat.BaseStackCreateUpdate;
import com.github.narcissujsk.model.heat.builder.StackUpdateBuilder;

/**
 * Model Entity used for updating a Stack
 * 
 * @author Jeremy Unruh
 */
public interface StackUpdate extends BaseStackCreateUpdate, Buildable<StackUpdateBuilder> {

}
