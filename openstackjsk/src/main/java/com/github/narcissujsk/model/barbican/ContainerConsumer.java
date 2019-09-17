package com.github.narcissujsk.model.barbican;

import com.github.narcissujsk.model.ModelEntity;

/**
 * Consumer associated with a container (i.e. lbaas).
 */
public interface ContainerConsumer extends ModelEntity {
    /**
     * @return name of the consumer.
     */
    String getName();

    /**
     * @return Full url to the consumer.
     */
    String getUrl();
}
