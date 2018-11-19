/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.engagementfabric.implementation;

import com.microsoft.azure.management.engagementfabric.CheckNameUnavailableReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of name availability check.
 */
public class CheckNameAvailabilityResultInner {
    /**
     * The name to be checked.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /**
     * The reason if name is unavailable. Possible values include: 'Invalid',
     * 'AlreadyExists'.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private CheckNameUnavailableReason reason;

    /**
     * The message if name is unavailable.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get the name to be checked.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason if name is unavailable. Possible values include: 'Invalid', 'AlreadyExists'.
     *
     * @return the reason value
     */
    public CheckNameUnavailableReason reason() {
        return this.reason;
    }

    /**
     * Get the message if name is unavailable.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
