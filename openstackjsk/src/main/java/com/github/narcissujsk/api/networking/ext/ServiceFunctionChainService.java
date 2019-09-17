package com.github.narcissujsk.api.networking.ext;

import com.github.narcissujsk.api.networking.ext.FlowClassifierService;
import com.github.narcissujsk.api.networking.ext.PortChainService;
import com.github.narcissujsk.api.networking.ext.PortPairGroupService;
import com.github.narcissujsk.api.networking.ext.PortPairService;
import com.github.narcissujsk.common.RestService;

/**
 * Service Function Chain Operations API
 *
 * @author Dmitry Gerenrot
 *
 */
public interface ServiceFunctionChainService extends RestService {

    /**
     * @return the Flow Classifier Service API
     */
    FlowClassifierService flowclassifiers();

    /**
     * @return the Port Pair Service API
     */
    PortPairService portpairs();

    /**
     * @return the Port Pair Service API
     */
    PortPairGroupService portpairgroups();

    /**
     * @return the Port Chain Service API
     */
    PortChainService portchains();
}
