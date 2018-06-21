/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2017_10_01.ConnectivityHop;
import com.microsoft.azure.management.network.v2017_10_01.ConnectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information on the connectivity status.
 */
public class ConnectivityInformationInner {
    /**
     * List of hops between the source and the destination.
     */
    @JsonProperty(value = "hops", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityHop> hops;

    /**
     * The connection status. Possible values include: 'Unknown', 'Connected',
     * 'Disconnected', 'Degraded'.
     */
    @JsonProperty(value = "connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ConnectionStatus connectionStatus;

    /**
     * Average latency in milliseconds.
     */
    @JsonProperty(value = "avgLatencyInMs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer avgLatencyInMs;

    /**
     * Minimum latency in milliseconds.
     */
    @JsonProperty(value = "minLatencyInMs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer minLatencyInMs;

    /**
     * Maximum latency in milliseconds.
     */
    @JsonProperty(value = "maxLatencyInMs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxLatencyInMs;

    /**
     * Total number of probes sent.
     */
    @JsonProperty(value = "probesSent", access = JsonProperty.Access.WRITE_ONLY)
    private Integer probesSent;

    /**
     * Number of failed probes.
     */
    @JsonProperty(value = "probesFailed", access = JsonProperty.Access.WRITE_ONLY)
    private Integer probesFailed;

    /**
     * Get list of hops between the source and the destination.
     *
     * @return the hops value
     */
    public List<ConnectivityHop> hops() {
        return this.hops;
    }

    /**
     * Get the connection status. Possible values include: 'Unknown', 'Connected', 'Disconnected', 'Degraded'.
     *
     * @return the connectionStatus value
     */
    public ConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get average latency in milliseconds.
     *
     * @return the avgLatencyInMs value
     */
    public Integer avgLatencyInMs() {
        return this.avgLatencyInMs;
    }

    /**
     * Get minimum latency in milliseconds.
     *
     * @return the minLatencyInMs value
     */
    public Integer minLatencyInMs() {
        return this.minLatencyInMs;
    }

    /**
     * Get maximum latency in milliseconds.
     *
     * @return the maxLatencyInMs value
     */
    public Integer maxLatencyInMs() {
        return this.maxLatencyInMs;
    }

    /**
     * Get total number of probes sent.
     *
     * @return the probesSent value
     */
    public Integer probesSent() {
        return this.probesSent;
    }

    /**
     * Get number of failed probes.
     *
     * @return the probesFailed value
     */
    public Integer probesFailed() {
        return this.probesFailed;
    }

}
