/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2018_02_01.DomainRegistrationProviders;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appservice.v2018_02_01.CsmOperationDescription;

class DomainRegistrationProvidersImpl extends WrapperImpl<DomainRegistrationProvidersInner> implements DomainRegistrationProviders {
    private final AppServiceManager manager;

    DomainRegistrationProvidersImpl(AppServiceManager manager) {
        super(manager.inner().domainRegistrationProviders());
        this.manager = manager;
    }

    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CsmOperationDescription> listOperationsAsync() {
        DomainRegistrationProvidersInner client = this.inner();
        return client.listOperationsAsync()
        .flatMapIterable(new Func1<Page<CsmOperationDescriptionInner>, Iterable<CsmOperationDescriptionInner>>() {
            @Override
            public Iterable<CsmOperationDescriptionInner> call(Page<CsmOperationDescriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CsmOperationDescriptionInner, CsmOperationDescription>() {
            @Override
            public CsmOperationDescription call(CsmOperationDescriptionInner inner) {
                return new CsmOperationDescriptionImpl(inner, manager());
            }
        });
    }

}