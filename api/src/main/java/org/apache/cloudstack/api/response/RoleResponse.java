// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.cloudstack.api.response;

import org.apache.cloudstack.acl.Role;
import org.apache.cloudstack.acl.RoleType;
import org.apache.cloudstack.api.ApiConstants;
import org.apache.cloudstack.api.EntityReference;

import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;

@EntityReference(value = Role.class)
public class RoleResponse extends BaseRoleResponse {

    @SerializedName(ApiConstants.TYPE)
    @Param(description = "the type of the role")
    private String roleType;

    @SerializedName(ApiConstants.IS_DEFAULT)
    @Param(description = "true if role is default, false otherwise")
    private Boolean isDefault;

    @SerializedName(ApiConstants.STATE)
    @Param(description = "the state of the role")
    private String state;

    public void setRoleType(RoleType roleType) {
        if (roleType != null) {
            this.roleType = roleType.name();
        }
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setState(String state) {
        this.state = state;
    }
}
