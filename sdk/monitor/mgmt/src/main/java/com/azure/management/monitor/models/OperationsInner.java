// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Operations. */
public final class OperationsInner {
    private final ClientLogger logger = new ClientLogger(OperationsInner.class);

    /** The proxy service used to perform REST calls. */
    private final OperationsService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationsInner(MonitorClientImpl client) {
        this.service =
            RestProxy.create(OperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientOperations to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientOperati")
    private interface OperationsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/microsoft.insights/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<OperationListResultInner>> list(
            @HostParam("$host") String host, @QueryParam("api-version") String apiVersion, Context context);
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<OperationListResultInner>> listWithResponseAsync() {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        return FluxUtil
            .withContext(context -> service.list(this.client.getHost(), apiVersion, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<OperationListResultInner>> listWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        return service.list(this.client.getHost(), apiVersion, context);
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OperationListResultInner> listAsync() {
        return listWithResponseAsync()
            .flatMap(
                (SimpleResponse<OperationListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists all of the available operations from Microsoft.Insights provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationListResultInner list() {
        return listAsync().block();
    }
}
