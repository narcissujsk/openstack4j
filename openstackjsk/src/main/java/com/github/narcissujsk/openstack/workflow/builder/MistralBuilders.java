package com.github.narcissujsk.openstack.workflow.builder;

import com.github.narcissujsk.model.workflow.builder.*;
import com.github.narcissujsk.openstack.workflow.domain.MistralActionDefinition;
import com.github.narcissujsk.openstack.workflow.domain.MistralWorkbookDefinition;
import com.github.narcissujsk.openstack.workflow.domain.MistralWorkflowDefinition;
import com.github.narcissujsk.openstack.workflow.domain.MistralWorkflowExecution;

/**
 * The Mistral v2 Builders.
 */
public class MistralBuilders implements WorkflowBuilders {

    @Override
    public WorkflowDefinitionBuilder workflowDefinition() {
        return MistralWorkflowDefinition.builder();
    }

    @Override
    public WorkbookDefinitionBuilder workbookDefinition() {
        return MistralWorkbookDefinition.builder();
    }

    @Override
    public ActionDefinitionBuilder actionDefinition() {
        return MistralActionDefinition.builder();
    }

    @Override
    public WorkflowExecutionBuilder workflowExecution() {
        return MistralWorkflowExecution.builder();
    }
}
