package com.github.narcissujsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.magnum.Cluster;
import com.github.narcissujsk.openstack.common.GenericLink;

public interface ClusterBuilder extends Builder<ClusterBuilder, com.github.narcissujsk.model.magnum.Cluster> {
    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getStatus
     */
    ClusterBuilder status(String status);

    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getClusterTemplateId
     */
    ClusterBuilder clusterTemplateId(String clusterTemplateId);

    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getUuid
     */
    ClusterBuilder uuid(String uuid);

    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getLinks
     */
    ClusterBuilder links(List<GenericLink> links);

    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getStackId
     */
    ClusterBuilder stackId(String stackId);

    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getMasterCount
     */
    ClusterBuilder masterCount(Integer masterCount);

    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getCreateTimeout
     */
    ClusterBuilder createTimeout(Integer createTimeout);

    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getNodeCount
     */
    ClusterBuilder nodeCount(Integer nodeCount);

    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getDiscoveryUrl
     */
    ClusterBuilder discoveryUrl(String discoveryUrl);

    /**
     * @see com.github.narcissujsk.model.magnum.Cluster#getKeypair
     */
    ClusterBuilder keypair(String keypair);

    /**
     * @see Cluster#getName
     */
    ClusterBuilder name(String name);

}
