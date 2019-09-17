package com.github.narcissujsk.model.magnum;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.magnum.Environment;

public interface EnvironmentBuilder extends Builder<EnvironmentBuilder, com.github.narcissujsk.model.magnum.Environment> {
    /**
     * @see com.github.narcissujsk.model.magnum.Environment#getPath
     */
    EnvironmentBuilder path(String path);

    /**
     * @see Environment#getLdLibraryPath
     */
    EnvironmentBuilder ldLibraryPath(String ldLibraryPath);

}
