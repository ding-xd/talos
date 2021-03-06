/**
 * Copyright 2012-2017 Kaixindai Financing Services Jiangsu Co., Ltd.
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
package com.kxd.talos.trace.interceptor.server.http;


import java.net.URI;

public interface HttpRequest {

    /**
     * Returns the entire URL, including the scheme, host and query parameters if available.
     *
     * @return Request URI.
     *
     * @see zipkin.TraceKeys#HTTP_URL
     */
    URI getUri();

    /**
     * Returns the http method for request (GET, PUT, POST,...)
     *
     * @return Http Method for request.
     */
    String getHttpMethod();

}
