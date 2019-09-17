package com.github.narcissujsk.model.octavia.status;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.octavia.status.LbPoolV2Status;
import com.github.narcissujsk.openstack.octavia.domain.LoadBalancerV2StatusTree.OctaviaListenerV2Status;

import java.util.List;

@JsonDeserialize(as = OctaviaListenerV2Status.class)
public interface ListenerV2Status extends ModelEntity {
    /**
     * The name of the listener
     * @return name
     */
    public String getName();

    /**
     * The id of the listener
     * @return id
     */
    public String getId();

    /**
     * The operating status of the listener
     * @return operating status
     */
    public String getOperatingStatus();

    /**
     * The provisioning status of the listener
     * @return provisioning status
     */
    public String getProvisioningStatus();

    /**
     * The statuses of the pools associated with this listener
     * @return list of the status of the pools
     */
    public List<LbPoolV2Status> getLbPoolV2Statuses();
}
