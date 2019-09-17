package com.github.narcissujsk.model.network.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.network.ExtraDhcpOptCreate;

/**
 *
 * @author Ales Kemr
 */
public interface ExtraDhcpOptBuilder extends Builder<ExtraDhcpOptBuilder, ExtraDhcpOptCreate> {

	ExtraDhcpOptBuilder optValue(String optValue);

	ExtraDhcpOptBuilder optName(String optName);

}
