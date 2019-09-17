package com.github.narcissujsk.model.tacker.builder;

import com.github.narcissujsk.common.Buildable.Builder;
import com.github.narcissujsk.model.tacker.Vim;
import com.github.narcissujsk.openstack.tacker.domain.AuthCredentials;
import com.github.narcissujsk.openstack.tacker.domain.VimProject;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public interface VimBuilder extends Builder<VimBuilder, Vim> {
	
	/**
	 * @param name : Human readable name for the Vim (255 characters limit). Does not have to be unique.
	 * @return VimBuilder
	 */
	VimBuilder name(String name);

	/**
	 * @param description : Human readable description for the Vim (1024 characters limit).
	 * @return VimBuilder
	 */
	VimBuilder description(String description);
	
	/**
	 * @param authUrl
	 * @return VimBuilder
	 */
	VimBuilder authUrl(String authUrl);
	
	/**
	 * @param vimProject
	 * @return VimBuilder
	 */
	VimBuilder vimProject(VimProject vimProject);
	
	/**
	 * @param authCredentials
	 * @return VimBuilder
	 */
	VimBuilder authCredentials(AuthCredentials authCredentials);
	
	/**
	 * @param isDefault
	 * @return VimBuilder
	 */
	VimBuilder isDefault(Boolean isDefault);
	
	/**
	 * @param type
	 * @return VimBuilder
	 */
	VimBuilder type(String type);
	
}
