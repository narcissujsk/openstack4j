package com.github.narcissujsk.model.identity.v3;

import java.util.List;

import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.ResourceEntity;

public interface Authentication extends ModelEntity {

    Identity getIdentity();

    Scope getScope();

    public interface Identity {

        Password getPassword();

        Token getToken();

        List<String> getMethods();

        public interface Password {

            User getUser();

            public interface User extends ResourceEntity {

                Domain getDomain();

                String getPassword();

                public interface Domain extends ResourceEntity {
                }
            }
        }

        public interface Token {

            String getId();

        }

    }

    public interface Scope {

        Project getProject();

        Domain getDomain();

        public interface Project extends ResourceEntity {

            Domain getDomain();
        }

        public interface Domain extends ResourceEntity {
        }

    }

}
