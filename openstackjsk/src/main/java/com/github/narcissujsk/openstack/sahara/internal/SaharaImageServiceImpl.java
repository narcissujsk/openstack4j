package com.github.narcissujsk.openstack.sahara.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.api.sahara.SaharaImageService;
import com.github.narcissujsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.common.ActionResponse;
import com.github.narcissujsk.model.sahara.Image;
import com.github.narcissujsk.openstack.sahara.domain.SaharaImage;
import com.github.narcissujsk.openstack.sahara.domain.SaharaImage.SaharaImages;

/**
 * Sahara Data Processing Operations
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 */
public class SaharaImageServiceImpl extends BaseSaharaServices implements SaharaImageService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Image> list() {
        return get(SaharaImages.class, uri("/images")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Image> list(String... tags) {
        Invocation<SaharaImages> invoke = get(SaharaImages.class, uri("/images"));
        for (String tag : tags) {
           invoke = invoke.param("tags",tag);
        }
        return invoke.execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image get(String imageId) {
        checkNotNull(imageId);
        return get(SaharaImage.class, uri("/images/%s", imageId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image register(String imageId, String username, String description) {
        checkNotNull(imageId);
        checkNotNull(username);
        RegisterImageRequest reg = new RegisterImageRequest(username,description);
        return post(SaharaImage.class, uri("/images/%s",imageId))
                     .entity(reg)  // setup request
                     .execute(ExecutionOptions.<SaharaImage>create(PropagateOnStatus.on(404))); // Use respongse progagation for "Not found" status to throw exception instead of return null
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse unregister(String imageId) {
        checkNotNull(imageId);
        return deleteWithResponse(uri("/images/%s", imageId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image tag(String imageId, String... tags) {
        checkNotNull(imageId);
        checkNotNull(tags);
        return post(SaharaImage.class, uri("/images/%s/tag", imageId)).entity(new UpdateTagsRequest(tags)).execute(ExecutionOptions.<SaharaImage>create(PropagateOnStatus.on(404))); // Use respongse progagation for "Not found" status to throw exception instead of return null
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image untag(String imageId, String... tags) {
        checkNotNull(imageId);
        checkNotNull(tags);
        return post(SaharaImage.class, uri("/images/%s/untag", imageId)).entity(new UpdateTagsRequest(tags)).execute(ExecutionOptions.<SaharaImage>create(PropagateOnStatus.on(404))); // Use respongse progagation for "Not found" status to throw exception instead of return null
    }

    public class RegisterImageRequest implements ModelEntity {
        public static final long serialVersionUID = 1L;

        private String username;
        private String description;

        public RegisterImageRequest(String username, String description) {
           this.username = username;
           this.description = description;
        }

        /**
         * @return username information
         */
        public String getUsername() {
           return username;
        }

        /**
         * @return description
         */
        public String getDescription() {
           return description;
        }

    }

    public class UpdateTagsRequest implements ModelEntity {
        public static final long serialVersionUID = 1L;

        private String[] tags;

        public UpdateTagsRequest(String... tags) {
           this.tags = tags;
        }

        /**
         * @return tags
         */
        public String[] getTags() {
           return tags;
        }

    }
}
