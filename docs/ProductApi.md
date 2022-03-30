# ProductApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](ProductApi.md#addProduct) | **POST** /products | Add a new product
[**findAllProducts**](ProductApi.md#findAllProducts) | **GET** /products | Find all products
[**findAllProductsByPlace**](ProductApi.md#findAllProductsByPlace) | **GET** /products/byPlace/{terraceOrSalon} | Find all products by place
[**findAllProductsByPlaceAndFamilyCode**](ProductApi.md#findAllProductsByPlaceAndFamilyCode) | **GET** /products/byPlaceAndFamilyCode/{terraceOrSalon}/{familyCode} | Find all products by place and family
[**findProductsByFamily**](ProductApi.md#findProductsByFamily) | **GET** /products/byFamily/{familyCode} | Find products by familyCode
[**findProductsByName**](ProductApi.md#findProductsByName) | **GET** /products/byName/{name} | Find product by name
[**findProductsByPlaceAndName**](ProductApi.md#findProductsByPlaceAndName) | **GET** /products/byPlaceAndName/{terraceOrSalon}/{name} | Find product by name and place
[**productsByNameNameDelete**](ProductApi.md#productsByNameNameDelete) | **DELETE** /products/byName/{name} | Delete product by name
[**updateProduct**](ProductApi.md#updateProduct) | **PUT** /products | Update or create an existing product



## addProduct

> ProductCreateRDTO addProduct(body)

Add a new product

### Example

```java
// Import classes:
import rest.elchoco.mesas.openAPI.client.ApiClient;
import rest.elchoco.mesas.openAPI.client.ApiException;
import rest.elchoco.mesas.openAPI.client.Configuration;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.client.models.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: x-jwt-assertion
        ApiKeyAuth x-jwt-assertion = (ApiKeyAuth) defaultClient.getAuthentication("x-jwt-assertion");
        x-jwt-assertion.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-jwt-assertion.setApiKeyPrefix("Token");

        ProductApi apiInstance = new ProductApi(defaultClient);
        ProductCreateRDTO body = new ProductCreateRDTO(); // ProductCreateRDTO | Product object that needs to be added
        try {
            ProductCreateRDTO result = apiInstance.addProduct(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#addProduct");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductCreateRDTO**](ProductCreateRDTO.md)| Product object that needs to be added |

### Return type

[**ProductCreateRDTO**](ProductCreateRDTO.md)

### Authorization

[x-jwt-assertion](../README.md#x-jwt-assertion)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Producto completo con todas propiedades |  -  |
| **400** | En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo |  -  |
| **500** | En caso de error general en el servidor |  -  |


## findAllProducts

> List&lt;ProductCreateRDTO&gt; findAllProducts()

Find all products

Find List of products

### Example

```java
// Import classes:
import rest.elchoco.mesas.openAPI.client.ApiClient;
import rest.elchoco.mesas.openAPI.client.ApiException;
import rest.elchoco.mesas.openAPI.client.Configuration;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.client.models.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: x-jwt-assertion
        ApiKeyAuth x-jwt-assertion = (ApiKeyAuth) defaultClient.getAuthentication("x-jwt-assertion");
        x-jwt-assertion.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-jwt-assertion.setApiKeyPrefix("Token");

        ProductApi apiInstance = new ProductApi(defaultClient);
        try {
            List<ProductCreateRDTO> result = apiInstance.findAllProducts();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#findAllProducts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;ProductCreateRDTO&gt;**](ProductCreateRDTO.md)

### Authorization

[x-jwt-assertion](../README.md#x-jwt-assertion)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Respuesta productCreate |  -  |
| **400** | En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo |  -  |
| **500** | En caso de error general en el servidor |  -  |


## findAllProductsByPlace

> List&lt;ProductPlaceRDTO&gt; findAllProductsByPlace(terraceOrSalon)

Find all products by place

t is terrace and s is salon

### Example

```java
// Import classes:
import rest.elchoco.mesas.openAPI.client.ApiClient;
import rest.elchoco.mesas.openAPI.client.ApiException;
import rest.elchoco.mesas.openAPI.client.Configuration;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.client.models.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: x-jwt-assertion
        ApiKeyAuth x-jwt-assertion = (ApiKeyAuth) defaultClient.getAuthentication("x-jwt-assertion");
        x-jwt-assertion.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-jwt-assertion.setApiKeyPrefix("Token");

        ProductApi apiInstance = new ProductApi(defaultClient);
        String terraceOrSalon = "terraceOrSalon_example"; // String | t is terrace and s is salon
        try {
            List<ProductPlaceRDTO> result = apiInstance.findAllProductsByPlace(terraceOrSalon);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#findAllProductsByPlace");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terraceOrSalon** | **String**| t is terrace and s is salon |

### Return type

[**List&lt;ProductPlaceRDTO&gt;**](ProductPlaceRDTO.md)

### Authorization

[x-jwt-assertion](../README.md#x-jwt-assertion)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Respuesta productPlace |  -  |
| **400** | En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo |  -  |
| **500** | En caso de error general en el servidor |  -  |


## findAllProductsByPlaceAndFamilyCode

> List&lt;ProductPlaceRDTO&gt; findAllProductsByPlaceAndFamilyCode(terraceOrSalon, familyCode)

Find all products by place and family

t is terrace and s is salon and familyCode

### Example

```java
// Import classes:
import rest.elchoco.mesas.openAPI.client.ApiClient;
import rest.elchoco.mesas.openAPI.client.ApiException;
import rest.elchoco.mesas.openAPI.client.Configuration;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.client.models.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: x-jwt-assertion
        ApiKeyAuth x-jwt-assertion = (ApiKeyAuth) defaultClient.getAuthentication("x-jwt-assertion");
        x-jwt-assertion.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-jwt-assertion.setApiKeyPrefix("Token");

        ProductApi apiInstance = new ProductApi(defaultClient);
        String terraceOrSalon = "terraceOrSalon_example"; // String | t is terrace and s is salon
        String familyCode = "familyCode_example"; // String | familyCode value that need to be considered for filter
        try {
            List<ProductPlaceRDTO> result = apiInstance.findAllProductsByPlaceAndFamilyCode(terraceOrSalon, familyCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#findAllProductsByPlaceAndFamilyCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terraceOrSalon** | **String**| t is terrace and s is salon |
 **familyCode** | **String**| familyCode value that need to be considered for filter |

### Return type

[**List&lt;ProductPlaceRDTO&gt;**](ProductPlaceRDTO.md)

### Authorization

[x-jwt-assertion](../README.md#x-jwt-assertion)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Respuesta productPlace |  -  |
| **400** | En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo |  -  |
| **500** | En caso de error general en el servidor |  -  |


## findProductsByFamily

> List&lt;ProductCreateRDTO&gt; findProductsByFamily(familyCode)

Find products by familyCode

Find products by familyCode

### Example

```java
// Import classes:
import rest.elchoco.mesas.openAPI.client.ApiClient;
import rest.elchoco.mesas.openAPI.client.ApiException;
import rest.elchoco.mesas.openAPI.client.Configuration;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.client.models.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: x-jwt-assertion
        ApiKeyAuth x-jwt-assertion = (ApiKeyAuth) defaultClient.getAuthentication("x-jwt-assertion");
        x-jwt-assertion.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-jwt-assertion.setApiKeyPrefix("Token");

        ProductApi apiInstance = new ProductApi(defaultClient);
        String familyCode = "familyCode_example"; // String | familyCode value that need to be considered for filter
        try {
            List<ProductCreateRDTO> result = apiInstance.findProductsByFamily(familyCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#findProductsByFamily");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **familyCode** | **String**| familyCode value that need to be considered for filter |

### Return type

[**List&lt;ProductCreateRDTO&gt;**](ProductCreateRDTO.md)

### Authorization

[x-jwt-assertion](../README.md#x-jwt-assertion)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Respuesta productCreate |  -  |
| **400** | En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo |  -  |
| **500** | En caso de error general en el servidor |  -  |


## findProductsByName

> List&lt;ProductCreateRDTO&gt; findProductsByName(name)

Find product by name

Find products by name

### Example

```java
// Import classes:
import rest.elchoco.mesas.openAPI.client.ApiClient;
import rest.elchoco.mesas.openAPI.client.ApiException;
import rest.elchoco.mesas.openAPI.client.Configuration;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.client.models.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: x-jwt-assertion
        ApiKeyAuth x-jwt-assertion = (ApiKeyAuth) defaultClient.getAuthentication("x-jwt-assertion");
        x-jwt-assertion.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-jwt-assertion.setApiKeyPrefix("Token");

        ProductApi apiInstance = new ProductApi(defaultClient);
        String name = "name_example"; // String | name value that need to be considered for filter
        try {
            List<ProductCreateRDTO> result = apiInstance.findProductsByName(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#findProductsByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name value that need to be considered for filter |

### Return type

[**List&lt;ProductCreateRDTO&gt;**](ProductCreateRDTO.md)

### Authorization

[x-jwt-assertion](../README.md#x-jwt-assertion)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Respuesta productCreate |  -  |
| **400** | En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo |  -  |
| **500** | En caso de error general en el servidor |  -  |


## findProductsByPlaceAndName

> List&lt;ProductPlaceRDTO&gt; findProductsByPlaceAndName(terraceOrSalon, name)

Find product by name and place

Find products by name and place

### Example

```java
// Import classes:
import rest.elchoco.mesas.openAPI.client.ApiClient;
import rest.elchoco.mesas.openAPI.client.ApiException;
import rest.elchoco.mesas.openAPI.client.Configuration;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.client.models.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: x-jwt-assertion
        ApiKeyAuth x-jwt-assertion = (ApiKeyAuth) defaultClient.getAuthentication("x-jwt-assertion");
        x-jwt-assertion.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-jwt-assertion.setApiKeyPrefix("Token");

        ProductApi apiInstance = new ProductApi(defaultClient);
        String terraceOrSalon = "terraceOrSalon_example"; // String | t is terrace and s is salon
        String name = "name_example"; // String | name value that need to be considered for filter
        try {
            List<ProductPlaceRDTO> result = apiInstance.findProductsByPlaceAndName(terraceOrSalon, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#findProductsByPlaceAndName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terraceOrSalon** | **String**| t is terrace and s is salon |
 **name** | **String**| name value that need to be considered for filter |

### Return type

[**List&lt;ProductPlaceRDTO&gt;**](ProductPlaceRDTO.md)

### Authorization

[x-jwt-assertion](../README.md#x-jwt-assertion)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Respuesta productPlace |  -  |
| **400** | En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo |  -  |
| **500** | En caso de error general en el servidor |  -  |


## productsByNameNameDelete

> productsByNameNameDelete(name)

Delete product by name

### Example

```java
// Import classes:
import rest.elchoco.mesas.openAPI.client.ApiClient;
import rest.elchoco.mesas.openAPI.client.ApiException;
import rest.elchoco.mesas.openAPI.client.Configuration;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.client.models.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: x-jwt-assertion
        ApiKeyAuth x-jwt-assertion = (ApiKeyAuth) defaultClient.getAuthentication("x-jwt-assertion");
        x-jwt-assertion.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-jwt-assertion.setApiKeyPrefix("Token");

        ProductApi apiInstance = new ProductApi(defaultClient);
        String name = "name_example"; // String | Product name to delete
        try {
            apiInstance.productsByNameNameDelete(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#productsByNameNameDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Product name to delete |

### Return type

null (empty response body)

### Authorization

[x-jwt-assertion](../README.md#x-jwt-assertion)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo |  -  |
| **500** | En caso de error general en el servidor |  -  |


## updateProduct

> ProductCreateRDTO updateProduct(body)

Update or create an existing product

### Example

```java
// Import classes:
import rest.elchoco.mesas.openAPI.client.ApiClient;
import rest.elchoco.mesas.openAPI.client.ApiException;
import rest.elchoco.mesas.openAPI.client.Configuration;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.client.models.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: x-jwt-assertion
        ApiKeyAuth x-jwt-assertion = (ApiKeyAuth) defaultClient.getAuthentication("x-jwt-assertion");
        x-jwt-assertion.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //x-jwt-assertion.setApiKeyPrefix("Token");

        ProductApi apiInstance = new ProductApi(defaultClient);
        ProductCreateRDTO body = new ProductCreateRDTO(); // ProductCreateRDTO | Product object that needs to be update
        try {
            ProductCreateRDTO result = apiInstance.updateProduct(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#updateProduct");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductCreateRDTO**](ProductCreateRDTO.md)| Product object that needs to be update |

### Return type

[**ProductCreateRDTO**](ProductCreateRDTO.md)

### Authorization

[x-jwt-assertion](../README.md#x-jwt-assertion)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Producto completo con todas propiedades |  -  |
| **400** | En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo |  -  |
| **500** | En caso de error general en el servidor |  -  |

