COMPONENTS IN MICROSERVICES

→ ORDER MICROSERVICE - Order service, responsible for order related APIs(GET, PUT, POST and DELETE) and data such as order id, total price etc.
→ PRODUCT MICROSERVICE  - Product service, responsible for order related APIs(GET, PUT, POST and DELETE) and data such as product name, description, quantity, variant etc.
→ SERVICE REGISTRY -  Service registry is a hub which has details of all the services/ instances of services registered to it. Load balancing between services will be handled.
→ API-GATEWAY - All the public APIs are exposed via API gateway. Authorisation and authentication are handled here.
→ CONFIG SERVER - Used to store the common configurations and all services can retrieve configurations from here. Service specific configuration are provided.
→ ZIPKIN - Open-source distributed tracing system. Zipkin is used to trace the services of the spring cloud environments.
