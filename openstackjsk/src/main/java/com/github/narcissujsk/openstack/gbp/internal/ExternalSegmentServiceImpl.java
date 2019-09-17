package com.github.narcissujsk.openstack.gbp.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.api.gbp.ExternalSegmentService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.gbp.ExternalSegment;
import com.github.narcissujsk.openstack.gbp.domain.GbpExternalSegment;
import com.github.narcissujsk.openstack.gbp.domain.GbpExternalSegment.ExternalSegments;
import com.github.narcissujsk.openstack.networking.internal.BaseNetworkingServices;
/**
 * External Segment API Implementation
 * 
 * @author vinod borole
 */
public class ExternalSegmentServiceImpl extends BaseNetworkingServices implements ExternalSegmentService {

    /**
     * {@inheritDoc}
     */
    @Override 
    public List<? extends ExternalSegment> list() {
        return get(ExternalSegments.class, uri("/grouppolicy/external_segments")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public List<? extends ExternalSegment> list(Map<String, String> filteringParams) {
        Invocation<ExternalSegments> externalSegmentInvocation = buildInvocation(filteringParams);
        return externalSegmentInvocation.execute().getList();
    }
    private Invocation<ExternalSegments> buildInvocation(Map<String, String> filteringParams) {
        Invocation<ExternalSegments> externalSegmentInvocation = get(ExternalSegments.class, "/grouppolicy/external_segments");
        if (filteringParams == null) {
            return externalSegmentInvocation;
        } 
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                externalSegmentInvocation = externalSegmentInvocation.param(entry.getKey(), entry.getValue());
            }
        }
        return externalSegmentInvocation;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalSegment get(String id) {
        checkNotNull(id);
        return get(GbpExternalSegment.class, uri("/grouppolicy/external_segments/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/grouppolicy/external_segments/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalSegment create(ExternalSegment externalSegment) {
        return post(GbpExternalSegment.class, uri("/grouppolicy/external_segments")).entity(externalSegment).execute();
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public ExternalSegment update(String externalSegmentId, ExternalSegment externalSegment) {
        checkNotNull(externalSegmentId);
        checkNotNull(externalSegment);
        return put(GbpExternalSegment.class, uri("/grouppolicy/external_segments/%s", externalSegmentId)).entity(externalSegment).execute();
    }

}
