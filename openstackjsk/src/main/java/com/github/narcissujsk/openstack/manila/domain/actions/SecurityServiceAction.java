package com.github.narcissujsk.openstack.manila.domain.actions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.model.ModelEntity;

/**
 * Security Service related actions.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public class SecurityServiceAction implements ModelEntity  {
    private static final long serialVersionUID = 1L;

    @JsonProperty("security_service_id")
    private String securityServiceId;

    protected SecurityServiceAction(String securityServiceId) {
        this.securityServiceId = securityServiceId;
    }

    /**
     * @return the security service ID
     */
    public String getSecurityServiceId() {
        return securityServiceId;
    }

    /**
     * Create an 'add security service' action.
     *
     * @param securityServiceId the security service ID to add
     * @return the add action
     */
    public static Add add(String securityServiceId) {
        return new Add(securityServiceId);
    }

    /**
     * Create a 'remove security service' action.
     *
     * @param securityServiceId the security service ID to remove
     * @return the remove action
     */
    public static Remove remove(String securityServiceId) {
        return new Remove(securityServiceId);
    }

    @JsonRootName("add_security_service")
    public static class Add extends SecurityServiceAction {
        private static final long serialVersionUID = 1L;

        public Add(String securityServiceId) {
            super(securityServiceId);
        }
    }

    @JsonRootName("remove_security_service")
    public static class Remove extends SecurityServiceAction {
        private static final long serialVersionUID = 1L;

        public Remove(String securityServiceId) {
            super(securityServiceId);
        }
    }
}
