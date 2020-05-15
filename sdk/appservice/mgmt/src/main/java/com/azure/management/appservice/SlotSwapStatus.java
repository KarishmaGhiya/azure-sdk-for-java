// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The SlotSwapStatus model. */
@Immutable
public final class SlotSwapStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SlotSwapStatus.class);

    /*
     * The time the last successful slot swap completed.
     */
    @JsonProperty(value = "timestampUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestampUtc;

    /*
     * The source slot of the last swap operation.
     */
    @JsonProperty(value = "sourceSlotName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceSlotName;

    /*
     * The destination slot of the last swap operation.
     */
    @JsonProperty(value = "destinationSlotName", access = JsonProperty.Access.WRITE_ONLY)
    private String destinationSlotName;

    /**
     * Get the timestampUtc property: The time the last successful slot swap completed.
     *
     * @return the timestampUtc value.
     */
    public OffsetDateTime timestampUtc() {
        return this.timestampUtc;
    }

    /**
     * Get the sourceSlotName property: The source slot of the last swap operation.
     *
     * @return the sourceSlotName value.
     */
    public String sourceSlotName() {
        return this.sourceSlotName;
    }

    /**
     * Get the destinationSlotName property: The destination slot of the last swap operation.
     *
     * @return the destinationSlotName value.
     */
    public String destinationSlotName() {
        return this.destinationSlotName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
