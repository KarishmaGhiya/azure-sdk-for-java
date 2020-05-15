// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PremierAddOnPatchResource model. */
@JsonFlatten
@Fluent
public class PremierAddOnPatchResource extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PremierAddOnPatchResource.class);

    /*
     * Premier add on SKU.
     */
    @JsonProperty(value = "properties.sku")
    private String sku;

    /*
     * Premier add on Product.
     */
    @JsonProperty(value = "properties.product")
    private String product;

    /*
     * Premier add on Vendor.
     */
    @JsonProperty(value = "properties.vendor")
    private String vendor;

    /*
     * Premier add on Marketplace publisher.
     */
    @JsonProperty(value = "properties.marketplacePublisher")
    private String marketplacePublisher;

    /*
     * Premier add on Marketplace offer.
     */
    @JsonProperty(value = "properties.marketplaceOffer")
    private String marketplaceOffer;

    /**
     * Get the sku property: Premier add on SKU.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Premier add on SKU.
     *
     * @param sku the sku value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the product property: Premier add on Product.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: Premier add on Product.
     *
     * @param product the product value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the vendor property: Premier add on Vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set the vendor property: Premier add on Vendor.
     *
     * @param vendor the vendor value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get the marketplacePublisher property: Premier add on Marketplace publisher.
     *
     * @return the marketplacePublisher value.
     */
    public String marketplacePublisher() {
        return this.marketplacePublisher;
    }

    /**
     * Set the marketplacePublisher property: Premier add on Marketplace publisher.
     *
     * @param marketplacePublisher the marketplacePublisher value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withMarketplacePublisher(String marketplacePublisher) {
        this.marketplacePublisher = marketplacePublisher;
        return this;
    }

    /**
     * Get the marketplaceOffer property: Premier add on Marketplace offer.
     *
     * @return the marketplaceOffer value.
     */
    public String marketplaceOffer() {
        return this.marketplaceOffer;
    }

    /**
     * Set the marketplaceOffer property: Premier add on Marketplace offer.
     *
     * @param marketplaceOffer the marketplaceOffer value to set.
     * @return the PremierAddOnPatchResource object itself.
     */
    public PremierAddOnPatchResource withMarketplaceOffer(String marketplaceOffer) {
        this.marketplaceOffer = marketplaceOffer;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
