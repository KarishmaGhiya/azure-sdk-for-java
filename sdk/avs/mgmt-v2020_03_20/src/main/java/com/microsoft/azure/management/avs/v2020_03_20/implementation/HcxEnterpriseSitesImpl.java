/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.avs.v2020_03_20.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.avs.v2020_03_20.HcxEnterpriseSites;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.avs.v2020_03_20.HcxEnterpriseSite;

class HcxEnterpriseSitesImpl extends WrapperImpl<HcxEnterpriseSitesInner> implements HcxEnterpriseSites {
    private final AVSManager manager;

    HcxEnterpriseSitesImpl(AVSManager manager) {
        super(manager.inner().hcxEnterpriseSites());
        this.manager = manager;
    }

    public AVSManager manager() {
        return this.manager;
    }

    @Override
    public HcxEnterpriseSiteImpl define(String name) {
        return wrapModel(name);
    }

    private HcxEnterpriseSiteImpl wrapModel(HcxEnterpriseSiteInner inner) {
        return  new HcxEnterpriseSiteImpl(inner, manager());
    }

    private HcxEnterpriseSiteImpl wrapModel(String name) {
        return new HcxEnterpriseSiteImpl(name, this.manager());
    }

    @Override
    public Observable<HcxEnterpriseSite> listAsync(final String resourceGroupName, final String privateCloudName) {
        HcxEnterpriseSitesInner client = this.inner();
        return client.listAsync(resourceGroupName, privateCloudName)
        .flatMapIterable(new Func1<Page<HcxEnterpriseSiteInner>, Iterable<HcxEnterpriseSiteInner>>() {
            @Override
            public Iterable<HcxEnterpriseSiteInner> call(Page<HcxEnterpriseSiteInner> page) {
                return page.items();
            }
        })
        .map(new Func1<HcxEnterpriseSiteInner, HcxEnterpriseSite>() {
            @Override
            public HcxEnterpriseSite call(HcxEnterpriseSiteInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<HcxEnterpriseSite> getAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        HcxEnterpriseSitesInner client = this.inner();
        return client.getAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName)
        .flatMap(new Func1<HcxEnterpriseSiteInner, Observable<HcxEnterpriseSite>>() {
            @Override
            public Observable<HcxEnterpriseSite> call(HcxEnterpriseSiteInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((HcxEnterpriseSite)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        HcxEnterpriseSitesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName).toCompletable();
    }

}
