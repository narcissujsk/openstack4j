package com.github.narcissujsk.api.barbican;

import com.github.narcissujsk.api.barbican.ContainerService;
import com.github.narcissujsk.api.barbican.SecretService;
import com.github.narcissujsk.common.RestService;

/**
 * Barbican (Key Management) Operations API
 *
 */
public interface BarbicanService extends RestService {

    /**
     * @return the Container Service API
     */
    ContainerService containers();
    /**
     * @return the Secrets Service API
     */
    SecretService secrets();
}
