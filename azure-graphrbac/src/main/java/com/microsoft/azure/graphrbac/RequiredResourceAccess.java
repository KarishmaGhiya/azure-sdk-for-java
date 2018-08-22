/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the set of OAuth 2.0 permission scopes and app roles under the
 * specified resource that an application requires access to. The specified
 * OAuth 2.0 permission scopes may be requested by client applications (through
 * the requiredResourceAccess collection) when calling a resource application.
 * The requiredResourceAccess property of the Application entity is a
 * collection of ReqiredResourceAccess.
 */
public class RequiredResourceAccess {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The list of OAuth2.0 permission scopes and app roles that the
     * application requires from the specified resource.
     */
    @JsonProperty(value = "resourceAccess", required = true)
    private List<ResourceAccess> resourceAccess;

    /**
     * The unique identifier for the resource that the application requires
     * access to. This should be equal to the appId declared on the target
     * resource application.
     */
    @JsonProperty(value = "resourceAppId")
    private String resourceAppId;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the RequiredResourceAccess object itself.
     */
    public RequiredResourceAccess withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     *
     * @return the resourceAccess value
     */
    public List<ResourceAccess> resourceAccess() {
        return this.resourceAccess;
    }

    /**
     * Set the list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     *
     * @param resourceAccess the resourceAccess value to set
     * @return the RequiredResourceAccess object itself.
     */
    public RequiredResourceAccess withResourceAccess(List<ResourceAccess> resourceAccess) {
        this.resourceAccess = resourceAccess;
        return this;
    }

    /**
     * Get the unique identifier for the resource that the application requires access to. This should be equal to the appId declared on the target resource application.
     *
     * @return the resourceAppId value
     */
    public String resourceAppId() {
        return this.resourceAppId;
    }

    /**
     * Set the unique identifier for the resource that the application requires access to. This should be equal to the appId declared on the target resource application.
     *
     * @param resourceAppId the resourceAppId value to set
     * @return the RequiredResourceAccess object itself.
     */
    public RequiredResourceAccess withResourceAppId(String resourceAppId) {
        this.resourceAppId = resourceAppId;
        return this;
    }

}
