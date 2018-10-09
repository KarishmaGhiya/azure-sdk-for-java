/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error response from the Batch AI service.
 */
public class BatchAIError {
    /**
     * An identifier for the error. Codes are invariant and are intended to be
     * consumed programmatically.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * A message describing the error, intended to be suitable for display in a
     * user interface.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * A list of additional details about the error.
     */
    @JsonProperty(value = "details")
    private List<NameValuePair> details;

    /**
     * Get an identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set an identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     *
     * @param code the code value to set
     * @return the BatchAIError object itself.
     */
    public BatchAIError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get a message describing the error, intended to be suitable for display in a user interface.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set a message describing the error, intended to be suitable for display in a user interface.
     *
     * @param message the message value to set
     * @return the BatchAIError object itself.
     */
    public BatchAIError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get a list of additional details about the error.
     *
     * @return the details value
     */
    public List<NameValuePair> details() {
        return this.details;
    }

    /**
     * Set a list of additional details about the error.
     *
     * @param details the details value to set
     * @return the BatchAIError object itself.
     */
    public BatchAIError withDetails(List<NameValuePair> details) {
        this.details = details;
        return this;
    }

}
