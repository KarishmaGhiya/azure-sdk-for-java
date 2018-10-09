/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batchai.v2018_03_01.implementation.BatchAIManager;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batchai.v2018_03_01.implementation.JobInner;

/**
 * Type representing Job.
 */
public interface Job extends HasInner<JobInner>, Resource, GroupableResourceCore<BatchAIManager, JobInner>, HasResourceGroup, Refreshable<Job>, Updatable<Job.Update>, HasManager<BatchAIManager> {
    /**
     * @return the caffeSettings value.
     */
    CaffeSettings caffeSettings();

    /**
     * @return the chainerSettings value.
     */
    ChainerSettings chainerSettings();

    /**
     * @return the cluster value.
     */
    ResourceId cluster();

    /**
     * @return the cntkSettings value.
     */
    CNTKsettings cntkSettings();

    /**
     * @return the constraints value.
     */
    JobPropertiesConstraints constraints();

    /**
     * @return the containerSettings value.
     */
    ContainerSettings containerSettings();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the customToolkitSettings value.
     */
    CustomToolkitSettings customToolkitSettings();

    /**
     * @return the environmentVariables value.
     */
    List<EnvironmentVariable> environmentVariables();

    /**
     * @return the executionInfo value.
     */
    JobPropertiesExecutionInfo executionInfo();

    /**
     * @return the executionState value.
     */
    ExecutionState executionState();

    /**
     * @return the executionStateTransitionTime value.
     */
    DateTime executionStateTransitionTime();

    /**
     * @return the experimentName value.
     */
    String experimentName();

    /**
     * @return the inputDirectories value.
     */
    List<InputDirectory> inputDirectories();

    /**
     * @return the jobOutputDirectoryPathSegment value.
     */
    String jobOutputDirectoryPathSegment();

    /**
     * @return the jobPreparation value.
     */
    JobPreparation jobPreparation();

    /**
     * @return the mountVolumes value.
     */
    MountVolumes mountVolumes();

    /**
     * @return the nodeCount value.
     */
    Integer nodeCount();

    /**
     * @return the outputDirectories value.
     */
    List<OutputDirectory> outputDirectories();

    /**
     * @return the priority value.
     */
    Integer priority();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the provisioningStateTransitionTime value.
     */
    DateTime provisioningStateTransitionTime();

    /**
     * @return the pyTorchSettings value.
     */
    PyTorchSettings pyTorchSettings();

    /**
     * @return the secrets value.
     */
    List<EnvironmentVariableWithSecretValue> secrets();

    /**
     * @return the stdOutErrPathPrefix value.
     */
    String stdOutErrPathPrefix();

    /**
     * @return the tensorFlowSettings value.
     */
    TensorFlowSettings tensorFlowSettings();

    /**
     * @return the toolType value.
     */
    ToolType toolType();

    /**
     * The entirety of the Job definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCluster, DefinitionStages.WithNodeCount, DefinitionStages.WithStdOutErrPathPrefix, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Job definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Job definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Job definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCluster> {
        }

        /**
         * The stage of the job definition allowing to specify Cluster.
         */
        interface WithCluster {
           /**
            * Specifies cluster.
            * @param cluster the cluster parameter value
            * @return the next definition stage
*/
            WithNodeCount withCluster(ResourceId cluster);
        }

        /**
         * The stage of the job definition allowing to specify NodeCount.
         */
        interface WithNodeCount {
           /**
            * Specifies nodeCount.
            * @param nodeCount The job will be gang scheduled on that many compute nodes
            * @return the next definition stage
*/
            WithStdOutErrPathPrefix withNodeCount(int nodeCount);
        }

        /**
         * The stage of the job definition allowing to specify StdOutErrPathPrefix.
         */
        interface WithStdOutErrPathPrefix {
           /**
            * Specifies stdOutErrPathPrefix.
            * @param stdOutErrPathPrefix The path where the Batch AI service will upload stdout and stderror of the job
            * @return the next definition stage
*/
            WithCreate withStdOutErrPathPrefix(String stdOutErrPathPrefix);
        }

        /**
         * The stage of the job definition allowing to specify Caffe2Settings.
         */
        interface WithCaffe2Settings {
            /**
             * Specifies caffe2Settings.
             * @param caffe2Settings the caffe2Settings parameter value
             * @return the next definition stage
             */
            WithCreate withCaffe2Settings(Caffe2Settings caffe2Settings);
        }

        /**
         * The stage of the job definition allowing to specify CaffeSettings.
         */
        interface WithCaffeSettings {
            /**
             * Specifies caffeSettings.
             * @param caffeSettings the caffeSettings parameter value
             * @return the next definition stage
             */
            WithCreate withCaffeSettings(CaffeSettings caffeSettings);
        }

        /**
         * The stage of the job definition allowing to specify ChainerSettings.
         */
        interface WithChainerSettings {
            /**
             * Specifies chainerSettings.
             * @param chainerSettings the chainerSettings parameter value
             * @return the next definition stage
             */
            WithCreate withChainerSettings(ChainerSettings chainerSettings);
        }

        /**
         * The stage of the job definition allowing to specify CntkSettings.
         */
        interface WithCntkSettings {
            /**
             * Specifies cntkSettings.
             * @param cntkSettings the cntkSettings parameter value
             * @return the next definition stage
             */
            WithCreate withCntkSettings(CNTKsettings cntkSettings);
        }

        /**
         * The stage of the job definition allowing to specify Constraints.
         */
        interface WithConstraints {
            /**
             * Specifies constraints.
             * @param constraints Constraints associated with the Job
             * @return the next definition stage
             */
            WithCreate withConstraints(JobBasePropertiesConstraints constraints);
        }

        /**
         * The stage of the job definition allowing to specify ContainerSettings.
         */
        interface WithContainerSettings {
            /**
             * Specifies containerSettings.
             * @param containerSettings If the container was downloaded as part of cluster setup then the same container image will be used. If not provided, the job will run on the VM
             * @return the next definition stage
             */
            WithCreate withContainerSettings(ContainerSettings containerSettings);
        }

        /**
         * The stage of the job definition allowing to specify CustomToolkitSettings.
         */
        interface WithCustomToolkitSettings {
            /**
             * Specifies customToolkitSettings.
             * @param customToolkitSettings the customToolkitSettings parameter value
             * @return the next definition stage
             */
            WithCreate withCustomToolkitSettings(CustomToolkitSettings customToolkitSettings);
        }

        /**
         * The stage of the job definition allowing to specify EnvironmentVariables.
         */
        interface WithEnvironmentVariables {
            /**
             * Specifies environmentVariables.
             * @param environmentVariables Batch AI will setup these additional environment variables for the job
             * @return the next definition stage
             */
            WithCreate withEnvironmentVariables(List<EnvironmentVariable> environmentVariables);
        }

        /**
         * The stage of the job definition allowing to specify ExperimentName.
         */
        interface WithExperimentName {
            /**
             * Specifies experimentName.
             * @param experimentName Describe the experiment information of the job
             * @return the next definition stage
             */
            WithCreate withExperimentName(String experimentName);
        }

        /**
         * The stage of the job definition allowing to specify InputDirectories.
         */
        interface WithInputDirectories {
            /**
             * Specifies inputDirectories.
             * @param inputDirectories the inputDirectories parameter value
             * @return the next definition stage
             */
            WithCreate withInputDirectories(List<InputDirectory> inputDirectories);
        }

        /**
         * The stage of the job definition allowing to specify JobPreparation.
         */
        interface WithJobPreparation {
            /**
             * Specifies jobPreparation.
             * @param jobPreparation The specified actions will run on all the nodes that are part of the job
             * @return the next definition stage
             */
            WithCreate withJobPreparation(JobPreparation jobPreparation);
        }

        /**
         * The stage of the job definition allowing to specify MountVolumes.
         */
        interface WithMountVolumes {
            /**
             * Specifies mountVolumes.
             * @param mountVolumes These volumes will be mounted before the job execution and will be unmouted after the job completion. The volumes will be mounted at location specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable
             * @return the next definition stage
             */
            WithCreate withMountVolumes(MountVolumes mountVolumes);
        }

        /**
         * The stage of the job definition allowing to specify OutputDirectories.
         */
        interface WithOutputDirectories {
            /**
             * Specifies outputDirectories.
             * @param outputDirectories the outputDirectories parameter value
             * @return the next definition stage
             */
            WithCreate withOutputDirectories(List<OutputDirectory> outputDirectories);
        }

        /**
         * The stage of the job definition allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Priority associated with the job. Priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. The default value is 0
             * @return the next definition stage
             */
            WithCreate withPriority(Integer priority);
        }

        /**
         * The stage of the job definition allowing to specify PyTorchSettings.
         */
        interface WithPyTorchSettings {
            /**
             * Specifies pyTorchSettings.
             * @param pyTorchSettings the pyTorchSettings parameter value
             * @return the next definition stage
             */
            WithCreate withPyTorchSettings(PyTorchSettings pyTorchSettings);
        }

        /**
         * The stage of the job definition allowing to specify Secrets.
         */
        interface WithSecrets {
            /**
             * Specifies secrets.
             * @param secrets Batch AI will setup these additional environment variables for the job. Server will never report values of these variables back
             * @return the next definition stage
             */
            WithCreate withSecrets(List<EnvironmentVariableWithSecretValue> secrets);
        }

        /**
         * The stage of the job definition allowing to specify TensorFlowSettings.
         */
        interface WithTensorFlowSettings {
            /**
             * Specifies tensorFlowSettings.
             * @param tensorFlowSettings the tensorFlowSettings parameter value
             * @return the next definition stage
             */
            WithCreate withTensorFlowSettings(TensorFlowSettings tensorFlowSettings);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Job>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithCaffe2Settings, DefinitionStages.WithCaffeSettings, DefinitionStages.WithChainerSettings, DefinitionStages.WithCntkSettings, DefinitionStages.WithConstraints, DefinitionStages.WithContainerSettings, DefinitionStages.WithCustomToolkitSettings, DefinitionStages.WithEnvironmentVariables, DefinitionStages.WithExperimentName, DefinitionStages.WithInputDirectories, DefinitionStages.WithJobPreparation, DefinitionStages.WithMountVolumes, DefinitionStages.WithOutputDirectories, DefinitionStages.WithPriority, DefinitionStages.WithPyTorchSettings, DefinitionStages.WithSecrets, DefinitionStages.WithTensorFlowSettings {
        }
    }
    /**
     * The template for a Job update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Job>, Resource.UpdateWithTags<Update>, UpdateStages.WithCaffe2Settings, UpdateStages.WithCaffeSettings, UpdateStages.WithChainerSettings, UpdateStages.WithCntkSettings, UpdateStages.WithConstraints, UpdateStages.WithContainerSettings, UpdateStages.WithCustomToolkitSettings, UpdateStages.WithEnvironmentVariables, UpdateStages.WithExperimentName, UpdateStages.WithInputDirectories, UpdateStages.WithJobPreparation, UpdateStages.WithMountVolumes, UpdateStages.WithOutputDirectories, UpdateStages.WithPriority, UpdateStages.WithPyTorchSettings, UpdateStages.WithSecrets, UpdateStages.WithTensorFlowSettings {
    }

    /**
     * Grouping of Job update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the job update allowing to specify Caffe2Settings.
         */
        interface WithCaffe2Settings {
            /**
             * Specifies caffe2Settings.
             * @param caffe2Settings the caffe2Settings parameter value
             * @return the next update stage
             */
            Update withCaffe2Settings(Caffe2Settings caffe2Settings);
        }

        /**
         * The stage of the job update allowing to specify CaffeSettings.
         */
        interface WithCaffeSettings {
            /**
             * Specifies caffeSettings.
             * @param caffeSettings the caffeSettings parameter value
             * @return the next update stage
             */
            Update withCaffeSettings(CaffeSettings caffeSettings);
        }

        /**
         * The stage of the job update allowing to specify ChainerSettings.
         */
        interface WithChainerSettings {
            /**
             * Specifies chainerSettings.
             * @param chainerSettings the chainerSettings parameter value
             * @return the next update stage
             */
            Update withChainerSettings(ChainerSettings chainerSettings);
        }

        /**
         * The stage of the job update allowing to specify CntkSettings.
         */
        interface WithCntkSettings {
            /**
             * Specifies cntkSettings.
             * @param cntkSettings the cntkSettings parameter value
             * @return the next update stage
             */
            Update withCntkSettings(CNTKsettings cntkSettings);
        }

        /**
         * The stage of the job update allowing to specify Constraints.
         */
        interface WithConstraints {
            /**
             * Specifies constraints.
             * @param constraints Constraints associated with the Job
             * @return the next update stage
             */
            Update withConstraints(JobBasePropertiesConstraints constraints);
        }

        /**
         * The stage of the job update allowing to specify ContainerSettings.
         */
        interface WithContainerSettings {
            /**
             * Specifies containerSettings.
             * @param containerSettings If the container was downloaded as part of cluster setup then the same container image will be used. If not provided, the job will run on the VM
             * @return the next update stage
             */
            Update withContainerSettings(ContainerSettings containerSettings);
        }

        /**
         * The stage of the job update allowing to specify CustomToolkitSettings.
         */
        interface WithCustomToolkitSettings {
            /**
             * Specifies customToolkitSettings.
             * @param customToolkitSettings the customToolkitSettings parameter value
             * @return the next update stage
             */
            Update withCustomToolkitSettings(CustomToolkitSettings customToolkitSettings);
        }

        /**
         * The stage of the job update allowing to specify EnvironmentVariables.
         */
        interface WithEnvironmentVariables {
            /**
             * Specifies environmentVariables.
             * @param environmentVariables Batch AI will setup these additional environment variables for the job
             * @return the next update stage
             */
            Update withEnvironmentVariables(List<EnvironmentVariable> environmentVariables);
        }

        /**
         * The stage of the job update allowing to specify ExperimentName.
         */
        interface WithExperimentName {
            /**
             * Specifies experimentName.
             * @param experimentName Describe the experiment information of the job
             * @return the next update stage
             */
            Update withExperimentName(String experimentName);
        }

        /**
         * The stage of the job update allowing to specify InputDirectories.
         */
        interface WithInputDirectories {
            /**
             * Specifies inputDirectories.
             * @param inputDirectories the inputDirectories parameter value
             * @return the next update stage
             */
            Update withInputDirectories(List<InputDirectory> inputDirectories);
        }

        /**
         * The stage of the job update allowing to specify JobPreparation.
         */
        interface WithJobPreparation {
            /**
             * Specifies jobPreparation.
             * @param jobPreparation The specified actions will run on all the nodes that are part of the job
             * @return the next update stage
             */
            Update withJobPreparation(JobPreparation jobPreparation);
        }

        /**
         * The stage of the job update allowing to specify MountVolumes.
         */
        interface WithMountVolumes {
            /**
             * Specifies mountVolumes.
             * @param mountVolumes These volumes will be mounted before the job execution and will be unmouted after the job completion. The volumes will be mounted at location specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable
             * @return the next update stage
             */
            Update withMountVolumes(MountVolumes mountVolumes);
        }

        /**
         * The stage of the job update allowing to specify OutputDirectories.
         */
        interface WithOutputDirectories {
            /**
             * Specifies outputDirectories.
             * @param outputDirectories the outputDirectories parameter value
             * @return the next update stage
             */
            Update withOutputDirectories(List<OutputDirectory> outputDirectories);
        }

        /**
         * The stage of the job update allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Priority associated with the job. Priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. The default value is 0
             * @return the next update stage
             */
            Update withPriority(Integer priority);
        }

        /**
         * The stage of the job update allowing to specify PyTorchSettings.
         */
        interface WithPyTorchSettings {
            /**
             * Specifies pyTorchSettings.
             * @param pyTorchSettings the pyTorchSettings parameter value
             * @return the next update stage
             */
            Update withPyTorchSettings(PyTorchSettings pyTorchSettings);
        }

        /**
         * The stage of the job update allowing to specify Secrets.
         */
        interface WithSecrets {
            /**
             * Specifies secrets.
             * @param secrets Batch AI will setup these additional environment variables for the job. Server will never report values of these variables back
             * @return the next update stage
             */
            Update withSecrets(List<EnvironmentVariableWithSecretValue> secrets);
        }

        /**
         * The stage of the job update allowing to specify TensorFlowSettings.
         */
        interface WithTensorFlowSettings {
            /**
             * Specifies tensorFlowSettings.
             * @param tensorFlowSettings the tensorFlowSettings parameter value
             * @return the next update stage
             */
            Update withTensorFlowSettings(TensorFlowSettings tensorFlowSettings);
        }

    }
}
