# openapi-java-client

ms-productos

- API version: 0.0.1

- Build date: 2022-03-15T13:44:13.089166500+01:00[Europe/Paris]

Microservice for products in bar


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:0.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-0.0.1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import rest.elchoco.mesas.openAPI.client.*;
import rest.elchoco.mesas.openAPI.client.auth.*;
import rest.elchoco.mesas.openAPI.dto.products.*;
import rest.elchoco.mesas.openAPI.api.ProductApi;

public class ProductApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProductApi* | [**addProduct**](docs/ProductApi.md#addProduct) | **POST** /products | Add a new product
*ProductApi* | [**findAllProducts**](docs/ProductApi.md#findAllProducts) | **GET** /products | Find all products
*ProductApi* | [**findAllProductsByPlace**](docs/ProductApi.md#findAllProductsByPlace) | **GET** /products/byPlace/{terraceOrSalon} | Find all products by place
*ProductApi* | [**findAllProductsByPlaceAndFamilyCode**](docs/ProductApi.md#findAllProductsByPlaceAndFamilyCode) | **GET** /products/byPlaceAndFamilyCode/{terraceOrSalon}/{familyCode} | Find all products by place and family
*ProductApi* | [**findProductsByFamily**](docs/ProductApi.md#findProductsByFamily) | **GET** /products/byFamily/{familyCode} | Find products by familyCode
*ProductApi* | [**findProductsByName**](docs/ProductApi.md#findProductsByName) | **GET** /products/byName/{name} | Find product by name
*ProductApi* | [**findProductsByPlaceAndName**](docs/ProductApi.md#findProductsByPlaceAndName) | **GET** /products/byPlaceAndName/{terraceOrSalon}/{name} | Find product by name and place
*ProductApi* | [**productsByNameNameDelete**](docs/ProductApi.md#productsByNameNameDelete) | **DELETE** /products/byName/{name} | Delete product by name
*ProductApi* | [**updateProduct**](docs/ProductApi.md#updateProduct) | **PUT** /products | Update or create an existing product


## Documentation for Models

 - [ErrorResponseErrorRDTO](docs/ErrorResponseErrorRDTO.md)
 - [ErrorResponseRDTO](docs/ErrorResponseRDTO.md)
 - [FamilyRDTO](docs/FamilyRDTO.md)
 - [ParametersRDTO](docs/ParametersRDTO.md)
 - [ProductCreateRDTO](docs/ProductCreateRDTO.md)
 - [ProductPlaceRDTO](docs/ProductPlaceRDTO.md)
 - [ScaleRDTO](docs/ScaleRDTO.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### x-jwt-assertion


- **Type**: API key
- **API key parameter name**: x-jwt-assertion
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



