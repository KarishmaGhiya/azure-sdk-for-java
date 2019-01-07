/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.VirtualNetworkInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.DevTestLabManager;
import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing VirtualNetwork.
 */
public interface VirtualNetwork extends HasInner<VirtualNetworkInner>, Indexable, Refreshable<VirtualNetwork>, Updatable<VirtualNetwork.Update>, HasManager<DevTestLabManager> {
    /**
     * @return the allowedSubnets value.
     */
    List<Subnet> allowedSubnets();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the externalProviderResourceId value.
     */
    String externalProviderResourceId();

    /**
     * @return the externalSubnets value.
     */
    List<ExternalSubnet> externalSubnets();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the subnetOverrides value.
     */
    List<SubnetOverride> subnetOverrides();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * The entirety of the VirtualNetwork definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLab, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetwork definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetwork definition.
         */
        interface Blank extends WithLab {
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify Lab.
         */
        interface WithLab {
           /**
            * Specifies resourceGroupName, labName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @return the next definition stage
            */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify AllowedSubnets.
         */
        interface WithAllowedSubnets {
            /**
             * Specifies allowedSubnets.
             * @param allowedSubnets The allowed subnets of the virtual network
             * @return the next definition stage
             */
            WithCreate withAllowedSubnets(List<Subnet> allowedSubnets);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of the virtual network
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify ExternalProviderResourceId.
         */
        interface WithExternalProviderResourceId {
            /**
             * Specifies externalProviderResourceId.
             * @param externalProviderResourceId The Microsoft.Network resource identifier of the virtual network
             * @return the next definition stage
             */
            WithCreate withExternalProviderResourceId(String externalProviderResourceId);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify SubnetOverrides.
         */
        interface WithSubnetOverrides {
            /**
             * Specifies subnetOverrides.
             * @param subnetOverrides The subnet overrides of the virtual network
             * @return the next definition stage
             */
            WithCreate withSubnetOverrides(List<SubnetOverride> subnetOverrides);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetwork>, DefinitionStages.WithAllowedSubnets, DefinitionStages.WithDescription, DefinitionStages.WithExternalProviderResourceId, DefinitionStages.WithLocation, DefinitionStages.WithSubnetOverrides, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a VirtualNetwork update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetwork>, UpdateStages.WithAllowedSubnets, UpdateStages.WithDescription, UpdateStages.WithExternalProviderResourceId, UpdateStages.WithSubnetOverrides, UpdateStages.WithTags {
    }

    /**
     * Grouping of VirtualNetwork update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetwork update allowing to specify AllowedSubnets.
         */
        interface WithAllowedSubnets {
            /**
             * Specifies allowedSubnets.
             * @param allowedSubnets The allowed subnets of the virtual network
             * @return the next update stage
             */
            Update withAllowedSubnets(List<SubnetFragment> allowedSubnets);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of the virtual network
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify ExternalProviderResourceId.
         */
        interface WithExternalProviderResourceId {
            /**
             * Specifies externalProviderResourceId.
             * @param externalProviderResourceId The Microsoft.Network resource identifier of the virtual network
             * @return the next update stage
             */
            Update withExternalProviderResourceId(String externalProviderResourceId);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify SubnetOverrides.
         */
        interface WithSubnetOverrides {
            /**
             * Specifies subnetOverrides.
             * @param subnetOverrides The subnet overrides of the virtual network
             * @return the next update stage
             */
            Update withSubnetOverrides(List<SubnetOverrideFragment> subnetOverrides);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
