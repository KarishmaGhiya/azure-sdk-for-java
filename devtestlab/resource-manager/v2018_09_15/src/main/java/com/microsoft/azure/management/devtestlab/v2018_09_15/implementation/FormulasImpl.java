/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2018_09_15.Formulas;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2018_09_15.Formula;

class FormulasImpl extends WrapperImpl<FormulasInner> implements Formulas {
    private final DevTestLabManager manager;

    FormulasImpl(DevTestLabManager manager) {
        super(manager.inner().formulas());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public FormulaImpl define(String name) {
        return wrapModel(name);
    }

    private FormulaImpl wrapModel(FormulaInner inner) {
        return  new FormulaImpl(inner, manager());
    }

    private FormulaImpl wrapModel(String name) {
        return new FormulaImpl(name, this.manager());
    }

    @Override
    public Observable<Formula> listAsync(final String resourceGroupName, final String labName) {
        FormulasInner client = this.inner();
        return client.listAsync(resourceGroupName, labName)
        .flatMapIterable(new Func1<Page<FormulaInner>, Iterable<FormulaInner>>() {
            @Override
            public Iterable<FormulaInner> call(Page<FormulaInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FormulaInner, Formula>() {
            @Override
            public Formula call(FormulaInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Formula> getAsync(String resourceGroupName, String labName, String name) {
        FormulasInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, name)
        .map(new Func1<FormulaInner, Formula>() {
            @Override
            public Formula call(FormulaInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String labName, String name) {
        FormulasInner client = this.inner();
        return client.deleteAsync(resourceGroupName, labName, name).toCompletable();
    }

}
