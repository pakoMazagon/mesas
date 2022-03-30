

# ErrorResponseErrorRDTO

Payload estandard de ECI segun gobierno de API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | Describe la causa del error. Las descripciones se deberán componer de textos fijos para cada tipo de error producido, por lo que deben ser generadas a partir de una estructura de datos como un enumerado. | 
**requestId** | **String** | Describe un código de petición único. Esto permite disponer de trazabilidad en caso de necesitar inspeccionar logs. | 
**details** | **String** | Contiene un objeto con el detalle adicional de errores que desee aportar cada product owner del aplicativo sobre el que se desarrolla el servicio REST y que debe ser definido por este. Puede contener arrays con mayor detalle. |  [optional]
**code** | **Integer** | Respuesta proporcionada por las aplicaciones en caso de error. Dicho valor será utilizado como Código de Error de Aplicación, siendo su empleo opcional y de libre uso por parte de los responsables de las aplicaciones para gestionar sus propios códigos de retorno ante errores, aunque en caso de utilizarse, es obligatorio documentar apropiadamente el significado de cada uno de los posibles valores devueltos en dicho atributo, pudiendo documentarse en el propio fichero OpenAPI o pudiendo ser documentado apropiadamente (subiendo documentación adicional al API con los posibles códigos de error o un enlace a dicha documentación a un enlace externo) para que sea fácilmente accesible en caso de precisarse consultar. |  [optional]



