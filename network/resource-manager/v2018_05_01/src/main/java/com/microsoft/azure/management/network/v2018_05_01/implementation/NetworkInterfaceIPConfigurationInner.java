/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2018_05_01.ApplicationGatewayBackendAddressPool;
import com.microsoft.azure.management.network.v2018_05_01.IPAllocationMethod;
import com.microsoft.azure.management.network.v2018_05_01.IPVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * IPConfiguration in a network interface.
 */
@JsonFlatten
public class NetworkInterfaceIPConfigurationInner extends SubResource {
    /**
     * The reference of ApplicationGatewayBackendAddressPool resource.
     */
    @JsonProperty(value = "properties.applicationGatewayBackendAddressPools")
    private List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools;

    /**
     * The reference of LoadBalancerBackendAddressPool resource.
     */
    @JsonProperty(value = "properties.loadBalancerBackendAddressPools")
    private List<BackendAddressPoolInner> loadBalancerBackendAddressPools;

    /**
     * A list of references of LoadBalancerInboundNatRules.
     */
    @JsonProperty(value = "properties.loadBalancerInboundNatRules")
    private List<InboundNatRuleInner> loadBalancerInboundNatRules;

    /**
     * Private IP address of the IP configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIPAddress;

    /**
     * Defines how a private IP address is assigned. Possible values are:
     * 'Static' and 'Dynamic'. Possible values include: 'Static', 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IPAllocationMethod privateIPAllocationMethod;

    /**
     * Available from Api-Version 2016-03-30 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * Possible values are: 'IPv4' and 'IPv6'. Possible values include: 'IPv4',
     * 'IPv6'.
     */
    @JsonProperty(value = "properties.privateIPAddressVersion")
    private IPVersion privateIPAddressVersion;

    /**
     * Subnet bound to the IP configuration.
     */
    @JsonProperty(value = "properties.subnet")
    private SubnetInner subnet;

    /**
     * Gets whether this is a primary customer address on the network
     * interface.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /**
     * Public IP address bound to the IP configuration.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private PublicIPAddressInner publicIPAddress;

    /**
     * Application security groups in which the IP configuration is included.
     */
    @JsonProperty(value = "properties.applicationSecurityGroups")
    private List<ApplicationSecurityGroupInner> applicationSecurityGroups;

    /**
     * The provisioning state of the network interface IP configuration.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the reference of ApplicationGatewayBackendAddressPool resource.
     *
     * @return the applicationGatewayBackendAddressPools value
     */
    public List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools;
    }

    /**
     * Set the reference of ApplicationGatewayBackendAddressPool resource.
     *
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withApplicationGatewayBackendAddressPools(List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        return this;
    }

    /**
     * Get the reference of LoadBalancerBackendAddressPool resource.
     *
     * @return the loadBalancerBackendAddressPools value
     */
    public List<BackendAddressPoolInner> loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * Set the reference of LoadBalancerBackendAddressPool resource.
     *
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withLoadBalancerBackendAddressPools(List<BackendAddressPoolInner> loadBalancerBackendAddressPools) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        return this;
    }

    /**
     * Get a list of references of LoadBalancerInboundNatRules.
     *
     * @return the loadBalancerInboundNatRules value
     */
    public List<InboundNatRuleInner> loadBalancerInboundNatRules() {
        return this.loadBalancerInboundNatRules;
    }

    /**
     * Set a list of references of LoadBalancerInboundNatRules.
     *
     * @param loadBalancerInboundNatRules the loadBalancerInboundNatRules value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withLoadBalancerInboundNatRules(List<InboundNatRuleInner> loadBalancerInboundNatRules) {
        this.loadBalancerInboundNatRules = loadBalancerInboundNatRules;
        return this;
    }

    /**
     * Get private IP address of the IP configuration.
     *
     * @return the privateIPAddress value
     */
    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set private IP address of the IP configuration.
     *
     * @param privateIPAddress the privateIPAddress value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
        return this;
    }

    /**
     * Get defines how a private IP address is assigned. Possible values are: 'Static' and 'Dynamic'. Possible values include: 'Static', 'Dynamic'.
     *
     * @return the privateIPAllocationMethod value
     */
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }

    /**
     * Set defines how a private IP address is assigned. Possible values are: 'Static' and 'Dynamic'. Possible values include: 'Static', 'Dynamic'.
     *
     * @param privateIPAllocationMethod the privateIPAllocationMethod value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        return this;
    }

    /**
     * Get available from Api-Version 2016-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'. Possible values include: 'IPv4', 'IPv6'.
     *
     * @return the privateIPAddressVersion value
     */
    public IPVersion privateIPAddressVersion() {
        return this.privateIPAddressVersion;
    }

    /**
     * Set available from Api-Version 2016-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'. Possible values include: 'IPv4', 'IPv6'.
     *
     * @param privateIPAddressVersion the privateIPAddressVersion value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withPrivateIPAddressVersion(IPVersion privateIPAddressVersion) {
        this.privateIPAddressVersion = privateIPAddressVersion;
        return this;
    }

    /**
     * Get subnet bound to the IP configuration.
     *
     * @return the subnet value
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set subnet bound to the IP configuration.
     *
     * @param subnet the subnet value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get gets whether this is a primary customer address on the network interface.
     *
     * @return the primary value
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set gets whether this is a primary customer address on the network interface.
     *
     * @param primary the primary value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get public IP address bound to the IP configuration.
     *
     * @return the publicIPAddress value
     */
    public PublicIPAddressInner publicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set public IP address bound to the IP configuration.
     *
     * @param publicIPAddress the publicIPAddress value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withPublicIPAddress(PublicIPAddressInner publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
        return this;
    }

    /**
     * Get application security groups in which the IP configuration is included.
     *
     * @return the applicationSecurityGroups value
     */
    public List<ApplicationSecurityGroupInner> applicationSecurityGroups() {
        return this.applicationSecurityGroups;
    }

    /**
     * Set application security groups in which the IP configuration is included.
     *
     * @param applicationSecurityGroups the applicationSecurityGroups value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withApplicationSecurityGroups(List<ApplicationSecurityGroupInner> applicationSecurityGroups) {
        this.applicationSecurityGroups = applicationSecurityGroups;
        return this;
    }

    /**
     * Get the provisioning state of the network interface IP configuration. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the network interface IP configuration. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withName(String name) {
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
     * @return the NetworkInterfaceIPConfigurationInner object itself.
     */
    public NetworkInterfaceIPConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
