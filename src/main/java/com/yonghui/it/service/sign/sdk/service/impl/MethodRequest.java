/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yonghui.it.service.sign.sdk.service.impl;

import org.springframework.lang.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Java 5 enumeration of HTTP request methods. Intended for use
 * with {@link org.springframework.http.client.ClientHttpRequest}
 * and {@link org.springframework.web.client.RestTemplate}.
 *
 * @author Arjen Poutsma
 * @author Juergen Hoeller
 * @since 3.0
 */
public enum MethodRequest {

	GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE;


	private static final Map<String, MethodRequest> mappings = new HashMap<>(16);

	static {
		for (MethodRequest httpMethod : values()) {
			mappings.put(httpMethod.name(), httpMethod);
		}
	}


	/**
	 * Resolve the given method value to an {@code MethodRequest}.
	 * @param method the method value as a String
	 * @return the corresponding {@code MethodRequest}, or {@code null} if not found
	 * @since 4.2.4
	 */
	@Nullable
	public static MethodRequest resolve(@Nullable String method) {
		return (method != null ? mappings.get(method) : null);
	}


	/**
	 * Determine whether this {@code MethodRequest} matches the given
	 * method value.
	 * @param method the method value as a String
	 * @return {@code true} if it matches, {@code false} otherwise
	 * @since 4.2.4
	 */
	public boolean matches(String method) {
		return (this == resolve(method));
	}

}
