package com.github.narcissujsk.model.barbican;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.barbican.builder.ContainerSecretBuilder;

/**
 * A secret associated to a container.
 */
public interface ContainerSecret extends ModelEntity, Buildable<ContainerSecretBuilder> {
    /**
     * @return the name of the secret.
     */
    String getName();

    /**
     * @return Full URI reference to the secret.
     */
    String getReference();
}
