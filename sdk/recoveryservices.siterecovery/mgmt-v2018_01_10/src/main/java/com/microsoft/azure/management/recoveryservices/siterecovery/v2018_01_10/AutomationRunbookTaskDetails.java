/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the task details for an automation runbook.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("AutomationRunbookTaskDetails")
public class AutomationRunbookTaskDetails extends TaskTypeDetails {
    /**
     * The recovery plan task name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The cloud service of the automation runbook account.
     */
    @JsonProperty(value = "cloudServiceName")
    private String cloudServiceName;

    /**
     * The subscription Id of the automation runbook account.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * The automation account name of the runbook.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /**
     * The runbook Id.
     */
    @JsonProperty(value = "runbookId")
    private String runbookId;

    /**
     * The runbook name.
     */
    @JsonProperty(value = "runbookName")
    private String runbookName;

    /**
     * The job Id of the runbook execution.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /**
     * The execution output of the runbook.
     */
    @JsonProperty(value = "jobOutput")
    private String jobOutput;

    /**
     * A value indicating whether it is a primary side script or not.
     */
    @JsonProperty(value = "isPrimarySideScript")
    private Boolean isPrimarySideScript;

    /**
     * Get the recovery plan task name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the recovery plan task name.
     *
     * @param name the name value to set
     * @return the AutomationRunbookTaskDetails object itself.
     */
    public AutomationRunbookTaskDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the cloud service of the automation runbook account.
     *
     * @return the cloudServiceName value
     */
    public String cloudServiceName() {
        return this.cloudServiceName;
    }

    /**
     * Set the cloud service of the automation runbook account.
     *
     * @param cloudServiceName the cloudServiceName value to set
     * @return the AutomationRunbookTaskDetails object itself.
     */
    public AutomationRunbookTaskDetails withCloudServiceName(String cloudServiceName) {
        this.cloudServiceName = cloudServiceName;
        return this;
    }

    /**
     * Get the subscription Id of the automation runbook account.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscription Id of the automation runbook account.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the AutomationRunbookTaskDetails object itself.
     */
    public AutomationRunbookTaskDetails withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the automation account name of the runbook.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the automation account name of the runbook.
     *
     * @param accountName the accountName value to set
     * @return the AutomationRunbookTaskDetails object itself.
     */
    public AutomationRunbookTaskDetails withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the runbook Id.
     *
     * @return the runbookId value
     */
    public String runbookId() {
        return this.runbookId;
    }

    /**
     * Set the runbook Id.
     *
     * @param runbookId the runbookId value to set
     * @return the AutomationRunbookTaskDetails object itself.
     */
    public AutomationRunbookTaskDetails withRunbookId(String runbookId) {
        this.runbookId = runbookId;
        return this;
    }

    /**
     * Get the runbook name.
     *
     * @return the runbookName value
     */
    public String runbookName() {
        return this.runbookName;
    }

    /**
     * Set the runbook name.
     *
     * @param runbookName the runbookName value to set
     * @return the AutomationRunbookTaskDetails object itself.
     */
    public AutomationRunbookTaskDetails withRunbookName(String runbookName) {
        this.runbookName = runbookName;
        return this;
    }

    /**
     * Get the job Id of the runbook execution.
     *
     * @return the jobId value
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set the job Id of the runbook execution.
     *
     * @param jobId the jobId value to set
     * @return the AutomationRunbookTaskDetails object itself.
     */
    public AutomationRunbookTaskDetails withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the execution output of the runbook.
     *
     * @return the jobOutput value
     */
    public String jobOutput() {
        return this.jobOutput;
    }

    /**
     * Set the execution output of the runbook.
     *
     * @param jobOutput the jobOutput value to set
     * @return the AutomationRunbookTaskDetails object itself.
     */
    public AutomationRunbookTaskDetails withJobOutput(String jobOutput) {
        this.jobOutput = jobOutput;
        return this;
    }

    /**
     * Get a value indicating whether it is a primary side script or not.
     *
     * @return the isPrimarySideScript value
     */
    public Boolean isPrimarySideScript() {
        return this.isPrimarySideScript;
    }

    /**
     * Set a value indicating whether it is a primary side script or not.
     *
     * @param isPrimarySideScript the isPrimarySideScript value to set
     * @return the AutomationRunbookTaskDetails object itself.
     */
    public AutomationRunbookTaskDetails withIsPrimarySideScript(Boolean isPrimarySideScript) {
        this.isPrimarySideScript = isPrimarySideScript;
        return this;
    }

}
