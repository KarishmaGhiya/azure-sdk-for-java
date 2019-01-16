/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.ScheduleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2018_09_15.implementation.DevTestLabManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing LabSchedule.
 */
public interface LabSchedule extends HasInner<ScheduleInner>, Indexable, Refreshable<LabSchedule>, Updatable<LabSchedule.Update>, HasManager<DevTestLabManager> {
    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the dailyRecurrence value.
     */
    DayDetails dailyRecurrence();

    /**
     * @return the hourlyRecurrence value.
     */
    HourDetails hourlyRecurrence();

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
     * @return the notificationSettings value.
     */
    NotificationSettings notificationSettings();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the status value.
     */
    EnableStatus status();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the targetResourceId value.
     */
    String targetResourceId();

    /**
     * @return the taskType value.
     */
    String taskType();

    /**
     * @return the timeZoneId value.
     */
    String timeZoneId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * @return the weeklyRecurrence value.
     */
    WeekDetails weeklyRecurrence();

    /**
     * The entirety of the LabSchedule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLab, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of LabSchedule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a LabSchedule definition.
         */
        interface Blank extends WithLab {
        }

        /**
         * The stage of the labschedule definition allowing to specify Lab.
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
         * The stage of the labschedule definition allowing to specify DailyRecurrence.
         */
        interface WithDailyRecurrence {
            /**
             * Specifies dailyRecurrence.
             * @param dailyRecurrence If the schedule will occur once each day of the week, specify the daily recurrence
             * @return the next definition stage
             */
            WithCreate withDailyRecurrence(DayDetails dailyRecurrence);
        }

        /**
         * The stage of the labschedule definition allowing to specify HourlyRecurrence.
         */
        interface WithHourlyRecurrence {
            /**
             * Specifies hourlyRecurrence.
             * @param hourlyRecurrence If the schedule will occur multiple times a day, specify the hourly recurrence
             * @return the next definition stage
             */
            WithCreate withHourlyRecurrence(HourDetails hourlyRecurrence);
        }

        /**
         * The stage of the labschedule definition allowing to specify Location.
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
         * The stage of the labschedule definition allowing to specify NotificationSettings.
         */
        interface WithNotificationSettings {
            /**
             * Specifies notificationSettings.
             * @param notificationSettings Notification settings
             * @return the next definition stage
             */
            WithCreate withNotificationSettings(NotificationSettings notificationSettings);
        }

        /**
         * The stage of the labschedule definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status The status of the schedule (i.e. Enabled, Disabled). Possible values include: 'Enabled', 'Disabled'
             * @return the next definition stage
             */
            WithCreate withStatus(EnableStatus status);
        }

        /**
         * The stage of the labschedule definition allowing to specify Tags.
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
         * The stage of the labschedule definition allowing to specify TargetResourceId.
         */
        interface WithTargetResourceId {
            /**
             * Specifies targetResourceId.
             * @param targetResourceId The resource ID to which the schedule belongs
             * @return the next definition stage
             */
            WithCreate withTargetResourceId(String targetResourceId);
        }

        /**
         * The stage of the labschedule definition allowing to specify TaskType.
         */
        interface WithTaskType {
            /**
             * Specifies taskType.
             * @param taskType The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart)
             * @return the next definition stage
             */
            WithCreate withTaskType(String taskType);
        }

        /**
         * The stage of the labschedule definition allowing to specify TimeZoneId.
         */
        interface WithTimeZoneId {
            /**
             * Specifies timeZoneId.
             * @param timeZoneId The time zone ID (e.g. Pacific Standard time)
             * @return the next definition stage
             */
            WithCreate withTimeZoneId(String timeZoneId);
        }

        /**
         * The stage of the labschedule definition allowing to specify WeeklyRecurrence.
         */
        interface WithWeeklyRecurrence {
            /**
             * Specifies weeklyRecurrence.
             * @param weeklyRecurrence If the schedule will occur only some days of the week, specify the weekly recurrence
             * @return the next definition stage
             */
            WithCreate withWeeklyRecurrence(WeekDetails weeklyRecurrence);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<LabSchedule>, DefinitionStages.WithDailyRecurrence, DefinitionStages.WithHourlyRecurrence, DefinitionStages.WithLocation, DefinitionStages.WithNotificationSettings, DefinitionStages.WithStatus, DefinitionStages.WithTags, DefinitionStages.WithTargetResourceId, DefinitionStages.WithTaskType, DefinitionStages.WithTimeZoneId, DefinitionStages.WithWeeklyRecurrence {
        }
    }
    /**
     * The template for a LabSchedule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<LabSchedule>, UpdateStages.WithDailyRecurrence, UpdateStages.WithHourlyRecurrence, UpdateStages.WithNotificationSettings, UpdateStages.WithStatus, UpdateStages.WithTags, UpdateStages.WithTargetResourceId, UpdateStages.WithTaskType, UpdateStages.WithTimeZoneId, UpdateStages.WithWeeklyRecurrence {
    }

    /**
     * Grouping of LabSchedule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the labschedule update allowing to specify DailyRecurrence.
         */
        interface WithDailyRecurrence {
            /**
             * Specifies dailyRecurrence.
             * @param dailyRecurrence If the schedule will occur once each day of the week, specify the daily recurrence
             * @return the next update stage
             */
            Update withDailyRecurrence(DayDetailsFragment dailyRecurrence);
        }

        /**
         * The stage of the labschedule update allowing to specify HourlyRecurrence.
         */
        interface WithHourlyRecurrence {
            /**
             * Specifies hourlyRecurrence.
             * @param hourlyRecurrence If the schedule will occur multiple times a day, specify the hourly recurrence
             * @return the next update stage
             */
            Update withHourlyRecurrence(HourDetailsFragment hourlyRecurrence);
        }

        /**
         * The stage of the labschedule update allowing to specify NotificationSettings.
         */
        interface WithNotificationSettings {
            /**
             * Specifies notificationSettings.
             * @param notificationSettings Notification settings
             * @return the next update stage
             */
            Update withNotificationSettings(NotificationSettingsFragment notificationSettings);
        }

        /**
         * The stage of the labschedule update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status The status of the schedule (i.e. Enabled, Disabled). Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withStatus(EnableStatus status);
        }

        /**
         * The stage of the labschedule update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the labschedule update allowing to specify TargetResourceId.
         */
        interface WithTargetResourceId {
            /**
             * Specifies targetResourceId.
             * @param targetResourceId The resource ID to which the schedule belongs
             * @return the next update stage
             */
            Update withTargetResourceId(String targetResourceId);
        }

        /**
         * The stage of the labschedule update allowing to specify TaskType.
         */
        interface WithTaskType {
            /**
             * Specifies taskType.
             * @param taskType The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart)
             * @return the next update stage
             */
            Update withTaskType(String taskType);
        }

        /**
         * The stage of the labschedule update allowing to specify TimeZoneId.
         */
        interface WithTimeZoneId {
            /**
             * Specifies timeZoneId.
             * @param timeZoneId The time zone ID (e.g. Pacific Standard time)
             * @return the next update stage
             */
            Update withTimeZoneId(String timeZoneId);
        }

        /**
         * The stage of the labschedule update allowing to specify WeeklyRecurrence.
         */
        interface WithWeeklyRecurrence {
            /**
             * Specifies weeklyRecurrence.
             * @param weeklyRecurrence If the schedule will occur only some days of the week, specify the weekly recurrence
             * @return the next update stage
             */
            Update withWeeklyRecurrence(WeekDetailsFragment weeklyRecurrence);
        }

    }
}
