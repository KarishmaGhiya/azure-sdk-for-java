/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Export model.
 */
public class Export {
    /**
     * Possible values include: 'CoreML', 'TensorFlow', 'DockerFile', 'ONNX'.
     */
    @JsonProperty(value = "platform", access = JsonProperty.Access.WRITE_ONLY)
    private ExportPlatformModel platform;

    /**
     * Possible values include: 'Exporting', 'Failed', 'Done'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ExportStatusModel status;

    /**
     * The downloadUri property.
     */
    @JsonProperty(value = "downloadUri", access = JsonProperty.Access.WRITE_ONLY)
    private String downloadUri;

    /**
     * Possible values include: 'Linux', 'Windows', 'ONNX10', 'ONNX12'.
     */
    @JsonProperty(value = "flavor", access = JsonProperty.Access.WRITE_ONLY)
    private ExportFlavorModel flavor;

    /**
     * The newerVersionAvailable property.
     */
    @JsonProperty(value = "newerVersionAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private boolean newerVersionAvailable;

    /**
     * Get possible values include: 'CoreML', 'TensorFlow', 'DockerFile', 'ONNX'.
     *
     * @return the platform value
     */
    public ExportPlatformModel platform() {
        return this.platform;
    }

    /**
     * Get possible values include: 'Exporting', 'Failed', 'Done'.
     *
     * @return the status value
     */
    public ExportStatusModel status() {
        return this.status;
    }

    /**
     * Get the downloadUri value.
     *
     * @return the downloadUri value
     */
    public String downloadUri() {
        return this.downloadUri;
    }

    /**
     * Get possible values include: 'Linux', 'Windows', 'ONNX10', 'ONNX12'.
     *
     * @return the flavor value
     */
    public ExportFlavorModel flavor() {
        return this.flavor;
    }

    /**
     * Get the newerVersionAvailable value.
     *
     * @return the newerVersionAvailable value
     */
    public boolean newerVersionAvailable() {
        return this.newerVersionAvailable;
    }

}
