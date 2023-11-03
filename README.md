# microservices-university
A project with microservices

Prueba de añadir School

![image](https://github.com/emanuelRiveraA/microservices-university/assets/64047865/15a138bb-1e80-4b8b-a9e7-d533f0691934)

Se guarda la escuela en la BD de postgres
![image](https://github.com/emanuelRiveraA/microservices-university/assets/64047865/c781e9aa-dd2d-4f5e-b9e2-0f5cccd1bc59)


Prueba de obtener schools

![image](https://github.com/emanuelRiveraA/microservices-university/assets/64047865/45e6892a-92db-4c5a-9a21-9df53afc68dd)

Student Service

Crear un nuevo estudiante
![image](https://github.com/emanuelRiveraA/microservices-university/assets/64047865/2b31844b-8b0c-44e5-a92d-322db77ce9fe)

Guardado de estudiante en BD mongodb atlas
![image](https://github.com/emanuelRiveraA/microservices-university/assets/64047865/9e634b4f-d47f-4892-81e0-978b541b82b4)

Obtener un estudiante por su ID
![image](https://github.com/emanuelRiveraA/microservices-university/assets/64047865/e6e2095c-3367-472f-9a17-d32303c0ac2e)

# Service Registry
The need for a service registry in a microservice architecture arises due to the following reasons:

1.Dynamic nature of microservices: Microservices can come and go dynamically, for example, due to scaling, upgrades, or failures. Service registry keeps track of this changing landscape and provides up-to-date information about the availability of each service.

2.Load balancing: Service registry provides information about the current load of each microservice instance and can be used by a load balancer to distribute requests to the least loaded instance.

3.Service discovery: Service registry helps microservices to discover each other and enables them to communicate with each other. This is important in a microservice architecture where services are decoupled and loosely coupled.

4.Monitoring and management: Service registry can also be used to monitor the health of microservices and provide an overview of the system status.

So the service registry is an essential component in a microservice architecture as it provides a centralized way to manage and coordinate the interactions between microservices.

# Eureka Server : This is a service registry server in the Netflix OSS (Open Source Software) suite
And it is used to provide service discovery for microservices in a distributed environment. Eureka Server provides a registry of available microservices, allowing client microservices to discover and communicate with each other.
