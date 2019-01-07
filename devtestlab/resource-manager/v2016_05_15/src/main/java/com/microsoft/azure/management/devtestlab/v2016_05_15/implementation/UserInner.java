/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlab.v2016_05_15.UserIdentity;
import com.microsoft.azure.management.devtestlab.v2016_05_15.UserSecretStore;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Profile of a lab user.
 */
@JsonFlatten
@SkipParentValidation
public class UserInner extends Resource {
    /**
     * The identity of the user.
     */
    @JsonProperty(value = "properties.identity")
    private UserIdentity identity;

    /**
     * The secret store of the user.
     */
    @JsonProperty(value = "properties.secretStore")
    private UserSecretStore secretStore;

    /**
     * The creation date of the user profile.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDate;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the identity of the user.
     *
     * @return the identity value
     */
    public UserIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the user.
     *
     * @param identity the identity value to set
     * @return the UserInner object itself.
     */
    public UserInner withIdentity(UserIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the secret store of the user.
     *
     * @return the secretStore value
     */
    public UserSecretStore secretStore() {
        return this.secretStore;
    }

    /**
     * Set the secret store of the user.
     *
     * @param secretStore the secretStore value to set
     * @return the UserInner object itself.
     */
    public UserInner withSecretStore(UserSecretStore secretStore) {
        this.secretStore = secretStore;
        return this;
    }

    /**
     * Get the creation date of the user profile.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the UserInner object itself.
     */
    public UserInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the unique immutable identifier of a resource (Guid).
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the UserInner object itself.
     */
    public UserInner withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}
