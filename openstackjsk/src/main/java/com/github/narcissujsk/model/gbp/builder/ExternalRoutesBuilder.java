package com.github.narcissujsk.model.gbp.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.gbp.ExternalRoutes;
/**
 * A builder which produces a External Routes object
 * 
 * @author vinod borole
 */
public interface ExternalRoutesBuilder extends Builder<ExternalRoutesBuilder,ExternalRoutes>{
    ExternalRoutesBuilder destination(String destination);
    ExternalRoutesBuilder nextHop(String nextHop);
}
