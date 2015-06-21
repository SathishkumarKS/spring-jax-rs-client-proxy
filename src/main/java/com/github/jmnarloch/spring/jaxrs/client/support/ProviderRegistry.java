/**
 * Copyright (c) 2015 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jmnarloch.spring.jaxrs.client.support;

import java.util.ArrayList;
import java.util.List;

/**
 * The registry that stores the providers.
 *
 * @author Jakub Narloch
 */
public class ProviderRegistry {

    /**
     * The list of providers.
     */
    private final List<Class<?>> providers = new ArrayList<Class<?>>();

    /**
     * Adds the provider.
     *
     * @param providerClass the provider class
     * @return the {@code this} instance
     */
    public ProviderRegistry addProvider(Class<?> providerClass) {
        providers.add(providerClass);
        return this;
    }

    /**
     * Returns the providers list.
     *
     * @return the provider list
     */
    protected List<Class<?>> getProviders() {
        return providers;
    }
}
