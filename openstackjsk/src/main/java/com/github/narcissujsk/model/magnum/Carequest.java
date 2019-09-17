package com.github.narcissujsk.model.magnum;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.magnum.CarequestBuilder;

public interface Carequest extends ModelEntity, Buildable<CarequestBuilder> {
    /**
     * Gets bayUuid
     * 
     * @return bayUuid
     */
    String getBayUuid();

    /**
     * Gets csr
     * 
     * @return csr
     */
    String getCsr();

}
