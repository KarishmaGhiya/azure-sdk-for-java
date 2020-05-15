// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.network.EffectiveRoute;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The EffectiveRouteListResult model. */
@Fluent
public final class EffectiveRouteListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EffectiveRouteListResultInner.class);

    /*
     * A list of effective routes.
     */
    @JsonProperty(value = "value")
    private List<EffectiveRoute> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of effective routes.
     *
     * @return the value value.
     */
    public List<EffectiveRoute> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of effective routes.
     *
     * @param value the value value to set.
     * @return the EffectiveRouteListResultInner object itself.
     */
    public EffectiveRouteListResultInner withValue(List<EffectiveRoute> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
