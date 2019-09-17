package com.github.narcissujsk.model.magnum;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.ModelEntity;
import com.github.narcissujsk.model.magnum.EnvironmentBuilder;

public interface Environment extends ModelEntity, Buildable<EnvironmentBuilder> {
    /**
     * Gets path
     * @return path
     */
    String getPath();


    /**
     * Gets ldLibraryPath
     * @return ldLibraryPath
     */
    String getLdLibraryPath();


}
