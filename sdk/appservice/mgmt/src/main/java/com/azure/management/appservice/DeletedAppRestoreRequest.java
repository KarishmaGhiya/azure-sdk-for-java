// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeletedAppRestoreRequest model. */
@JsonFlatten
@Fluent
public class DeletedAppRestoreRequest extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedAppRestoreRequest.class);

    /*
     * ARM resource ID of the deleted app. Example:
     * /subscriptions/{subId}/providers/Microsoft.Web/deletedSites/{deletedSiteId}
     */
    @JsonProperty(value = "properties.deletedSiteId")
    private String deletedSiteId;

    /*
     * If true, deleted site configuration, in addition to content, will be
     * restored.
     */
    @JsonProperty(value = "properties.recoverConfiguration")
    private Boolean recoverConfiguration;

    /*
     * Point in time to restore the deleted app from, formatted as a DateTime
     * string.
     * If unspecified, default value is the time that the app was deleted.
     */
    @JsonProperty(value = "properties.snapshotTime")
    private String snapshotTime;

    /*
     * If true, the snapshot is retrieved from DRSecondary endpoint.
     */
    @JsonProperty(value = "properties.useDRSecondary")
    private Boolean useDRSecondary;

    /**
     * Get the deletedSiteId property: ARM resource ID of the deleted app. Example:
     * /subscriptions/{subId}/providers/Microsoft.Web/deletedSites/{deletedSiteId}.
     *
     * @return the deletedSiteId value.
     */
    public String deletedSiteId() {
        return this.deletedSiteId;
    }

    /**
     * Set the deletedSiteId property: ARM resource ID of the deleted app. Example:
     * /subscriptions/{subId}/providers/Microsoft.Web/deletedSites/{deletedSiteId}.
     *
     * @param deletedSiteId the deletedSiteId value to set.
     * @return the DeletedAppRestoreRequest object itself.
     */
    public DeletedAppRestoreRequest withDeletedSiteId(String deletedSiteId) {
        this.deletedSiteId = deletedSiteId;
        return this;
    }

    /**
     * Get the recoverConfiguration property: If true, deleted site configuration, in addition to content, will be
     * restored.
     *
     * @return the recoverConfiguration value.
     */
    public Boolean recoverConfiguration() {
        return this.recoverConfiguration;
    }

    /**
     * Set the recoverConfiguration property: If true, deleted site configuration, in addition to content, will be
     * restored.
     *
     * @param recoverConfiguration the recoverConfiguration value to set.
     * @return the DeletedAppRestoreRequest object itself.
     */
    public DeletedAppRestoreRequest withRecoverConfiguration(Boolean recoverConfiguration) {
        this.recoverConfiguration = recoverConfiguration;
        return this;
    }

    /**
     * Get the snapshotTime property: Point in time to restore the deleted app from, formatted as a DateTime string. If
     * unspecified, default value is the time that the app was deleted.
     *
     * @return the snapshotTime value.
     */
    public String snapshotTime() {
        return this.snapshotTime;
    }

    /**
     * Set the snapshotTime property: Point in time to restore the deleted app from, formatted as a DateTime string. If
     * unspecified, default value is the time that the app was deleted.
     *
     * @param snapshotTime the snapshotTime value to set.
     * @return the DeletedAppRestoreRequest object itself.
     */
    public DeletedAppRestoreRequest withSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }

    /**
     * Get the useDRSecondary property: If true, the snapshot is retrieved from DRSecondary endpoint.
     *
     * @return the useDRSecondary value.
     */
    public Boolean useDRSecondary() {
        return this.useDRSecondary;
    }

    /**
     * Set the useDRSecondary property: If true, the snapshot is retrieved from DRSecondary endpoint.
     *
     * @param useDRSecondary the useDRSecondary value to set.
     * @return the DeletedAppRestoreRequest object itself.
     */
    public DeletedAppRestoreRequest withUseDRSecondary(Boolean useDRSecondary) {
        this.useDRSecondary = useDRSecondary;
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
