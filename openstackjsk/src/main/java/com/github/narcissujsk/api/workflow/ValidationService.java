package com.github.narcissujsk.api.workflow;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.workflow.WorkflowDefinition;

/**
 * TODO
 *
 * @author Renat Akhmerov
 */
public interface ValidationService extends RestService {

    /**
     * Validate workflow definition.
     *
     * @param workflowDefinition Workflow definition.
     * @return TODO: What should be the return type?
     */
    String validate(WorkflowDefinition workflowDefinition);
}
