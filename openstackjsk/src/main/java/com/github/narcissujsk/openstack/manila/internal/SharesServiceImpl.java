package com.github.narcissujsk.openstack.manila.internal;

import com.github.narcissujsk.api.manila.SharesService;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.manila.Access;
import com.github.narcissujsk.model.manila.Share;
import com.github.narcissujsk.model.manila.ShareCreate;
import com.github.narcissujsk.model.manila.ShareUpdateOptions;
import com.github.narcissujsk.model.manila.actions.AccessOptions;
import com.github.narcissujsk.model.manila.builder.ShareCreateBuilder;
import com.github.narcissujsk.openstack.common.Metadata;
import com.github.narcissujsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstack.manila.domain.ManilaAccess;
import com.github.narcissujsk.openstack.manila.domain.ManilaAccess.AccessList;
import com.github.narcissujsk.openstack.manila.domain.ManilaShare;
import com.github.narcissujsk.openstack.manila.domain.ManilaShareCreate;
import com.github.narcissujsk.openstack.manila.domain.ManilaShareUpdate;
import com.github.narcissujsk.openstack.manila.domain.actions.ShareAction;
import com.github.narcissujsk.openstack.manila.domain.actions.ShareActions;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class SharesServiceImpl extends BaseShareServices implements SharesService {
    /**
     * {@inheritDoc}
     */
    @Override
    public Share create(ShareCreate shareCreate) {
        checkNotNull(shareCreate);
        return post(ManilaShare.class, uri("/shares"))
                .entity(shareCreate)
                .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Share> list() {
        return list(false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Share> listDetails() {
        return list(true);
    }

    private List<? extends Share> list(boolean detail) {
        return get(ManilaShare.Shares.class, uri("/shares" +  (detail ? "/detail" : "")))
                .execute()
                .getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Share get(String shareId) {
        checkNotNull(shareId);
        return get(ManilaShare.class, uri("/shares/%s", shareId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Share update(String shareId, ShareUpdateOptions shareUpdateOptions) {
        checkNotNull(shareId);
        checkNotNull(shareUpdateOptions);

        return put(ManilaShare.class, uri("/shares/%s", shareId))
                .entity(ManilaShareUpdate.fromOptions(shareUpdateOptions))
                .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String shareId) {
        checkNotNull(shareId);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/shares/%s", shareId)).executeWithResponse());
    }

    @Override
    public ActionResponse delete(String shareId, String consistencyGroupId) {
        checkNotNull(shareId);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/shares/%s", shareId))
                        .param(consistencyGroupId != null, "consistency_group_id ", consistencyGroupId)
                        .executeWithResponse());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Metadata getMetadata(String shareId) {
        checkNotNull(shareId);
        return get(Metadata.class, uri("/shares/%s/metadata", shareId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Metadata updateMetadata(String shareId, Metadata metadata) {
        checkNotNull(shareId);
        checkNotNull(metadata);

        return put(Metadata.class, uri("/shares/%s/metadata", shareId))
                .entity(metadata)
                .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Metadata setMetadata(String shareId, Metadata metadata) {
        checkNotNull(shareId);
        checkNotNull(metadata);

        return post(Metadata.class, uri("/shares/%s/metadata/", shareId))
                .entity(metadata)
                .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse unsetMetadata(String shareId, String metadataKey) {
        checkNotNull(shareId);
        checkNotNull(metadataKey);

        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/shares/%s/metadata/%s", shareId, metadataKey)).executeWithResponse());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Access grantAccess(String shareId, AccessOptions options) {
        checkNotNull(shareId);
        checkNotNull(options);

        return invokeAction(ManilaAccess.class, shareId, ShareActions.grantAccess(options));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse revokeAccess(String shareId, String accessId) {
        checkNotNull(shareId);
        checkNotNull(accessId);

        return invokeAction(shareId, ShareActions.revokeAccess(accessId));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Access> listAccess(String shareId) {
        checkNotNull(shareId);
        return invokeAction(AccessList.class, shareId, ShareActions.listAccessRules()).getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse resetState(String shareId, Share.Status status) {
        checkNotNull(shareId);
        checkNotNull(status);

        return invokeAction(shareId, ShareActions.resetState(status));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse forceDelete(String shareId) {
        checkNotNull(shareId);
        return invokeAction(shareId, ShareActions.forceDelete());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse extend(String shareId, int newSize) {
        checkNotNull(shareId);
        return invokeAction(shareId, ShareActions.extend(newSize));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse shrink(String shareId, int newSize) {
        checkNotNull(shareId);
        return invokeAction(shareId, ShareActions.shrink(newSize));
    }

    /**
     * Invoke the action on teh given share and unserialize the response body into the given return type.
     *
     * @param returnType the return type to unserialize to
     * @param shareId the share ID
     * @param action the action to invoke
     * @param <R> The type of the return type
     * @return the unserialized response body of the server
     */
    private <R> R invokeAction(Class<R> returnType, String shareId, ShareAction action) {
        return post(returnType, uri("/shares/%s/action", shareId))
                .entity(action)
                .execute();
    }

    /**
     * Invoke the action on the given share.
     *
     * @param shareId the share ID
     * @param action the action to invoke
     * @return the action response of the server
     */
    private ActionResponse invokeAction(String shareId, ShareAction action) {
        return ToActionResponseFunction.INSTANCE.apply(
                post(Void.class, uri("/shares/%s/action", shareId))
                        .entity(action)
                        .executeWithResponse());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareCreateBuilder shareCreateBuilder() {
        return ManilaShareCreate.builder();
    }
}
