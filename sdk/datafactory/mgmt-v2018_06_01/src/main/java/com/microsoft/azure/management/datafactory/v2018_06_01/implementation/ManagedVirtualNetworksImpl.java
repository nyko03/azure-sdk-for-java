/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2018_06_01.ManagedVirtualNetworks;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datafactory.v2018_06_01.ManagedVirtualNetworkResource;

class ManagedVirtualNetworksImpl extends WrapperImpl<ManagedVirtualNetworksInner> implements ManagedVirtualNetworks {
    private final DataFactoryManager manager;

    ManagedVirtualNetworksImpl(DataFactoryManager manager) {
        super(manager.inner().managedVirtualNetworks());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public ManagedVirtualNetworkResourceImpl define(String name) {
        return wrapModel(name);
    }

    private ManagedVirtualNetworkResourceImpl wrapModel(ManagedVirtualNetworkResourceInner inner) {
        return  new ManagedVirtualNetworkResourceImpl(inner, manager());
    }

    private ManagedVirtualNetworkResourceImpl wrapModel(String name) {
        return new ManagedVirtualNetworkResourceImpl(name, this.manager());
    }

    @Override
    public Observable<ManagedVirtualNetworkResource> listByFactoryAsync(final String resourceGroupName, final String factoryName) {
        ManagedVirtualNetworksInner client = this.inner();
        return client.listByFactoryAsync(resourceGroupName, factoryName)
        .flatMapIterable(new Func1<Page<ManagedVirtualNetworkResourceInner>, Iterable<ManagedVirtualNetworkResourceInner>>() {
            @Override
            public Iterable<ManagedVirtualNetworkResourceInner> call(Page<ManagedVirtualNetworkResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedVirtualNetworkResourceInner, ManagedVirtualNetworkResource>() {
            @Override
            public ManagedVirtualNetworkResource call(ManagedVirtualNetworkResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ManagedVirtualNetworkResource> getAsync(String resourceGroupName, String factoryName, String managedVirtualNetworkName) {
        ManagedVirtualNetworksInner client = this.inner();
        return client.getAsync(resourceGroupName, factoryName, managedVirtualNetworkName)
        .flatMap(new Func1<ManagedVirtualNetworkResourceInner, Observable<ManagedVirtualNetworkResource>>() {
            @Override
            public Observable<ManagedVirtualNetworkResource> call(ManagedVirtualNetworkResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ManagedVirtualNetworkResource)wrapModel(inner));
                }
            }
       });
    }

}
