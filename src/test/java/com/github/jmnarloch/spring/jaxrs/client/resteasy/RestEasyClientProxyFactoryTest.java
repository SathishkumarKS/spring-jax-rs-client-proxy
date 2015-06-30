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
package com.github.jmnarloch.spring.jaxrs.client.resteasy;

import com.github.jmnarloch.spring.jaxrs.resource.EchoResource;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Tests the {@link RestEasyClientProxyFactory} class.
 *
 * @author Jakub Narloch
 */
public class RestEasyClientProxyFactoryTest {

    /**
     * The instance of tested class.
     */
    private RestEasyClientProxyFactory instance;

    /**
     * Sets up the test environment.
     *
     * @throws Exception if any error occurs
     */
    @Before
    public void setUp() throws Exception {

        instance = new RestEasyClientProxyFactory();
    }

    /**
     * Test the creation of the service proxy.
     */
    @Test
    public void shouldCreateServiceProxy() {

        // given
        final Class<EchoResource> serviceClass = EchoResource.class;
        final String serviceUrl = "http://localhost:8080/api";

        // when
        EchoResource proxy = instance.createClientProxy(serviceClass, serviceUrl);

        // then
        assertNotNull(proxy);
    }
}