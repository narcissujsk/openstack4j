package com.github.narcissujsk.openstack.murano.v1.internal;

import com.github.narcissujsk.api.murano.v1.MuranoDeploymentService;
import com.github.narcissujsk.model.murano.v1.domain.Deployment;
import com.github.narcissujsk.model.murano.v1.domain.Report;
import com.github.narcissujsk.openstack.murano.v1.domain.MuranoDeployment;
import com.github.narcissujsk.openstack.murano.v1.domain.MuranoReport;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nikolay Mahotkin.
 */
public class MuranoDeploymentServiceImpl extends BaseMuranoServices implements MuranoDeploymentService {
    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Deployment> list(String environmentId) {
        return get(
            MuranoDeployment.MuranoDeployments.class,
            uri("/environments/%s/deployments", environmentId)
        ).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Report> reports(String environmentId, String deploymentId, List<String> serviceIds) {
        String path = String.format("/environments/%s/deployments/%s", environmentId, deploymentId);

        Invocation<MuranoReport.MuranoReports> invocation = get(MuranoReport.MuranoReports.class, path);

        for (String serviceId : serviceIds) {
            invocation.param("service_id", serviceId);
        }

        return invocation.execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Report> reports(String environmentId, String deploymentId) {
        return reports(environmentId, deploymentId, new ArrayList<String>());
    }
}
