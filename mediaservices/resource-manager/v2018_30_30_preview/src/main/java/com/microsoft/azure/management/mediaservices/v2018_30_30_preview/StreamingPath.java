/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class of paths for streaming.
 */
public class StreamingPath {
    /**
     * Streaming protocol. Possible values include: 'Hls', 'Dash',
     * 'SmoothStreaming', 'Download'.
     */
    @JsonProperty(value = "streamingProtocol", required = true)
    private StreamingPolicyStreamingProtocol streamingProtocol;

    /**
     * Encryption scheme. Possible values include: 'NoEncryption',
     * 'EnvelopeEncryption', 'CommonEncryptionCenc', 'CommonEncryptionCbcs'.
     */
    @JsonProperty(value = "encryptionScheme", required = true)
    private EncryptionScheme encryptionScheme;

    /**
     * Streaming paths for each protocol and encryptionScheme pair.
     */
    @JsonProperty(value = "paths")
    private List<String> paths;

    /**
     * Get streaming protocol. Possible values include: 'Hls', 'Dash', 'SmoothStreaming', 'Download'.
     *
     * @return the streamingProtocol value
     */
    public StreamingPolicyStreamingProtocol streamingProtocol() {
        return this.streamingProtocol;
    }

    /**
     * Set streaming protocol. Possible values include: 'Hls', 'Dash', 'SmoothStreaming', 'Download'.
     *
     * @param streamingProtocol the streamingProtocol value to set
     * @return the StreamingPath object itself.
     */
    public StreamingPath withStreamingProtocol(StreamingPolicyStreamingProtocol streamingProtocol) {
        this.streamingProtocol = streamingProtocol;
        return this;
    }

    /**
     * Get encryption scheme. Possible values include: 'NoEncryption', 'EnvelopeEncryption', 'CommonEncryptionCenc', 'CommonEncryptionCbcs'.
     *
     * @return the encryptionScheme value
     */
    public EncryptionScheme encryptionScheme() {
        return this.encryptionScheme;
    }

    /**
     * Set encryption scheme. Possible values include: 'NoEncryption', 'EnvelopeEncryption', 'CommonEncryptionCenc', 'CommonEncryptionCbcs'.
     *
     * @param encryptionScheme the encryptionScheme value to set
     * @return the StreamingPath object itself.
     */
    public StreamingPath withEncryptionScheme(EncryptionScheme encryptionScheme) {
        this.encryptionScheme = encryptionScheme;
        return this;
    }

    /**
     * Get streaming paths for each protocol and encryptionScheme pair.
     *
     * @return the paths value
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set streaming paths for each protocol and encryptionScheme pair.
     *
     * @param paths the paths value to set
     * @return the StreamingPath object itself.
     */
    public StreamingPath withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

}
