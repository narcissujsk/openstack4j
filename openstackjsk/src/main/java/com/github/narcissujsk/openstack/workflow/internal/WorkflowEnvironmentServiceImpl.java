package com.github.narcissujsk.openstack.workflow.internal;

import com.github.narcissujsk.api.workflow.WorkflowEnvironmentService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.workflow.WorkflowEnvironment;
import com.github.narcissujsk.openstack.workflow.domain.MistralWorkflowEnvironment;
import com.github.narcissujsk.openstack.workflow.domain.MistralWorkflowEnvironment.MistralWorkflowEnvironments;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Workflow environment service implementation.
 *
 * @author Renat Akhmerov
 */
public class WorkflowEnvironmentServiceImpl extends BaseMistralService implements WorkflowEnvironmentService {

    @Override
    public List<? extends WorkflowEnvironment> list() {
        return get(MistralWorkflowEnvironments.class, uri("/environments")).execute().getList();
    }

    @Override
    public WorkflowEnvironment create(WorkflowEnvironment env) {
        checkNotNull(env);

        Invocation<MistralWorkflowEnvironment> invocation = post(
                MistralWorkflowEnvironment.class,
                uri("/environments")
        );

        return invocation.entity(env).execute();
    }

    @Override
    public WorkflowEnvironment get(String identifier) {
        return get(MistralWorkflowEnvironment.class, uri("/environments/%s", identifier)).execute();
    }

    @Override
    public ActionResponse delete(String identifier) {
        return deleteWithResponse(uri("/environments/%s", identifier)).execute();
    }
}
