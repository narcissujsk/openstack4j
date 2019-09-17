package com.github.narcissujsk.openstack.workflow.internal;

import com.github.narcissujsk.api.workflow.TaskExecutionService;
import com.github.narcissujsk.model.workflow.TaskExecution;
import com.github.narcissujsk.openstack.workflow.domain.MistralTaskExecution;
import com.github.narcissujsk.openstack.workflow.domain.MistralTaskExecution.MistralTaskExecutions;

import java.util.List;

/**
 * Task execution service implementation.
 *
 * @author Renat Akhmerov
 */
public class TaskExecutionServiceImpl extends BaseMistralService implements TaskExecutionService {

    @Override
    public List<? extends TaskExecution> list() {
        return get(MistralTaskExecutions.class, uri("/tasks")).execute().getList();
    }

    @Override
    public TaskExecution get(String id) {
        return get(MistralTaskExecution.class, uri("/tasks/%s", id)).execute();
    }
}
