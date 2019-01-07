/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.microsoft.azure.management.devtestlab.v2018_09_15.ServiceFabric;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.devtestlab.v2018_09_15.ServiceFabricFragment;
import java.util.Map;
import com.microsoft.azure.management.devtestlab.v2018_09_15.ApplicableSchedule;
import rx.functions.Func1;

class ServiceFabricImpl extends CreatableUpdatableImpl<ServiceFabric, ServiceFabricInner, ServiceFabricImpl> implements ServiceFabric, ServiceFabric.Definition, ServiceFabric.Update {
    private final DevTestLabManager manager;
    private String resourceGroupName;
    private String labName;
    private String userName;
    private String name;
    private ServiceFabricFragment updateParameter;

    ServiceFabricImpl(String name, DevTestLabManager manager) {
        super(name, new ServiceFabricInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
        this.updateParameter = new ServiceFabricFragment();
    }

    ServiceFabricImpl(ServiceFabricInner inner, DevTestLabManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.userName = IdParsingUtils.getValueFromIdByName(inner.id(), "users");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "servicefabrics");
        //
        this.updateParameter = new ServiceFabricFragment();
    }

    @Override
    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServiceFabric> createResourceAsync() {
        ServiceFabricsInner client = this.manager().inner().serviceFabrics();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labName, this.userName, this.name, this.inner())
            .map(new Func1<ServiceFabricInner, ServiceFabricInner>() {
               @Override
               public ServiceFabricInner call(ServiceFabricInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServiceFabric> updateResourceAsync() {
        ServiceFabricsInner client = this.manager().inner().serviceFabrics();
        return client.updateAsync(this.resourceGroupName, this.labName, this.userName, this.name, this.updateParameter)
            .map(new Func1<ServiceFabricInner, ServiceFabricInner>() {
               @Override
               public ServiceFabricInner call(ServiceFabricInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServiceFabricInner> getInnerAsync() {
        ServiceFabricsInner client = this.manager().inner().serviceFabrics();
        return client.getAsync(this.resourceGroupName, this.labName, this.userName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ServiceFabricFragment();
    }

    @Override
    public ApplicableSchedule applicableSchedule() {
        ApplicableScheduleInner inner = this.inner().applicableSchedule();
        if (inner != null) {
            return  new ApplicableScheduleImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public String environmentId() {
        return this.inner().environmentId();
    }

    @Override
    public String externalServiceFabricId() {
        return this.inner().externalServiceFabricId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public ServiceFabricImpl withExistingUser(String resourceGroupName, String labName, String userName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        this.userName = userName;
        return this;
    }

    @Override
    public ServiceFabricImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ServiceFabricImpl withEnvironmentId(String environmentId) {
        if (isInCreateMode()) {
            this.inner().withEnvironmentId(environmentId);
        } else {
            this.updateParameter.withEnvironmentId(environmentId);
        }
        return this;
    }

    @Override
    public ServiceFabricImpl withExternalServiceFabricId(String externalServiceFabricId) {
        if (isInCreateMode()) {
            this.inner().withExternalServiceFabricId(externalServiceFabricId);
        } else {
            this.updateParameter.withExternalServiceFabricId(externalServiceFabricId);
        }
        return this;
    }

    @Override
    public ServiceFabricImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
