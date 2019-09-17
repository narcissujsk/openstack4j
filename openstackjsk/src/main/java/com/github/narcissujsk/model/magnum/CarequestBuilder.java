package com.github.narcissujsk.model.magnum;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.magnum.Carequest;

public interface CarequestBuilder extends Builder<CarequestBuilder, com.github.narcissujsk.model.magnum.Carequest> {
    /**
     * @see com.github.narcissujsk.model.magnum.Carequest#getBayUuid
     */
    CarequestBuilder bayUuid(String bayUuid);

    /**
     * @see Carequest#getCsr
     */
    CarequestBuilder csr(String csr);

}
