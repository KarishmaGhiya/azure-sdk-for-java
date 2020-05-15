// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ManagedClusterAgentPoolProfileProperties model. */
@Fluent
public class ManagedClusterAgentPoolProfileProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterAgentPoolProfileProperties.class);

    /*
     * Number of agents (VMs) to host docker containers. Allowed values must be
     * in the range of 1 to 100 (inclusive). The default value is 1.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Size of agent VMs.
     */
    @JsonProperty(value = "vmSize")
    private ContainerServiceVMSizeTypes vmSize;

    /*
     * OS Disk Size in GB to be used to specify the disk size for every machine
     * in this master/agent pool. If you specify 0, it will apply the default
     * osDisk size according to the vmSize specified.
     */
    @JsonProperty(value = "osDiskSizeGB")
    private Integer osDiskSizeGB;

    /*
     * VNet SubnetID specifies the VNet's subnet identifier.
     */
    @JsonProperty(value = "vnetSubnetID")
    private String vnetSubnetId;

    /*
     * Maximum number of pods that can run on a node.
     */
    @JsonProperty(value = "maxPods")
    private Integer maxPods;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /*
     * Maximum number of nodes for auto-scaling
     */
    @JsonProperty(value = "maxCount")
    private Integer maxCount;

    /*
     * Minimum number of nodes for auto-scaling
     */
    @JsonProperty(value = "minCount")
    private Integer minCount;

    /*
     * Whether to enable auto-scaler
     */
    @JsonProperty(value = "enableAutoScaling")
    private Boolean enableAutoScaling;

    /*
     * AgentPoolType represents types of an agent pool
     */
    @JsonProperty(value = "type")
    private AgentPoolType type;

    /*
     * Version of orchestrator specified when creating the managed cluster.
     */
    @JsonProperty(value = "orchestratorVersion")
    private String orchestratorVersion;

    /*
     * The current deployment or provisioning state, which only appears in the
     * response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * (PREVIEW) Availability zones for nodes. Must use VirtualMachineScaleSets
     * AgentPoolType.
     */
    @JsonProperty(value = "availabilityZones")
    private List<String> availabilityZones;

    /*
     * Enable public IP for nodes
     */
    @JsonProperty(value = "enableNodePublicIP")
    private Boolean enableNodePublicIp;

    /*
     * ScaleSetPriority to be used to specify virtual machine scale set
     * priority. Default to regular.
     */
    @JsonProperty(value = "scaleSetPriority")
    private ScaleSetPriority scaleSetPriority;

    /*
     * ScaleSetEvictionPolicy to be used to specify eviction policy for low
     * priority virtual machine scale set. Default to Delete.
     */
    @JsonProperty(value = "scaleSetEvictionPolicy")
    private ScaleSetEvictionPolicy scaleSetEvictionPolicy;

    /*
     * Taints added to new nodes during node pool create and scale. For
     * example, key=value:NoSchedule.
     */
    @JsonProperty(value = "nodeTaints")
    private List<String> nodeTaints;

    /**
     * Get the count property: Number of agents (VMs) to host docker containers. Allowed values must be in the range of
     * 1 to 100 (inclusive). The default value is 1.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Number of agents (VMs) to host docker containers. Allowed values must be in the range of
     * 1 to 100 (inclusive). The default value is 1.
     *
     * @param count the count value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the vmSize property: Size of agent VMs.
     *
     * @return the vmSize value.
     */
    public ContainerServiceVMSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Size of agent VMs.
     *
     * @param vmSize the vmSize value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the osDiskSizeGB property: OS Disk Size in GB to be used to specify the disk size for every machine in this
     * master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @return the osDiskSizeGB value.
     */
    public Integer osDiskSizeGB() {
        return this.osDiskSizeGB;
    }

    /**
     * Set the osDiskSizeGB property: OS Disk Size in GB to be used to specify the disk size for every machine in this
     * master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @param osDiskSizeGB the osDiskSizeGB value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOsDiskSizeGB(Integer osDiskSizeGB) {
        this.osDiskSizeGB = osDiskSizeGB;
        return this;
    }

    /**
     * Get the vnetSubnetId property: VNet SubnetID specifies the VNet's subnet identifier.
     *
     * @return the vnetSubnetId value.
     */
    public String vnetSubnetId() {
        return this.vnetSubnetId;
    }

    /**
     * Set the vnetSubnetId property: VNet SubnetID specifies the VNet's subnet identifier.
     *
     * @param vnetSubnetId the vnetSubnetId value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withVnetSubnetId(String vnetSubnetId) {
        this.vnetSubnetId = vnetSubnetId;
        return this;
    }

    /**
     * Get the maxPods property: Maximum number of pods that can run on a node.
     *
     * @return the maxPods value.
     */
    public Integer maxPods() {
        return this.maxPods;
    }

    /**
     * Set the maxPods property: Maximum number of pods that can run on a node.
     *
     * @param maxPods the maxPods value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
        return this;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @param osType the osType value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the maxCount property: Maximum number of nodes for auto-scaling.
     *
     * @return the maxCount value.
     */
    public Integer maxCount() {
        return this.maxCount;
    }

    /**
     * Set the maxCount property: Maximum number of nodes for auto-scaling.
     *
     * @param maxCount the maxCount value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Get the minCount property: Minimum number of nodes for auto-scaling.
     *
     * @return the minCount value.
     */
    public Integer minCount() {
        return this.minCount;
    }

    /**
     * Set the minCount property: Minimum number of nodes for auto-scaling.
     *
     * @param minCount the minCount value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Get the enableAutoScaling property: Whether to enable auto-scaler.
     *
     * @return the enableAutoScaling value.
     */
    public Boolean enableAutoScaling() {
        return this.enableAutoScaling;
    }

    /**
     * Set the enableAutoScaling property: Whether to enable auto-scaler.
     *
     * @param enableAutoScaling the enableAutoScaling value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withEnableAutoScaling(Boolean enableAutoScaling) {
        this.enableAutoScaling = enableAutoScaling;
        return this;
    }

    /**
     * Get the type property: AgentPoolType represents types of an agent pool.
     *
     * @return the type value.
     */
    public AgentPoolType type() {
        return this.type;
    }

    /**
     * Set the type property: AgentPoolType represents types of an agent pool.
     *
     * @param type the type value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withType(AgentPoolType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the orchestratorVersion property: Version of orchestrator specified when creating the managed cluster.
     *
     * @return the orchestratorVersion value.
     */
    public String orchestratorVersion() {
        return this.orchestratorVersion;
    }

    /**
     * Set the orchestratorVersion property: Version of orchestrator specified when creating the managed cluster.
     *
     * @param orchestratorVersion the orchestratorVersion value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOrchestratorVersion(String orchestratorVersion) {
        this.orchestratorVersion = orchestratorVersion;
        return this;
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the availabilityZones property: (PREVIEW) Availability zones for nodes. Must use VirtualMachineScaleSets
     * AgentPoolType.
     *
     * @return the availabilityZones value.
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }

    /**
     * Set the availabilityZones property: (PREVIEW) Availability zones for nodes. Must use VirtualMachineScaleSets
     * AgentPoolType.
     *
     * @param availabilityZones the availabilityZones value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * Get the enableNodePublicIp property: Enable public IP for nodes.
     *
     * @return the enableNodePublicIp value.
     */
    public Boolean enableNodePublicIp() {
        return this.enableNodePublicIp;
    }

    /**
     * Set the enableNodePublicIp property: Enable public IP for nodes.
     *
     * @param enableNodePublicIp the enableNodePublicIp value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withEnableNodePublicIp(Boolean enableNodePublicIp) {
        this.enableNodePublicIp = enableNodePublicIp;
        return this;
    }

    /**
     * Get the scaleSetPriority property: ScaleSetPriority to be used to specify virtual machine scale set priority.
     * Default to regular.
     *
     * @return the scaleSetPriority value.
     */
    public ScaleSetPriority scaleSetPriority() {
        return this.scaleSetPriority;
    }

    /**
     * Set the scaleSetPriority property: ScaleSetPriority to be used to specify virtual machine scale set priority.
     * Default to regular.
     *
     * @param scaleSetPriority the scaleSetPriority value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withScaleSetPriority(ScaleSetPriority scaleSetPriority) {
        this.scaleSetPriority = scaleSetPriority;
        return this;
    }

    /**
     * Get the scaleSetEvictionPolicy property: ScaleSetEvictionPolicy to be used to specify eviction policy for low
     * priority virtual machine scale set. Default to Delete.
     *
     * @return the scaleSetEvictionPolicy value.
     */
    public ScaleSetEvictionPolicy scaleSetEvictionPolicy() {
        return this.scaleSetEvictionPolicy;
    }

    /**
     * Set the scaleSetEvictionPolicy property: ScaleSetEvictionPolicy to be used to specify eviction policy for low
     * priority virtual machine scale set. Default to Delete.
     *
     * @param scaleSetEvictionPolicy the scaleSetEvictionPolicy value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withScaleSetEvictionPolicy(
        ScaleSetEvictionPolicy scaleSetEvictionPolicy) {
        this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
        return this;
    }

    /**
     * Get the nodeTaints property: Taints added to new nodes during node pool create and scale. For example,
     * key=value:NoSchedule.
     *
     * @return the nodeTaints value.
     */
    public List<String> nodeTaints() {
        return this.nodeTaints;
    }

    /**
     * Set the nodeTaints property: Taints added to new nodes during node pool create and scale. For example,
     * key=value:NoSchedule.
     *
     * @param nodeTaints the nodeTaints value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withNodeTaints(List<String> nodeTaints) {
        this.nodeTaints = nodeTaints;
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
