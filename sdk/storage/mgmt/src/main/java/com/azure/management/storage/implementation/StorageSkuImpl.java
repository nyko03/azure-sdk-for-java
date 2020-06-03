// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage.implementation;

import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.storage.models.Kind;
import com.azure.management.storage.models.Restriction;
import com.azure.management.storage.models.SkuCapability;
import com.azure.management.storage.models.SkuName;
import com.azure.management.storage.models.SkuTier;
import com.azure.management.storage.models.StorageAccountSkuType;
import com.azure.management.storage.models.StorageResourceType;
import com.azure.management.storage.models.StorageSku;
import com.azure.management.storage.fluent.inner.SkuInformationInner;
import java.util.ArrayList;
import java.util.List;

/** The implementation for {@link StorageSku}. */
class StorageSkuImpl implements StorageSku {
    private final SkuInformationInner inner;

    StorageSkuImpl(SkuInformationInner skuInner) {
        this.inner = skuInner;
    }

    @Override
    public SkuName name() {
        return this.inner.name();
    }

    @Override
    public SkuTier tier() {
        return this.inner.tier();
    }

    @Override
    public StorageResourceType resourceType() {
        if (this.inner.resourceType() != null) {
            return StorageResourceType.fromString(this.inner.resourceType());
        } else {
            return null;
        }
    }

    @Override
    public List<Region> regions() {
        List<Region> regions = new ArrayList<>();
        if (this.inner.locations() != null) {
            for (String location : this.inner.locations()) {
                regions.add(Region.fromName(location));
            }
        }
        return regions;
    }

    @Override
    public List<SkuCapability> capabilities() {
        if (this.inner.capabilities() != null) {
            return this.inner.capabilities();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public List<Restriction> restrictions() {
        if (this.inner.restrictions() != null) {
            return this.inner.restrictions();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public Kind storageAccountKind() {
        return this.inner.kind();
    }

    @Override
    public StorageAccountSkuType storageAccountSku() {
        if (this.resourceType() != null && this.resourceType().equals(StorageResourceType.STORAGE_ACCOUNTS)) {
            return StorageAccountSkuType.fromSkuName(this.inner.name());
        }
        return null;
    }

    @Override
    public SkuInformationInner inner() {
        return this.inner;
    }
}
