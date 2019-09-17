package com.github.narcissujsk.api.workflow;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.workflow.WorkflowEnvironment;

import java.util.List;

/**
 * Service that provides CRUD operations for workflow environments.
 *
 * @author Renat Akhmerov
 */
public interface WorkflowEnvironmentService extends RestService {
    /**
     * List all workflow environments with details.
     *
     * @return List of workflow environments.
     */
    List<? extends WorkflowEnvironment> list();

    /**
     * Create a new workflow environment.
     *
     * @param workflowEnvironment Workflow environment to create.
     * @return Created workflow environment.
     */
    WorkflowEnvironment create(WorkflowEnvironment workflowEnvironment);

    /**
     * Get workflow environment by its ID.
     *
     * @param id Workflow environment ID.
     * @return Workflow environment.
     */
    WorkflowEnvironment get(String id);

    /**
     * Delete workflow environment by its ID.
     *
     * @param id Workflow environment ID.
     * @return Action response from the server.
     */
    ActionResponse delete(String id);
}
