/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.VnetGateway;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class VnetGatewayImpl extends CreatableUpdatableImpl<VnetGateway, VnetGatewayInner, VnetGatewayImpl> implements VnetGateway, VnetGateway.Definition, VnetGateway.Update {
    private final WebManager manager;
    private String resourceGroupName;
    private String name;
    private String vnetName;
    private String gatewayName;
    private String slot;

    VnetGatewayImpl(String name, WebManager manager) {
        super(name, new VnetGatewayInner());
        this.manager = manager;
        // Set resource name
        this.slot = name;
        //
    }

    VnetGatewayImpl(VnetGatewayInner inner, WebManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.slot = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.vnetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworkConnections");
        this.gatewayName = IdParsingUtils.getValueFromIdByName(inner.id(), "gateways");
        this.slot = IdParsingUtils.getValueFromIdByName(inner.id(), "slots");
        //
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VnetGateway> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdateVnetConnectionGatewaySlotAsync(this.resourceGroupName, this.name, this.vnetName, this.gatewayName, this.slot, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VnetGateway> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.updateVnetConnectionGatewaySlotAsync(this.resourceGroupName, this.name, this.vnetName, this.gatewayName, this.slot, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VnetGatewayInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getVnetConnectionGatewaySlotAsync(this.resourceGroupName, this.name, this.vnetName, this.gatewayName, this.slot);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String vnetName() {
        return this.inner().vnetName();
    }

    @Override
    public String vpnPackageUri() {
        return this.inner().vpnPackageUri();
    }

    @Override
    public VnetGatewayImpl withExistingVirtualNetworkConnection(String resourceGroupName, String name, String vnetName, String slot) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.vnetName = vnetName;
        this.slot = slot;
        return this;
    }

    @Override
    public VnetGatewayImpl withVpnPackageUri(String vpnPackageUri) {
        this.inner().withVpnPackageUri(vpnPackageUri);
        return this;
    }

    @Override
    public VnetGatewayImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public VnetGatewayImpl withVnetName(String vnetName) {
        this.inner().withVnetName(vnetName);
        return this;
    }

}
