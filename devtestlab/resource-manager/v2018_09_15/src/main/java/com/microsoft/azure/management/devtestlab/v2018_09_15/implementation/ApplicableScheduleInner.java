/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Schedules applicable to a virtual machine. The schedules may have been
 * defined on a VM or on lab level.
 */
@JsonFlatten
@SkipParentValidation
public class ApplicableScheduleInner extends Resource {
    /**
     * The auto-shutdown schedule, if one has been set at the lab or lab
     * resource level.
     */
    @JsonProperty(value = "properties.labVmsShutdown")
    private ScheduleInner labVmsShutdown;

    /**
     * The auto-startup schedule, if one has been set at the lab or lab
     * resource level.
     */
    @JsonProperty(value = "properties.labVmsStartup")
    private ScheduleInner labVmsStartup;

    /**
     * Get the auto-shutdown schedule, if one has been set at the lab or lab resource level.
     *
     * @return the labVmsShutdown value
     */
    public ScheduleInner labVmsShutdown() {
        return this.labVmsShutdown;
    }

    /**
     * Set the auto-shutdown schedule, if one has been set at the lab or lab resource level.
     *
     * @param labVmsShutdown the labVmsShutdown value to set
     * @return the ApplicableScheduleInner object itself.
     */
    public ApplicableScheduleInner withLabVmsShutdown(ScheduleInner labVmsShutdown) {
        this.labVmsShutdown = labVmsShutdown;
        return this;
    }

    /**
     * Get the auto-startup schedule, if one has been set at the lab or lab resource level.
     *
     * @return the labVmsStartup value
     */
    public ScheduleInner labVmsStartup() {
        return this.labVmsStartup;
    }

    /**
     * Set the auto-startup schedule, if one has been set at the lab or lab resource level.
     *
     * @param labVmsStartup the labVmsStartup value to set
     * @return the ApplicableScheduleInner object itself.
     */
    public ApplicableScheduleInner withLabVmsStartup(ScheduleInner labVmsStartup) {
        this.labVmsStartup = labVmsStartup;
        return this;
    }

}
