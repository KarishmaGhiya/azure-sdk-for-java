// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.compute.SubResourceReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DedicatedHostGroup model. */
@JsonFlatten
@Fluent
public class DedicatedHostGroupInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostGroupInner.class);

    /*
     * Availability Zone to use for this host group. Only single zone is
     * supported. The zone can be assigned only during creation. If not
     * provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * Number of fault domains that the host group can span.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /*
     * A list of references to all dedicated hosts in the dedicated host group.
     */
    @JsonProperty(value = "properties.hosts", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> hosts;

    /**
     * Get the zones property: Availability Zone to use for this host group. Only single zone is supported. The zone can
     * be assigned only during creation. If not provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Availability Zone to use for this host group. Only single zone is supported. The zone can
     * be assigned only during creation. If not provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     *
     * @param zones the zones value to set.
     * @return the DedicatedHostGroupInner object itself.
     */
    public DedicatedHostGroupInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Number of fault domains that the host group can span.
     *
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount property: Number of fault domains that the host group can span.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the DedicatedHostGroupInner object itself.
     */
    public DedicatedHostGroupInner withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get the hosts property: A list of references to all dedicated hosts in the dedicated host group.
     *
     * @return the hosts value.
     */
    public List<SubResourceReadOnly> hosts() {
        return this.hosts;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hosts() != null) {
            hosts().forEach(e -> e.validate());
        }
    }
}
