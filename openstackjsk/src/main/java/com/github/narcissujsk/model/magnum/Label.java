package com.github.narcissujsk.model.magnum;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.magnum.LabelBuilder;

public interface Label extends ModelEntity, Buildable<LabelBuilder> {
    /**
     * Gets key
     * 
     * @return key
     */
    String getKey();

}
