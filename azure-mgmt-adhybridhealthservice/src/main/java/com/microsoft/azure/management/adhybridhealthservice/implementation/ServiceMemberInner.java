/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.adhybridhealthservice.MonitoringLevel;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The server properties for a given service.
 */
public class ServiceMemberInner {
    /**
     * The id of the server.
     */
    @JsonProperty(value = "serviceMemberId")
    private String serviceMemberId;

    /**
     * The service id to whom this server belongs.
     */
    @JsonProperty(value = "serviceId")
    private String serviceId;

    /**
     * The tenant id to whom this server belongs.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The total number of alerts that are currently active for the server.
     */
    @JsonProperty(value = "activeAlerts")
    private Integer activeAlerts;

    /**
     * The additional information, if any, for the server.
     */
    @JsonProperty(value = "additionalInformation")
    private String additionalInformation;

    /**
     * The date time , in UTC, when the server was onboaraded to Azure Active
     * Directory Connect Health.
     */
    @JsonProperty(value = "createdDate")
    private DateTime createdDate;

    /**
     * The server specific configuration related dimensions.
     */
    @JsonProperty(value = "dimensions")
    private Object dimensions;

    /**
     * Indicates if the server is disabled or not.
     */
    @JsonProperty(value = "disabled")
    private Boolean disabled;

    /**
     * The reason for disabling the server.
     */
    @JsonProperty(value = "disabledReason")
    private Integer disabledReason;

    /**
     * The list of installed QFEs for the server.
     */
    @JsonProperty(value = "installedQfes")
    private Object installedQfes;

    /**
     * The date and time , in UTC, when the server was last disabled.
     */
    @JsonProperty(value = "lastDisabled")
    private DateTime lastDisabled;

    /**
     * The date and time, in UTC, when the server was last rebooted.
     */
    @JsonProperty(value = "lastReboot")
    private DateTime lastReboot;

    /**
     * The date and time, in UTC, when the server's data monitoring
     * configuration was last changed.
     */
    @JsonProperty(value = "lastServerReportedMonitoringLevelChange")
    private DateTime lastServerReportedMonitoringLevelChange;

    /**
     * The date and time, in UTC, when the server proeprties were last updated.
     */
    @JsonProperty(value = "lastUpdated")
    private DateTime lastUpdated;

    /**
     * The id of the machine.
     */
    @JsonProperty(value = "machineId")
    private String machineId;

    /**
     * The name of the server.
     */
    @JsonProperty(value = "machineName")
    private String machineName;

    /**
     * The monitoring configuration of the server which determines what
     * activities are monitored by Azure Active Directory Connect Health.
     */
    @JsonProperty(value = "monitoringConfigurationsComputed")
    private Object monitoringConfigurationsComputed;

    /**
     * The customized monitoring configuration of the server which determines
     * what activities are monitored by Azure Active Directory Connect Health.
     */
    @JsonProperty(value = "monitoringConfigurationsCustomized")
    private Object monitoringConfigurationsCustomized;

    /**
     * The name of the operating system installed in the machine.
     */
    @JsonProperty(value = "osName")
    private String osName;

    /**
     * The version of the operating system installed in the machine.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /**
     * Server specific properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * The list of recommended hotfixes for the server.
     */
    @JsonProperty(value = "recommendedQfes")
    private Object recommendedQfes;

    /**
     * The total count of alerts that are resolved for this server.
     */
    @JsonProperty(value = "resolvedAlerts")
    private Integer resolvedAlerts;

    /**
     * The service role that is being monitored in the server.
     */
    @JsonProperty(value = "role")
    private String role;

    /**
     * The monitoring level reported by the server. Possible values include:
     * 'Partial', 'Full', 'Off'.
     */
    @JsonProperty(value = "serverReportedMonitoringLevel")
    private MonitoringLevel serverReportedMonitoringLevel;

    /**
     * The health status of the server.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the id of the server.
     *
     * @return the serviceMemberId value
     */
    public String serviceMemberId() {
        return this.serviceMemberId;
    }

    /**
     * Set the id of the server.
     *
     * @param serviceMemberId the serviceMemberId value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withServiceMemberId(String serviceMemberId) {
        this.serviceMemberId = serviceMemberId;
        return this;
    }

    /**
     * Get the service id to whom this server belongs.
     *
     * @return the serviceId value
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Set the service id to whom this server belongs.
     *
     * @param serviceId the serviceId value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get the tenant id to whom this server belongs.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenant id to whom this server belongs.
     *
     * @param tenantId the tenantId value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the total number of alerts that are currently active for the server.
     *
     * @return the activeAlerts value
     */
    public Integer activeAlerts() {
        return this.activeAlerts;
    }

    /**
     * Set the total number of alerts that are currently active for the server.
     *
     * @param activeAlerts the activeAlerts value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withActiveAlerts(Integer activeAlerts) {
        this.activeAlerts = activeAlerts;
        return this;
    }

    /**
     * Get the additional information, if any, for the server.
     *
     * @return the additionalInformation value
     */
    public String additionalInformation() {
        return this.additionalInformation;
    }

    /**
     * Set the additional information, if any, for the server.
     *
     * @param additionalInformation the additionalInformation value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    /**
     * Get the date time , in UTC, when the server was onboaraded to Azure Active Directory Connect Health.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set the date time , in UTC, when the server was onboaraded to Azure Active Directory Connect Health.
     *
     * @param createdDate the createdDate value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the server specific configuration related dimensions.
     *
     * @return the dimensions value
     */
    public Object dimensions() {
        return this.dimensions;
    }

    /**
     * Set the server specific configuration related dimensions.
     *
     * @param dimensions the dimensions value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withDimensions(Object dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get indicates if the server is disabled or not.
     *
     * @return the disabled value
     */
    public Boolean disabled() {
        return this.disabled;
    }

    /**
     * Set indicates if the server is disabled or not.
     *
     * @param disabled the disabled value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Get the reason for disabling the server.
     *
     * @return the disabledReason value
     */
    public Integer disabledReason() {
        return this.disabledReason;
    }

    /**
     * Set the reason for disabling the server.
     *
     * @param disabledReason the disabledReason value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withDisabledReason(Integer disabledReason) {
        this.disabledReason = disabledReason;
        return this;
    }

    /**
     * Get the list of installed QFEs for the server.
     *
     * @return the installedQfes value
     */
    public Object installedQfes() {
        return this.installedQfes;
    }

    /**
     * Set the list of installed QFEs for the server.
     *
     * @param installedQfes the installedQfes value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withInstalledQfes(Object installedQfes) {
        this.installedQfes = installedQfes;
        return this;
    }

    /**
     * Get the date and time , in UTC, when the server was last disabled.
     *
     * @return the lastDisabled value
     */
    public DateTime lastDisabled() {
        return this.lastDisabled;
    }

    /**
     * Set the date and time , in UTC, when the server was last disabled.
     *
     * @param lastDisabled the lastDisabled value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withLastDisabled(DateTime lastDisabled) {
        this.lastDisabled = lastDisabled;
        return this;
    }

    /**
     * Get the date and time, in UTC, when the server was last rebooted.
     *
     * @return the lastReboot value
     */
    public DateTime lastReboot() {
        return this.lastReboot;
    }

    /**
     * Set the date and time, in UTC, when the server was last rebooted.
     *
     * @param lastReboot the lastReboot value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withLastReboot(DateTime lastReboot) {
        this.lastReboot = lastReboot;
        return this;
    }

    /**
     * Get the date and time, in UTC, when the server's data monitoring configuration was last changed.
     *
     * @return the lastServerReportedMonitoringLevelChange value
     */
    public DateTime lastServerReportedMonitoringLevelChange() {
        return this.lastServerReportedMonitoringLevelChange;
    }

    /**
     * Set the date and time, in UTC, when the server's data monitoring configuration was last changed.
     *
     * @param lastServerReportedMonitoringLevelChange the lastServerReportedMonitoringLevelChange value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withLastServerReportedMonitoringLevelChange(DateTime lastServerReportedMonitoringLevelChange) {
        this.lastServerReportedMonitoringLevelChange = lastServerReportedMonitoringLevelChange;
        return this;
    }

    /**
     * Get the date and time, in UTC, when the server proeprties were last updated.
     *
     * @return the lastUpdated value
     */
    public DateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set the date and time, in UTC, when the server proeprties were last updated.
     *
     * @param lastUpdated the lastUpdated value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withLastUpdated(DateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get the id of the machine.
     *
     * @return the machineId value
     */
    public String machineId() {
        return this.machineId;
    }

    /**
     * Set the id of the machine.
     *
     * @param machineId the machineId value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withMachineId(String machineId) {
        this.machineId = machineId;
        return this;
    }

    /**
     * Get the name of the server.
     *
     * @return the machineName value
     */
    public String machineName() {
        return this.machineName;
    }

    /**
     * Set the name of the server.
     *
     * @param machineName the machineName value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * Get the monitoring configuration of the server which determines what activities are monitored by Azure Active Directory Connect Health.
     *
     * @return the monitoringConfigurationsComputed value
     */
    public Object monitoringConfigurationsComputed() {
        return this.monitoringConfigurationsComputed;
    }

    /**
     * Set the monitoring configuration of the server which determines what activities are monitored by Azure Active Directory Connect Health.
     *
     * @param monitoringConfigurationsComputed the monitoringConfigurationsComputed value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withMonitoringConfigurationsComputed(Object monitoringConfigurationsComputed) {
        this.monitoringConfigurationsComputed = monitoringConfigurationsComputed;
        return this;
    }

    /**
     * Get the customized monitoring configuration of the server which determines what activities are monitored by Azure Active Directory Connect Health.
     *
     * @return the monitoringConfigurationsCustomized value
     */
    public Object monitoringConfigurationsCustomized() {
        return this.monitoringConfigurationsCustomized;
    }

    /**
     * Set the customized monitoring configuration of the server which determines what activities are monitored by Azure Active Directory Connect Health.
     *
     * @param monitoringConfigurationsCustomized the monitoringConfigurationsCustomized value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withMonitoringConfigurationsCustomized(Object monitoringConfigurationsCustomized) {
        this.monitoringConfigurationsCustomized = monitoringConfigurationsCustomized;
        return this;
    }

    /**
     * Get the name of the operating system installed in the machine.
     *
     * @return the osName value
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Set the name of the operating system installed in the machine.
     *
     * @param osName the osName value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * Get the version of the operating system installed in the machine.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the version of the operating system installed in the machine.
     *
     * @param osVersion the osVersion value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get server specific properties.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set server specific properties.
     *
     * @param properties the properties value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the list of recommended hotfixes for the server.
     *
     * @return the recommendedQfes value
     */
    public Object recommendedQfes() {
        return this.recommendedQfes;
    }

    /**
     * Set the list of recommended hotfixes for the server.
     *
     * @param recommendedQfes the recommendedQfes value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withRecommendedQfes(Object recommendedQfes) {
        this.recommendedQfes = recommendedQfes;
        return this;
    }

    /**
     * Get the total count of alerts that are resolved for this server.
     *
     * @return the resolvedAlerts value
     */
    public Integer resolvedAlerts() {
        return this.resolvedAlerts;
    }

    /**
     * Set the total count of alerts that are resolved for this server.
     *
     * @param resolvedAlerts the resolvedAlerts value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withResolvedAlerts(Integer resolvedAlerts) {
        this.resolvedAlerts = resolvedAlerts;
        return this;
    }

    /**
     * Get the service role that is being monitored in the server.
     *
     * @return the role value
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the service role that is being monitored in the server.
     *
     * @param role the role value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get the monitoring level reported by the server. Possible values include: 'Partial', 'Full', 'Off'.
     *
     * @return the serverReportedMonitoringLevel value
     */
    public MonitoringLevel serverReportedMonitoringLevel() {
        return this.serverReportedMonitoringLevel;
    }

    /**
     * Set the monitoring level reported by the server. Possible values include: 'Partial', 'Full', 'Off'.
     *
     * @param serverReportedMonitoringLevel the serverReportedMonitoringLevel value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withServerReportedMonitoringLevel(MonitoringLevel serverReportedMonitoringLevel) {
        this.serverReportedMonitoringLevel = serverReportedMonitoringLevel;
        return this;
    }

    /**
     * Get the health status of the server.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the health status of the server.
     *
     * @param status the status value to set
     * @return the ServiceMemberInner object itself.
     */
    public ServiceMemberInner withStatus(String status) {
        this.status = status;
        return this;
    }

}
