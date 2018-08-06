/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Suppressions.
 */
public class SuppressionsInner {
    /** The Retrofit service to perform REST calls. */
    private SuppressionsService service;
    /** The service client containing this operation class. */
    private AdvisorManagementClientImpl client;

    /**
     * Initializes an instance of SuppressionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SuppressionsInner(Retrofit retrofit, AdvisorManagementClientImpl client) {
        this.service = retrofit.create(SuppressionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Suppressions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SuppressionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.advisor.v2016_07_12_preview.Suppressions get" })
        @GET("{resourceUri}/providers/Microsoft.Advisor/recommendations/{recommendationId}/suppressions/{name}")
        Observable<Response<ResponseBody>> get(@Path("resourceUri") String resourceUri, @Path("recommendationId") String recommendationId, @Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.advisor.v2016_07_12_preview.Suppressions create" })
        @PUT("{resourceUri}/providers/Microsoft.Advisor/recommendations/{recommendationId}/suppressions/{name}")
        Observable<Response<ResponseBody>> create(@Path("resourceUri") String resourceUri, @Path("recommendationId") String recommendationId, @Path("name") String name, @Body SuppressionContractInner suppressionContract, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.advisor.v2016_07_12_preview.Suppressions delete" })
        @HTTP(path = "{resourceUri}/providers/Microsoft.Advisor/recommendations/{recommendationId}/suppressions/{name}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceUri") String resourceUri, @Path("recommendationId") String recommendationId, @Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.advisor.v2016_07_12_preview.Suppressions list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Advisor/suppressions")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Obtains the details of a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SuppressionContractInner object if successful.
     */
    public SuppressionContractInner get(String resourceUri, String recommendationId, String name) {
        return getWithServiceResponseAsync(resourceUri, recommendationId, name).toBlocking().single().body();
    }

    /**
     * Obtains the details of a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SuppressionContractInner> getAsync(String resourceUri, String recommendationId, String name, final ServiceCallback<SuppressionContractInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceUri, recommendationId, name), serviceCallback);
    }

    /**
     * Obtains the details of a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SuppressionContractInner object
     */
    public Observable<SuppressionContractInner> getAsync(String resourceUri, String recommendationId, String name) {
        return getWithServiceResponseAsync(resourceUri, recommendationId, name).map(new Func1<ServiceResponse<SuppressionContractInner>, SuppressionContractInner>() {
            @Override
            public SuppressionContractInner call(ServiceResponse<SuppressionContractInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Obtains the details of a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SuppressionContractInner object
     */
    public Observable<ServiceResponse<SuppressionContractInner>> getWithServiceResponseAsync(String resourceUri, String recommendationId, String name) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (recommendationId == null) {
            throw new IllegalArgumentException("Parameter recommendationId is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceUri, recommendationId, name, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SuppressionContractInner>>>() {
                @Override
                public Observable<ServiceResponse<SuppressionContractInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SuppressionContractInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SuppressionContractInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SuppressionContractInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SuppressionContractInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Enables the snoozed or dismissed attribute of a recommendation. The snoozed or dismissed attribute is referred to as a suppression. Use this API to create or update the snoozed or dismissed status of a recommendation.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param suppressionContract The snoozed or dismissed attribute; for example, the snooze duration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SuppressionContractInner object if successful.
     */
    public SuppressionContractInner create(String resourceUri, String recommendationId, String name, SuppressionContractInner suppressionContract) {
        return createWithServiceResponseAsync(resourceUri, recommendationId, name, suppressionContract).toBlocking().single().body();
    }

    /**
     * Enables the snoozed or dismissed attribute of a recommendation. The snoozed or dismissed attribute is referred to as a suppression. Use this API to create or update the snoozed or dismissed status of a recommendation.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param suppressionContract The snoozed or dismissed attribute; for example, the snooze duration.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SuppressionContractInner> createAsync(String resourceUri, String recommendationId, String name, SuppressionContractInner suppressionContract, final ServiceCallback<SuppressionContractInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceUri, recommendationId, name, suppressionContract), serviceCallback);
    }

    /**
     * Enables the snoozed or dismissed attribute of a recommendation. The snoozed or dismissed attribute is referred to as a suppression. Use this API to create or update the snoozed or dismissed status of a recommendation.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param suppressionContract The snoozed or dismissed attribute; for example, the snooze duration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SuppressionContractInner object
     */
    public Observable<SuppressionContractInner> createAsync(String resourceUri, String recommendationId, String name, SuppressionContractInner suppressionContract) {
        return createWithServiceResponseAsync(resourceUri, recommendationId, name, suppressionContract).map(new Func1<ServiceResponse<SuppressionContractInner>, SuppressionContractInner>() {
            @Override
            public SuppressionContractInner call(ServiceResponse<SuppressionContractInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Enables the snoozed or dismissed attribute of a recommendation. The snoozed or dismissed attribute is referred to as a suppression. Use this API to create or update the snoozed or dismissed status of a recommendation.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param suppressionContract The snoozed or dismissed attribute; for example, the snooze duration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SuppressionContractInner object
     */
    public Observable<ServiceResponse<SuppressionContractInner>> createWithServiceResponseAsync(String resourceUri, String recommendationId, String name, SuppressionContractInner suppressionContract) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (recommendationId == null) {
            throw new IllegalArgumentException("Parameter recommendationId is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (suppressionContract == null) {
            throw new IllegalArgumentException("Parameter suppressionContract is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(suppressionContract);
        return service.create(resourceUri, recommendationId, name, suppressionContract, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SuppressionContractInner>>>() {
                @Override
                public Observable<ServiceResponse<SuppressionContractInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SuppressionContractInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SuppressionContractInner> createDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SuppressionContractInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SuppressionContractInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceUri, String recommendationId, String name) {
        deleteWithServiceResponseAsync(resourceUri, recommendationId, name).toBlocking().single().body();
    }

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceUri, String recommendationId, String name, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceUri, recommendationId, name), serviceCallback);
    }

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceUri, String recommendationId, String name) {
        return deleteWithServiceResponseAsync(resourceUri, recommendationId, name).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceUri, String recommendationId, String name) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (recommendationId == null) {
            throw new IllegalArgumentException("Parameter recommendationId is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceUri, recommendationId, name, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves the list of snoozed or dismissed suppressions for a subscription. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @return the PagedList<SuppressionContractInner> object if successful.
     */
    public PagedList<SuppressionContractInner> list() {
        PageImpl1<SuppressionContractInner> page = new PageImpl1<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<SuppressionContractInner>(page) {
            @Override
            public Page<SuppressionContractInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Retrieves the list of snoozed or dismissed suppressions for a subscription. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SuppressionContractInner>> listAsync(final ServiceCallback<List<SuppressionContractInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Retrieves the list of snoozed or dismissed suppressions for a subscription. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @return the observable to the List&lt;SuppressionContractInner&gt; object
     */
    public Observable<Page<SuppressionContractInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<SuppressionContractInner>>, Page<SuppressionContractInner>>() {
            @Override
            public Page<SuppressionContractInner> call(ServiceResponse<List<SuppressionContractInner>> response) {
                PageImpl1<SuppressionContractInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Retrieves the list of snoozed or dismissed suppressions for a subscription. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @return the observable to the List&lt;SuppressionContractInner&gt; object
     */
    public Observable<ServiceResponse<List<SuppressionContractInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<SuppressionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<SuppressionContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<SuppressionContractInner>> result = listDelegate(response);
                        List<SuppressionContractInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<SuppressionContractInner>> clientResponse = new ServiceResponse<List<SuppressionContractInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<SuppressionContractInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<SuppressionContractInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<SuppressionContractInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
