package com.github.narcissujsk.model.network.ext.builder;

import java.util.Map;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.network.ext.Ethertype;
import com.github.narcissujsk.model.network.ext.FlowClassifier;

/**
 * 	A builder to create a flow classifier
 * @author Dmitry Gerenrot
 *
 */
public interface FlowClassifierBuilder extends Builder<FlowClassifierBuilder, FlowClassifier> {

    /**
     * @param id : Flow Classifier identifer
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder id(String id);

    /**
     * @param name : Human readable name for the flow classifier
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder name(String name);

    /**
     * @param projectId : Project (tenant) identifier
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder projectId(String projectId);

    /**
     * @param description : Human readable description for the flow classifier
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder description(String description);

    /**
     *
     * @param protocol : Short name for the protocol (TCP, UDP, etc)
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder protocol(String protocol);

    /**
     * @param sourcePortRangeMin : Minimum value for the source port, converted to String
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder sourcePortRangeMin(Integer sourcePortRangeMin);

    /**
     * @param sourcePortRangeMax : Maximum value for the source port, converted to String
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder sourcePortRangeMax(Integer sourcePortRangeMax);

    /**
     * @param destinationPortRangeMin : Minimum value for the destination port, converted to String
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder destinationPortRangeMin(Integer destinationPortRangeMin);

    /**
     * @param destinationPortRangeMax : Maximum value for the destination port, converted to String
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder destinationPortRangeMax(Integer destinationPortRangeMax);

    /**
     * @param sourceIpPrefix
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder sourceIpPrefix(String sourceIpPrefix);

    /**
     * @param destinationIpPrefix
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder destinationIpPrefix(String destinationIpPrefix);

    /**
     * @param logicalSourcePort
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder logicalSourcePort(String logicalSourcePort);

    /**
     * @param logicalDestinationPort
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder logicalDestinationPort(String logicalDestinationPort);

    /**
     * @param l7Parameters
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder l7Parameters(Map<String, String> l7Parameters);

    /**
     * @param ethertype
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder ethertype(Ethertype ethertype);
}
