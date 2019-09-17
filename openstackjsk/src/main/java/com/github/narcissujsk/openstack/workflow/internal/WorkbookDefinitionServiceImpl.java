package com.github.narcissujsk.openstack.workflow.internal;

import com.github.narcissujsk.api.workflow.WorkbookDefinitionService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.common.payloads.InputStreamPayload;
import com.github.narcissujsk.model.workflow.Scope;
import com.github.narcissujsk.model.workflow.WorkbookDefinition;
import com.github.narcissujsk.openstack.workflow.domain.MistralWorkbookDefinition;
import com.github.narcissujsk.openstack.workflow.domain.MistralWorkbookDefinition.MistralWorkbookDefinitions;

import java.io.InputStream;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Workbook definition service implementation.
 *
 * @author Renat Akhmerov
 */
public class WorkbookDefinitionServiceImpl extends BaseMistralService implements WorkbookDefinitionService {

    @Override
    public List<? extends WorkbookDefinition> list() {
        return get(MistralWorkbookDefinitions.class, uri("/workbooks")).execute().getList();
    }

    @Override
    public WorkbookDefinition create(InputStream wfText, Scope scope) {
        checkNotNull(wfText);
        checkNotNull(scope);

        Invocation<MistralWorkbookDefinition> invocation = post(
                MistralWorkbookDefinition.class,
                uri("/workbooks?scope=%s", scope.toString().toLowerCase())
        );

        return invocation.entity(new InputStreamPayload(wfText)).execute();
    }

    @Override
    public WorkbookDefinition get(String identifier) {
        return get(MistralWorkbookDefinition.class, uri("/workbooks/%s", identifier)).execute();
    }

    @Override
    public ActionResponse delete(String identifier) {
        return deleteWithResponse(uri("/workbooks/%s", identifier)).execute();
    }
}
