/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.api.services.parsers;

import org.apache.ambari.server.api.services.RequestBody;

/**
 * Parse the provided String into a map of properties and associated values.
 */
public interface RequestBodyParser {
  /**
   * Path to the query property.
   */
  public static final String QUERY_FIELD_PATH = "RequestInfo/query";

  /**
   * Path to the body object.
   */
  public static final String BODY_TITLE = "Body";

  /**
   * Parse the provided string into a request body which contains all properties in the string.
   *
   *
   * @param s  the string body to be parsed
   *
   * @return RequestBody instance containing all properties in the string
   */
  public RequestBody parse(String s) throws BodyParseException;
}
