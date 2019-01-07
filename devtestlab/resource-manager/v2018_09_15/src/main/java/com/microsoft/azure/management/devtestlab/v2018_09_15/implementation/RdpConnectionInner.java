/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a .rdp file.
 */
public class RdpConnectionInner {
    /**
     * The contents of the .rdp file.
     */
    @JsonProperty(value = "contents")
    private String contents;

    /**
     * Get the contents of the .rdp file.
     *
     * @return the contents value
     */
    public String contents() {
        return this.contents;
    }

    /**
     * Set the contents of the .rdp file.
     *
     * @param contents the contents value to set
     * @return the RdpConnectionInner object itself.
     */
    public RdpConnectionInner withContents(String contents) {
        this.contents = contents;
        return this;
    }

}
