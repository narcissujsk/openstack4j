package com.github.narcissujsk.api.storage;

import com.github.narcissujsk.common.RestService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.storage.block.BlockQuotaSet;
import com.github.narcissujsk.model.storage.block.BlockQuotaSetUsage;

/**
 * Quota-Set Extension API for Block Storage
 * 
 * @author Jeremy Unruh
 */
public interface BlockQuotaSetService extends RestService {

    /**
     * Gets default quotas for a tenant
     * 
     * @param tenantId the tenant identifier
     * @return the default quotas
     */
    BlockQuotaSet getDefaults(String tenantId);

    /**
     * Gets quotas for a tenant
     * 
     * @param tenantId the tenant identifier
     * @return the quotas for a tenant
     */
    BlockQuotaSet get(String tenantId);
    
    /**
     * Updates quotas for a tenant
     * 
     * @param tenantId the tenant identifier
     * @param quota the quota-set to update
     * @return the updated quotas
     */
    BlockQuotaSet updateForTenant(String tenantId, BlockQuotaSet quota);
    
    /**
     * Deletes quotas for a tenant so the quotas revert to default values
     * 
     * @param tenantId the tenant identifier
     * @return the action response
     */
    ActionResponse delete(String tenantId);

    /**
     * Gets details for quotas for a specified tenant
     * 
     * @param tenantId the tenant identifier
     * @return the quota usage details
     */
    BlockQuotaSetUsage usageForTenant(String tenantId);
    
    /**
     * Gets details for quotas for a specified tenant and user.
     * 
     * @param tenantId the tenant identifier
     * @param userId the user identifier
     * @return the quota usage details
     */
    BlockQuotaSetUsage usageForUser(String tenantId, String userId);
    
}
