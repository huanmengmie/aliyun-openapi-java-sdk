/*
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
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.transform;

import com.aliyuncs.cms.model.NodeProcessCreateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class NodeProcessCreateResponseUnmarshaller {

	public static NodeProcessCreateResponse unmarshall(NodeProcessCreateResponse nodeProcessCreateResponse, UnmarshallerContext context) {
		
		nodeProcessCreateResponse.setRequestId(context.stringValue("NodeProcessCreateResponse.RequestId"));
		nodeProcessCreateResponse.setErrorCode(context.integerValue("NodeProcessCreateResponse.ErrorCode"));
		nodeProcessCreateResponse.setErrorMessage(context.stringValue("NodeProcessCreateResponse.ErrorMessage"));
		nodeProcessCreateResponse.setSuccess(context.booleanValue("NodeProcessCreateResponse.Success"));
	 
	 	return nodeProcessCreateResponse;
	}
}