// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Dimension model. */
@Fluent
public final class Dimension {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Dimension.class);

    /*
     * Name of the dimension
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Operator for dimension values
     */
    @JsonProperty(value = "operator", required = true)
    private Operator operator;

    /*
     * List of dimension values
     */
    @JsonProperty(value = "values", required = true)
    private List<String> values;

    /**
     * Get the name property: Name of the dimension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the dimension.
     *
     * @param name the name value to set.
     * @return the Dimension object itself.
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the operator property: Operator for dimension values.
     *
     * @return the operator value.
     */
    public Operator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Operator for dimension values.
     *
     * @param operator the operator value to set.
     * @return the Dimension object itself.
     */
    public Dimension withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the values property: List of dimension values.
     *
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: List of dimension values.
     *
     * @param values the values value to set.
     * @return the Dimension object itself.
     */
    public Dimension withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Dimension"));
        }
        if (operator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operator in model Dimension"));
        }
        if (values() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property values in model Dimension"));
        }
    }
}
