package com.github.narcissujsk.model.gbp.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.gbp.Direction;
import com.github.narcissujsk.model.gbp.PolicyClassifier;
import com.github.narcissujsk.model.gbp.Protocol;
/**
 * A builder which produces a Policy Classifier object
 * 
 * @author vinod borole
 */
public interface PolicyClassifierBuilder extends Builder<PolicyClassifierBuilder, PolicyClassifier> {
    PolicyClassifierBuilder name(String name);
    PolicyClassifierBuilder description(String description);
    PolicyClassifierBuilder portRangeMin(int min);
    PolicyClassifierBuilder portRangeMax(int max);
    PolicyClassifierBuilder direction(Direction direction);
    PolicyClassifierBuilder protocol(Protocol protocol);
    PolicyClassifierBuilder shared(boolean shared);
}
