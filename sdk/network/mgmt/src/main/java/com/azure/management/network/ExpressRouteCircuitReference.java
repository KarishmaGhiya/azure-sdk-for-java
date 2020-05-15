// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpressRouteCircuitReference model. */
@Fluent
public final class ExpressRouteCircuitReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitReference.class);

    /*
     * Corresponding Express Route Circuit Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: Corresponding Express Route Circuit Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Corresponding Express Route Circuit Id.
     *
     * @param id the id value to set.
     * @return the ExpressRouteCircuitReference object itself.
     */
    public ExpressRouteCircuitReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
