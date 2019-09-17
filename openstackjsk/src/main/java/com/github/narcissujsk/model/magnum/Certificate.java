package com.github.narcissujsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.magnum.CertificateBuilder;
import com.github.narcissujsk.openstack.common.GenericLink;

public interface Certificate extends ModelEntity, Buildable<CertificateBuilder> {
    /**
     * Gets pem
     * 
     * @return pem
     */
    String getPem();

    /**
     * Gets bayUuid
     * 
     * @return bayUuid
     */
    String getBayUuid();

    /**
     * Gets links
     * 
     * @return links
     */
    List<GenericLink> getLinks();

}
