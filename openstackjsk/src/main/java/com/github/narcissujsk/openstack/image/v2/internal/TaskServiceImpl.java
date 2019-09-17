package com.github.narcissujsk.openstack.image.v2.internal;

import com.github.narcissujsk.api.image.v2.TaskService;
import com.github.narcissujsk.model.image.v2.Task;
import com.github.narcissujsk.openstack.image.v2.domain.GlanceTask;
import com.github.narcissujsk.openstack.image.v2.internal.BaseImageServices;

import java.util.List;
import java.util.Map;

/**
 * Glance V2 task service implementation
 * @author emjburns
 */
public class TaskServiceImpl extends BaseImageServices implements TaskService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Task> list() {
        return get(GlanceTask.Tasks.class, uri("/tasks")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Task> list(Map<String, String> filteringParams) {
        return get(GlanceTask.Tasks.class, uri("/tasks")).params(filteringParams).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Task get(String taskId) {
        return get(GlanceTask.class, uri("/tasks/%s",taskId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Task create(Task task) {
        return post(GlanceTask.class, uri("/tasks")).entity(task).execute();
    }
}
