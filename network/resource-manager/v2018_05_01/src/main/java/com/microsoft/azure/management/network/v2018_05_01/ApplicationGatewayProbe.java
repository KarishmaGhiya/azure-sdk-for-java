/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Probe of the application gateway.
 */
@JsonFlatten
public class ApplicationGatewayProbe extends SubResource {
    /**
     * The protocol used for the probe. Possible values are 'Http' and 'Https'.
     * Possible values include: 'Http', 'Https'.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /**
     * Host name to send the probe to.
     */
    @JsonProperty(value = "properties.host")
    private String host;

    /**
     * Relative path of probe. Valid path starts from '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /**
     * The probing interval in seconds. This is the time interval between two
     * consecutive probes. Acceptable values are from 1 second to 86400
     * seconds.
     */
    @JsonProperty(value = "properties.interval")
    private Integer interval;

    /**
     * the probe timeout in seconds. Probe marked as failed if valid response
     * is not received with this timeout period. Acceptable values are from 1
     * second to 86400 seconds.
     */
    @JsonProperty(value = "properties.timeout")
    private Integer timeout;

    /**
     * The probe retry count. Backend server is marked down after consecutive
     * probe failure count reaches UnhealthyThreshold. Acceptable values are
     * from 1 second to 20.
     */
    @JsonProperty(value = "properties.unhealthyThreshold")
    private Integer unhealthyThreshold;

    /**
     * Whether the host header should be picked from the backend http settings.
     * Default value is false.
     */
    @JsonProperty(value = "properties.pickHostNameFromBackendHttpSettings")
    private Boolean pickHostNameFromBackendHttpSettings;

    /**
     * Minimum number of servers that are always marked healthy. Default value
     * is 0.
     */
    @JsonProperty(value = "properties.minServers")
    private Integer minServers;

    /**
     * Criterion for classifying a healthy probe response.
     */
    @JsonProperty(value = "properties.match")
    private ApplicationGatewayProbeHealthResponseMatch match;

    /**
     * Provisioning state of the backend http settings resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the probe that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the protocol used for the probe. Possible values are 'Http' and 'Https'. Possible values include: 'Http', 'Https'.
     *
     * @return the protocol value
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol used for the probe. Possible values are 'Http' and 'Https'. Possible values include: 'Http', 'Https'.
     *
     * @param protocol the protocol value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get host name to send the probe to.
     *
     * @return the host value
     */
    public String host() {
        return this.host;
    }

    /**
     * Set host name to send the probe to.
     *
     * @param host the host value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get relative path of probe. Valid path starts from '/'. Probe is sent to &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set relative path of probe. Valid path starts from '/'. Probe is sent to &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     *
     * @param path the path value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the probing interval in seconds. This is the time interval between two consecutive probes. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the interval value
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the probing interval in seconds. This is the time interval between two consecutive probes. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param interval the interval value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param timeout the timeout value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the probe retry count. Backend server is marked down after consecutive probe failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     *
     * @return the unhealthyThreshold value
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * Set the probe retry count. Backend server is marked down after consecutive probe failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     *
     * @param unhealthyThreshold the unhealthyThreshold value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    /**
     * Get whether the host header should be picked from the backend http settings. Default value is false.
     *
     * @return the pickHostNameFromBackendHttpSettings value
     */
    public Boolean pickHostNameFromBackendHttpSettings() {
        return this.pickHostNameFromBackendHttpSettings;
    }

    /**
     * Set whether the host header should be picked from the backend http settings. Default value is false.
     *
     * @param pickHostNameFromBackendHttpSettings the pickHostNameFromBackendHttpSettings value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withPickHostNameFromBackendHttpSettings(Boolean pickHostNameFromBackendHttpSettings) {
        this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
        return this;
    }

    /**
     * Get minimum number of servers that are always marked healthy. Default value is 0.
     *
     * @return the minServers value
     */
    public Integer minServers() {
        return this.minServers;
    }

    /**
     * Set minimum number of servers that are always marked healthy. Default value is 0.
     *
     * @param minServers the minServers value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withMinServers(Integer minServers) {
        this.minServers = minServers;
        return this;
    }

    /**
     * Get criterion for classifying a healthy probe response.
     *
     * @return the match value
     */
    public ApplicationGatewayProbeHealthResponseMatch match() {
        return this.match;
    }

    /**
     * Set criterion for classifying a healthy probe response.
     *
     * @param match the match value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withMatch(ApplicationGatewayProbeHealthResponseMatch match) {
        this.match = match;
        return this;
    }

    /**
     * Get provisioning state of the backend http settings resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the backend http settings resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get name of the probe that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the probe that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of the resource.
     *
     * @param type the type value to set
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withType(String type) {
        this.type = type;
        return this;
    }

}
