package com.github.narcissujsk.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.model.network.ext.ListenerV2Update;
import com.github.narcissujsk.model.network.ext.builder.ListenerV2UpdateBuilder;

/**
 * Entity for updating lbaas v2 listener
 * @author emjburns
 */
@JsonRootName("listener")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronListenerV2Update implements ListenerV2Update {

    private static final long serialVersionUID = 1L;

    private String name;

    private String description;

    @JsonProperty("admin_state_up")
    private boolean adminStateUp = true;

    /**
     * The maximum number of connections allowed for the listener. Default is -1, meaning no limit.
     */
    @JsonProperty("connection_limit")
    private Integer connectionLimit;

    @JsonProperty("default_tls_container_ref")
    private String defaultTlsContainerRef;

    /**
     * {@inheritDoc}
     */
    @Override
    public ListenerV2UpdateBuilder toBuilder(){
        return new ListenerV2UpdateConcreteBuilder(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAdminStateUp(){
        return adminStateUp;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription(){
        return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getConnectionLimit(){
        return connectionLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDefaultTlsContainerRef(){
        return defaultTlsContainerRef;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("adminStateUp", adminStateUp)
                .add("description", description)
                .add("name", name)
                .add("connectionLimit", connectionLimit)
                .add("defaultTlsContainerRef", defaultTlsContainerRef)
                .toString();
    }

    public static class ListenerV2UpdateConcreteBuilder implements ListenerV2UpdateBuilder {
        private NeutronListenerV2Update m;

        public ListenerV2UpdateConcreteBuilder(){
            this(new NeutronListenerV2Update());
        }

        public ListenerV2UpdateConcreteBuilder(NeutronListenerV2Update m){
            this.m = m;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2Update build(){
            return m;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder from(ListenerV2Update in){
            m = (NeutronListenerV2Update) in;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder name(String name){
            m.name = name;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder description(String description){
            m.description = description;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder adminStateUp(boolean adminStateUp){
            m.adminStateUp = adminStateUp;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder connectionLimit(Integer connectionLimit){
            m.connectionLimit = connectionLimit;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ListenerV2UpdateBuilder defaultTlsContainerRef(String defaultTlsContainerRef){
            m.defaultTlsContainerRef = defaultTlsContainerRef;
            return this;
        }
    }

    public static ListenerV2UpdateBuilder builder() {
        return new ListenerV2UpdateConcreteBuilder();
    }
}
