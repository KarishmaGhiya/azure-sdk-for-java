// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualMachineScaleSetVMProtectionPolicy model. */
@Fluent
public final class VirtualMachineScaleSetVMProtectionPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetVMProtectionPolicy.class);

    /*
     * Indicates that the virtual machine scale set VM shouldn't be considered
     * for deletion during a scale-in operation.
     */
    @JsonProperty(value = "protectFromScaleIn")
    private Boolean protectFromScaleIn;

    /*
     * Indicates that model updates or actions (including scale-in) initiated
     * on the virtual machine scale set should not be applied to the virtual
     * machine scale set VM.
     */
    @JsonProperty(value = "protectFromScaleSetActions")
    private Boolean protectFromScaleSetActions;

    /**
     * Get the protectFromScaleIn property: Indicates that the virtual machine scale set VM shouldn't be considered for
     * deletion during a scale-in operation.
     *
     * @return the protectFromScaleIn value.
     */
    public Boolean protectFromScaleIn() {
        return this.protectFromScaleIn;
    }

    /**
     * Set the protectFromScaleIn property: Indicates that the virtual machine scale set VM shouldn't be considered for
     * deletion during a scale-in operation.
     *
     * @param protectFromScaleIn the protectFromScaleIn value to set.
     * @return the VirtualMachineScaleSetVMProtectionPolicy object itself.
     */
    public VirtualMachineScaleSetVMProtectionPolicy withProtectFromScaleIn(Boolean protectFromScaleIn) {
        this.protectFromScaleIn = protectFromScaleIn;
        return this;
    }

    /**
     * Get the protectFromScaleSetActions property: Indicates that model updates or actions (including scale-in)
     * initiated on the virtual machine scale set should not be applied to the virtual machine scale set VM.
     *
     * @return the protectFromScaleSetActions value.
     */
    public Boolean protectFromScaleSetActions() {
        return this.protectFromScaleSetActions;
    }

    /**
     * Set the protectFromScaleSetActions property: Indicates that model updates or actions (including scale-in)
     * initiated on the virtual machine scale set should not be applied to the virtual machine scale set VM.
     *
     * @param protectFromScaleSetActions the protectFromScaleSetActions value to set.
     * @return the VirtualMachineScaleSetVMProtectionPolicy object itself.
     */
    public VirtualMachineScaleSetVMProtectionPolicy withProtectFromScaleSetActions(Boolean protectFromScaleSetActions) {
        this.protectFromScaleSetActions = protectFromScaleSetActions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
