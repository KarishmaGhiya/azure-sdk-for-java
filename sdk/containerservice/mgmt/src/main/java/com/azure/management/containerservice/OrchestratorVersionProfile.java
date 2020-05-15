// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OrchestratorVersionProfile model. */
@Fluent
public final class OrchestratorVersionProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrchestratorVersionProfile.class);

    /*
     * Orchestrator type.
     */
    @JsonProperty(value = "orchestratorType", required = true)
    private String orchestratorType;

    /*
     * Orchestrator version (major, minor, patch).
     */
    @JsonProperty(value = "orchestratorVersion", required = true)
    private String orchestratorVersion;

    /*
     * Installed by default if version is not specified.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /*
     * Whether Kubernetes version is currently in preview.
     */
    @JsonProperty(value = "isPreview")
    private Boolean isPreview;

    /*
     * The list of available upgrade versions.
     */
    @JsonProperty(value = "upgrades")
    private List<OrchestratorProfile> upgrades;

    /**
     * Get the orchestratorType property: Orchestrator type.
     *
     * @return the orchestratorType value.
     */
    public String orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * Set the orchestratorType property: Orchestrator type.
     *
     * @param orchestratorType the orchestratorType value to set.
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withOrchestratorType(String orchestratorType) {
        this.orchestratorType = orchestratorType;
        return this;
    }

    /**
     * Get the orchestratorVersion property: Orchestrator version (major, minor, patch).
     *
     * @return the orchestratorVersion value.
     */
    public String orchestratorVersion() {
        return this.orchestratorVersion;
    }

    /**
     * Set the orchestratorVersion property: Orchestrator version (major, minor, patch).
     *
     * @param orchestratorVersion the orchestratorVersion value to set.
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withOrchestratorVersion(String orchestratorVersion) {
        this.orchestratorVersion = orchestratorVersion;
        return this;
    }

    /**
     * Get the defaultProperty property: Installed by default if version is not specified.
     *
     * @return the defaultProperty value.
     */
    public Boolean defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: Installed by default if version is not specified.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the isPreview property: Whether Kubernetes version is currently in preview.
     *
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Whether Kubernetes version is currently in preview.
     *
     * @param isPreview the isPreview value to set.
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
        return this;
    }

    /**
     * Get the upgrades property: The list of available upgrade versions.
     *
     * @return the upgrades value.
     */
    public List<OrchestratorProfile> upgrades() {
        return this.upgrades;
    }

    /**
     * Set the upgrades property: The list of available upgrade versions.
     *
     * @param upgrades the upgrades value to set.
     * @return the OrchestratorVersionProfile object itself.
     */
    public OrchestratorVersionProfile withUpgrades(List<OrchestratorProfile> upgrades) {
        this.upgrades = upgrades;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orchestratorType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property orchestratorType in model OrchestratorVersionProfile"));
        }
        if (orchestratorVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property orchestratorVersion in model OrchestratorVersionProfile"));
        }
        if (upgrades() != null) {
            upgrades().forEach(e -> e.validate());
        }
    }
}
