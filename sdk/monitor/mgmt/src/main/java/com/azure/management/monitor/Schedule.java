// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Schedule model. */
@Fluent
public final class Schedule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Schedule.class);

    /*
     * frequency (in minutes) at which rule condition should be evaluated.
     */
    @JsonProperty(value = "frequencyInMinutes", required = true)
    private int frequencyInMinutes;

    /*
     * Time window for which data needs to be fetched for query (should be
     * greater than or equal to frequencyInMinutes).
     */
    @JsonProperty(value = "timeWindowInMinutes", required = true)
    private int timeWindowInMinutes;

    /**
     * Get the frequencyInMinutes property: frequency (in minutes) at which rule condition should be evaluated.
     *
     * @return the frequencyInMinutes value.
     */
    public int frequencyInMinutes() {
        return this.frequencyInMinutes;
    }

    /**
     * Set the frequencyInMinutes property: frequency (in minutes) at which rule condition should be evaluated.
     *
     * @param frequencyInMinutes the frequencyInMinutes value to set.
     * @return the Schedule object itself.
     */
    public Schedule withFrequencyInMinutes(int frequencyInMinutes) {
        this.frequencyInMinutes = frequencyInMinutes;
        return this;
    }

    /**
     * Get the timeWindowInMinutes property: Time window for which data needs to be fetched for query (should be greater
     * than or equal to frequencyInMinutes).
     *
     * @return the timeWindowInMinutes value.
     */
    public int timeWindowInMinutes() {
        return this.timeWindowInMinutes;
    }

    /**
     * Set the timeWindowInMinutes property: Time window for which data needs to be fetched for query (should be greater
     * than or equal to frequencyInMinutes).
     *
     * @param timeWindowInMinutes the timeWindowInMinutes value to set.
     * @return the Schedule object itself.
     */
    public Schedule withTimeWindowInMinutes(int timeWindowInMinutes) {
        this.timeWindowInMinutes = timeWindowInMinutes;
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
