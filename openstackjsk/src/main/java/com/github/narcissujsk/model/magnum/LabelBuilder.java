package com.github.narcissujsk.model.magnum;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.magnum.Label;

public interface LabelBuilder extends Builder<LabelBuilder, com.github.narcissujsk.model.magnum.Label> {
    /**
     * @see Label#getKey
     */
    LabelBuilder key(String key);

}
