package com.github.narcissujsk.api.gbp;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.gbp.ExternalSegment;

/**
 * This interface defines all methods for the manipulation of external segments
 * 
 * @author vinod borole
 * 
 */ 
public interface ExternalSegmentService {
    /**
     * List all external segment
     * 
     * @return List of external segment
     */
    List<? extends ExternalSegment> list();
    /**
     * Returns list of external segments filtered by parameters.
     * 
     * @param filteringParams map (name, value) of filtering parameters
     * @return 
     */
    List<? extends ExternalSegment> list(Map<String, String> filteringParams);
    /**
     * Get the specified external segment by ID
     *
     * @param id the external segment id
     * @return external segment or null if not found
     */
    ExternalSegment get(String id);
    /**
     * Delete of the external segment
     * @param id the external segment id
     * @return the action response
     */
    ActionResponse delete(String id);
    /**
     * Create a new external segment
     *
     * @param external segment
     * @return the newly created external segment
     */
    ExternalSegment create(ExternalSegment externalSegment);
    /**
     * Updates an existing external segment
     * 
     * @param external segment identifier
     * @param external segment that is be used to updated
     * @return the updated external segment
     */
    ExternalSegment update(String externalSegmentId, ExternalSegment externalSegment);
}
