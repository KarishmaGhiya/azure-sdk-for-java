// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The AzureReachabilityReportLatencyInfo model. */
@Fluent
public final class AzureReachabilityReportLatencyInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureReachabilityReportLatencyInfo.class);

    /*
     * The time stamp.
     */
    @JsonProperty(value = "timeStamp")
    private OffsetDateTime timestamp;

    /*
     * The relative latency score between 1 and 100, higher values indicating a
     * faster connection.
     */
    @JsonProperty(value = "score")
    private Integer score;

    /**
     * Get the timestamp property: The time stamp.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: The time stamp.
     *
     * @param timestamp the timestamp value to set.
     * @return the AzureReachabilityReportLatencyInfo object itself.
     */
    public AzureReachabilityReportLatencyInfo withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the score property: The relative latency score between 1 and 100, higher values indicating a faster
     * connection.
     *
     * @return the score value.
     */
    public Integer score() {
        return this.score;
    }

    /**
     * Set the score property: The relative latency score between 1 and 100, higher values indicating a faster
     * connection.
     *
     * @param score the score value to set.
     * @return the AzureReachabilityReportLatencyInfo object itself.
     */
    public AzureReachabilityReportLatencyInfo withScore(Integer score) {
        this.score = score;
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
