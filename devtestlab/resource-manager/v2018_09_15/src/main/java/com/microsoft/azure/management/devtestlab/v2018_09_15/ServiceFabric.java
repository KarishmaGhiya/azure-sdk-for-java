/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.ServiceFabricInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.DevTestLabManager;
import java.util.Map;

/**
 * Type representing ServiceFabric.
 */
public interface ServiceFabric extends HasInner<ServiceFabricInner>, Indexable, Refreshable<ServiceFabric>, Updatable<ServiceFabric.Update>, HasManager<DevTestLabManager> {
    /**
     * @return the applicableSchedule value.
     */
    ApplicableSchedule applicableSchedule();

    /**
     * @return the environmentId value.
     */
    String environmentId();

    /**
     * @return the externalServiceFabricId value.
     */
    String externalServiceFabricId();

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
     * The entirety of the ServiceFabric definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithUser, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServiceFabric definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServiceFabric definition.
         */
        interface Blank extends WithUser {
        }

        /**
         * The stage of the servicefabric definition allowing to specify User.
         */
        interface WithUser {
           /**
            * Specifies resourceGroupName, labName, userName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @param userName The name of the user profile
            * @return the next definition stage
            */
            WithCreate withExistingUser(String resourceGroupName, String labName, String userName);
        }

        /**
         * The stage of the servicefabric definition allowing to specify EnvironmentId.
         */
        interface WithEnvironmentId {
            /**
             * Specifies environmentId.
             * @param environmentId The resource id of the environment under which the service fabric resource is present
             * @return the next definition stage
             */
            WithCreate withEnvironmentId(String environmentId);
        }

        /**
         * The stage of the servicefabric definition allowing to specify ExternalServiceFabricId.
         */
        interface WithExternalServiceFabricId {
            /**
             * Specifies externalServiceFabricId.
             * @param externalServiceFabricId The backing service fabric resource's id
             * @return the next definition stage
             */
            WithCreate withExternalServiceFabricId(String externalServiceFabricId);
        }

        /**
         * The stage of the servicefabric definition allowing to specify Location.
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
         * The stage of the servicefabric definition allowing to specify Tags.
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
        interface WithCreate extends Creatable<ServiceFabric>, DefinitionStages.WithEnvironmentId, DefinitionStages.WithExternalServiceFabricId, DefinitionStages.WithLocation, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a ServiceFabric update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServiceFabric>, UpdateStages.WithEnvironmentId, UpdateStages.WithExternalServiceFabricId, UpdateStages.WithTags {
    }

    /**
     * Grouping of ServiceFabric update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the servicefabric update allowing to specify EnvironmentId.
         */
        interface WithEnvironmentId {
            /**
             * Specifies environmentId.
             * @param environmentId The resource id of the environment under which the service fabric resource is present
             * @return the next update stage
             */
            Update withEnvironmentId(String environmentId);
        }

        /**
         * The stage of the servicefabric update allowing to specify ExternalServiceFabricId.
         */
        interface WithExternalServiceFabricId {
            /**
             * Specifies externalServiceFabricId.
             * @param externalServiceFabricId The backing service fabric resource's id
             * @return the next update stage
             */
            Update withExternalServiceFabricId(String externalServiceFabricId);
        }

        /**
         * The stage of the servicefabric update allowing to specify Tags.
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
