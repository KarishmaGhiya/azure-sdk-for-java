/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input directory for the job.
 */
public class InputDirectory {
    /**
     * ID.
     * The ID for the input directory. The job can use
     * AZ_BATCHAI_INPUT_&lt;id&gt; environment variable to find the directory
     * path, where &lt;id&gt; is the value of id attribute.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Path.
     * The path to the input directory.
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /**
     * Get the ID for the input directory. The job can use AZ_BATCHAI_INPUT_&lt;id&gt; environment variable to find the directory path, where &lt;id&gt; is the value of id attribute.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID for the input directory. The job can use AZ_BATCHAI_INPUT_&lt;id&gt; environment variable to find the directory path, where &lt;id&gt; is the value of id attribute.
     *
     * @param id the id value to set
     * @return the InputDirectory object itself.
     */
    public InputDirectory withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the path to the input directory.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path to the input directory.
     *
     * @param path the path value to set
     * @return the InputDirectory object itself.
     */
    public InputDirectory withPath(String path) {
        this.path = path;
        return this;
    }

}
