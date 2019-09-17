package com.github.narcissujsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.magnum.Label;
import com.github.narcissujsk.model.magnum.PodBuilder;

public interface Pod extends ModelEntity, Buildable<PodBuilder> {
    /**
     * Gets id
     * 
     * @return id
     */
    String getId();

    /**
     * Gets uuid
     * 
     * @return uuid
     */
    String getUuid();

    /**
     * Gets name
     * 
     * @return name
     */
    String getName();

    /**
     * Gets desc
     * 
     * @return desc
     */
    String getDesc();

    /**
     * Gets bayUuid
     * 
     * @return bayUuid
     */
    String getBayUuid();

    /**
     * Gets images
     * 
     * @return images
     */
    List<String> getImages();

    /**
     * Gets labels
     * 
     * @return labels
     */
    Label getLabels();

    /**
     * Gets status
     * 
     * @return status
     */
    String getStatus();

}
