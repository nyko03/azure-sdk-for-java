// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.BastionHostInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BastionHostsClient. */
public interface BastionHostsClient
    extends InnerSupportsGet<BastionHostInner>, InnerSupportsListing<BastionHostInner>, InnerSupportsDelete<Void> {
    /**
     * Deletes the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String bastionHostname);

    /**
     * Deletes the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String bastionHostname);

    /**
     * Deletes the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String bastionHostname);

    /**
     * Deletes the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String bastionHostname, Context context);

    /**
     * Deletes the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String bastionHostname);

    /**
     * Deletes the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String bastionHostname);

    /**
     * Deletes the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String bastionHostname, Context context);

    /**
     * Gets the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Bastion Host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<BastionHostInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String bastionHostname);

    /**
     * Gets the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Bastion Host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BastionHostInner> getByResourceGroupAsync(String resourceGroupName, String bastionHostname);

    /**
     * Gets the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Bastion Host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BastionHostInner getByResourceGroup(String resourceGroupName, String bastionHostname);

    /**
     * Gets the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Bastion Host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BastionHostInner> getByResourceGroupWithResponse(
        String resourceGroupName, String bastionHostname, Context context);

    /**
     * Creates or updates the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param parameters Bastion Host resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bastion Host resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String bastionHostname, BastionHostInner parameters);

    /**
     * Creates or updates the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param parameters Bastion Host resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bastion Host resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<BastionHostInner>, BastionHostInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String bastionHostname, BastionHostInner parameters);

    /**
     * Creates or updates the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param parameters Bastion Host resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bastion Host resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BastionHostInner>, BastionHostInner> beginCreateOrUpdate(
        String resourceGroupName, String bastionHostname, BastionHostInner parameters);

    /**
     * Creates or updates the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param parameters Bastion Host resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bastion Host resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BastionHostInner>, BastionHostInner> beginCreateOrUpdate(
        String resourceGroupName, String bastionHostname, BastionHostInner parameters, Context context);

    /**
     * Creates or updates the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param parameters Bastion Host resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bastion Host resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BastionHostInner> createOrUpdateAsync(
        String resourceGroupName, String bastionHostname, BastionHostInner parameters);

    /**
     * Creates or updates the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param parameters Bastion Host resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bastion Host resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BastionHostInner createOrUpdate(String resourceGroupName, String bastionHostname, BastionHostInner parameters);

    /**
     * Creates or updates the specified Bastion Host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param parameters Bastion Host resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bastion Host resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BastionHostInner createOrUpdate(
        String resourceGroupName, String bastionHostname, BastionHostInner parameters, Context context);

    /**
     * Lists all Bastion Hosts in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListBastionHosts API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<BastionHostInner> listAsync();

    /**
     * Lists all Bastion Hosts in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListBastionHosts API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionHostInner> list();

    /**
     * Lists all Bastion Hosts in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListBastionHosts API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionHostInner> list(Context context);

    /**
     * Lists all Bastion Hosts in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListBastionHosts API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<BastionHostInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all Bastion Hosts in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListBastionHosts API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionHostInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Bastion Hosts in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListBastionHosts API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionHostInner> listByResourceGroup(String resourceGroupName, Context context);
}
