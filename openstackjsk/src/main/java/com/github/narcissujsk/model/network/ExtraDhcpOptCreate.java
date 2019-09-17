package com.github.narcissujsk.model.network;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.network.builder.ExtraDhcpOptBuilder;

/**
 *
 * @author Ales Kemr
 */
public interface ExtraDhcpOptCreate extends Buildable<ExtraDhcpOptBuilder> {
    
    String getOptValue();

    String getOptName();
}
