// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerServiceWindowsProfile model. */
@Fluent
public final class ContainerServiceWindowsProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceWindowsProfile.class);

    /*
     * The administrator username to use for Windows VMs.
     */
    @JsonProperty(value = "adminUsername", required = true)
    private String adminUsername;

    /*
     * The administrator password to use for Windows VMs.
     */
    @JsonProperty(value = "adminPassword", required = true)
    private String adminPassword;

    /**
     * Get the adminUsername property: The administrator username to use for Windows VMs.
     *
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: The administrator username to use for Windows VMs.
     *
     * @param adminUsername the adminUsername value to set.
     * @return the ContainerServiceWindowsProfile object itself.
     */
    public ContainerServiceWindowsProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the adminPassword property: The administrator password to use for Windows VMs.
     *
     * @return the adminPassword value.
     */
    public String adminPassword() {
        return this.adminPassword;
    }

    /**
     * Set the adminPassword property: The administrator password to use for Windows VMs.
     *
     * @param adminPassword the adminPassword value to set.
     * @return the ContainerServiceWindowsProfile object itself.
     */
    public ContainerServiceWindowsProfile withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (adminUsername() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property adminUsername in model ContainerServiceWindowsProfile"));
        }
        if (adminPassword() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property adminPassword in model ContainerServiceWindowsProfile"));
        }
    }
}
