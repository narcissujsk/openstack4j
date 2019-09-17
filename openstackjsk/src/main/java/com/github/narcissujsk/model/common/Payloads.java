package com.github.narcissujsk.model.common;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import com.github.narcissujsk.model.common.Payload;
import com.github.narcissujsk.model.common.payloads.FilePayload;
import com.github.narcissujsk.model.common.payloads.InputStreamPayload;
import com.github.narcissujsk.model.common.payloads.URLPayload;

/**
 * Utility class for creating supported Payloads.
 *
 * @author Jeremy Unruh
 */
public class Payloads {

	/**
	 * Creates a new File based Payload
	 *
	 * @param file the file to send
	 * @return the Payload
	 */
	public static com.github.narcissujsk.model.common.Payload<File> create(File file) {
		return new FilePayload(file);
	}
	
	/**
	 * Creates a new Input Stream based Payload
	 *
	 * @param stream the input stream
	 * @return the Payload
	 */
	public static com.github.narcissujsk.model.common.Payload<InputStream> create(InputStream stream) {
		return new InputStreamPayload(stream);
	}
	
	/**
	 * Creates a new URL based Payload allowing direct upload from the URL
	 *
	 * @param url the URL
	 * @return the Payload
	 */
	public static Payload<URL> create(URL url) {
		return new URLPayload(url);
	}
	
}
