/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A collective group of information about the record set information.
 */
public class RecordSet {
    /**
     * Resource record type.
     */
    @JsonProperty(value = "recordType")
    private String recordType;

    /**
     * Recordset name.
     */
    @JsonProperty(value = "recordSetName")
    private String recordSetName;

    /**
     * Fqdn that resolves to private endpoint ip address.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /**
     * The provisioning state of the recordset. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Recordset time to live.
     */
    @JsonProperty(value = "ttl")
    private Integer ttl;

    /**
     * The private ip address of the private endpoint.
     */
    @JsonProperty(value = "ipAddresses")
    private List<String> ipAddresses;

    /**
     * Get resource record type.
     *
     * @return the recordType value
     */
    public String recordType() {
        return this.recordType;
    }

    /**
     * Set resource record type.
     *
     * @param recordType the recordType value to set
     * @return the RecordSet object itself.
     */
    public RecordSet withRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get recordset name.
     *
     * @return the recordSetName value
     */
    public String recordSetName() {
        return this.recordSetName;
    }

    /**
     * Set recordset name.
     *
     * @param recordSetName the recordSetName value to set
     * @return the RecordSet object itself.
     */
    public RecordSet withRecordSetName(String recordSetName) {
        this.recordSetName = recordSetName;
        return this;
    }

    /**
     * Get fqdn that resolves to private endpoint ip address.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set fqdn that resolves to private endpoint ip address.
     *
     * @param fqdn the fqdn value to set
     * @return the RecordSet object itself.
     */
    public RecordSet withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the provisioning state of the recordset. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get recordset time to live.
     *
     * @return the ttl value
     */
    public Integer ttl() {
        return this.ttl;
    }

    /**
     * Set recordset time to live.
     *
     * @param ttl the ttl value to set
     * @return the RecordSet object itself.
     */
    public RecordSet withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Get the private ip address of the private endpoint.
     *
     * @return the ipAddresses value
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set the private ip address of the private endpoint.
     *
     * @param ipAddresses the ipAddresses value to set
     * @return the RecordSet object itself.
     */
    public RecordSet withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

}
