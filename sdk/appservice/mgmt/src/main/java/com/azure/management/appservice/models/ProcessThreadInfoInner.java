// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ProcessThreadInfo model. */
@JsonFlatten
@Fluent
public class ProcessThreadInfoInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProcessThreadInfoInner.class);

    /*
     * Site extension ID.
     */
    @JsonProperty(value = "properties.identifier", access = JsonProperty.Access.WRITE_ONLY)
    private Integer identifier;

    /*
     * HRef URI.
     */
    @JsonProperty(value = "properties.href")
    private String href;

    /*
     * Process URI.
     */
    @JsonProperty(value = "properties.process")
    private String process;

    /*
     * Start address.
     */
    @JsonProperty(value = "properties.start_address")
    private String startAddress;

    /*
     * Current thread priority.
     */
    @JsonProperty(value = "properties.current_priority")
    private Integer currentPriority;

    /*
     * Thread priority level.
     */
    @JsonProperty(value = "properties.priority_level")
    private String priorityLevel;

    /*
     * Base priority.
     */
    @JsonProperty(value = "properties.base_priority")
    private Integer basePriority;

    /*
     * Start time.
     */
    @JsonProperty(value = "properties.start_time")
    private OffsetDateTime startTime;

    /*
     * Total processor time.
     */
    @JsonProperty(value = "properties.total_processor_time")
    private String totalProcessorTime;

    /*
     * User processor time.
     */
    @JsonProperty(value = "properties.user_processor_time")
    private String userProcessorTime;

    /*
     * Thread state.
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /*
     * Wait reason.
     */
    @JsonProperty(value = "properties.wait_reason")
    private String waitReason;

    /**
     * Get the identifier property: Site extension ID.
     *
     * @return the identifier value.
     */
    public Integer identifier() {
        return this.identifier;
    }

    /**
     * Get the href property: HRef URI.
     *
     * @return the href value.
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the href property: HRef URI.
     *
     * @param href the href value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the process property: Process URI.
     *
     * @return the process value.
     */
    public String process() {
        return this.process;
    }

    /**
     * Set the process property: Process URI.
     *
     * @param process the process value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * Get the startAddress property: Start address.
     *
     * @return the startAddress value.
     */
    public String startAddress() {
        return this.startAddress;
    }

    /**
     * Set the startAddress property: Start address.
     *
     * @param startAddress the startAddress value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withStartAddress(String startAddress) {
        this.startAddress = startAddress;
        return this;
    }

    /**
     * Get the currentPriority property: Current thread priority.
     *
     * @return the currentPriority value.
     */
    public Integer currentPriority() {
        return this.currentPriority;
    }

    /**
     * Set the currentPriority property: Current thread priority.
     *
     * @param currentPriority the currentPriority value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withCurrentPriority(Integer currentPriority) {
        this.currentPriority = currentPriority;
        return this;
    }

    /**
     * Get the priorityLevel property: Thread priority level.
     *
     * @return the priorityLevel value.
     */
    public String priorityLevel() {
        return this.priorityLevel;
    }

    /**
     * Set the priorityLevel property: Thread priority level.
     *
     * @param priorityLevel the priorityLevel value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
        return this;
    }

    /**
     * Get the basePriority property: Base priority.
     *
     * @return the basePriority value.
     */
    public Integer basePriority() {
        return this.basePriority;
    }

    /**
     * Set the basePriority property: Base priority.
     *
     * @param basePriority the basePriority value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withBasePriority(Integer basePriority) {
        this.basePriority = basePriority;
        return this;
    }

    /**
     * Get the startTime property: Start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time.
     *
     * @param startTime the startTime value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the totalProcessorTime property: Total processor time.
     *
     * @return the totalProcessorTime value.
     */
    public String totalProcessorTime() {
        return this.totalProcessorTime;
    }

    /**
     * Set the totalProcessorTime property: Total processor time.
     *
     * @param totalProcessorTime the totalProcessorTime value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withTotalProcessorTime(String totalProcessorTime) {
        this.totalProcessorTime = totalProcessorTime;
        return this;
    }

    /**
     * Get the userProcessorTime property: User processor time.
     *
     * @return the userProcessorTime value.
     */
    public String userProcessorTime() {
        return this.userProcessorTime;
    }

    /**
     * Set the userProcessorTime property: User processor time.
     *
     * @param userProcessorTime the userProcessorTime value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withUserProcessorTime(String userProcessorTime) {
        this.userProcessorTime = userProcessorTime;
        return this;
    }

    /**
     * Get the state property: Thread state.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: Thread state.
     *
     * @param state the state value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the waitReason property: Wait reason.
     *
     * @return the waitReason value.
     */
    public String waitReason() {
        return this.waitReason;
    }

    /**
     * Set the waitReason property: Wait reason.
     *
     * @param waitReason the waitReason value to set.
     * @return the ProcessThreadInfoInner object itself.
     */
    public ProcessThreadInfoInner withWaitReason(String waitReason) {
        this.waitReason = waitReason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
