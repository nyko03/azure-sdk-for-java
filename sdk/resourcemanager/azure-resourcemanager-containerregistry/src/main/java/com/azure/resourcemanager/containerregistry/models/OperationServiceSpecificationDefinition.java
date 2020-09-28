// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The definition of Azure Monitoring metrics list. */
@Fluent
public final class OperationServiceSpecificationDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationServiceSpecificationDefinition.class);

    /*
     * A list of Azure Monitoring metrics definition.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<OperationMetricSpecificationDefinition> metricSpecifications;

    /**
     * Get the metricSpecifications property: A list of Azure Monitoring metrics definition.
     *
     * @return the metricSpecifications value.
     */
    public List<OperationMetricSpecificationDefinition> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: A list of Azure Monitoring metrics definition.
     *
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the OperationServiceSpecificationDefinition object itself.
     */
    public OperationServiceSpecificationDefinition withMetricSpecifications(
        List<OperationMetricSpecificationDefinition> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
    }
}
