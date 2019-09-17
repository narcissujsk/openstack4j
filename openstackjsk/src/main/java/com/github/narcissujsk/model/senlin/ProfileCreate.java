package com.github.narcissujsk.model.senlin;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.senlin.Profile;
import com.github.narcissujsk.model.senlin.builder.ProfileCreateBuilder;

/**
 * This interface describes the model of a {@link Profile}, before it is sent to
 * the server for creation
 * 
 * @author lion
 * 
 */
public interface ProfileCreate extends ModelEntity, Buildable<ProfileCreateBuilder> {

}
