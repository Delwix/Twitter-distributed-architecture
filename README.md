# Twitter-distributed-architecture

### Eureka Dashboard
Localhost:8761
### How to monitor microservices via Hystrix Dashboard
1. Find the Gateway address using the Eureka Dashboard.
1. Find Hystrix address via Eureka, and go to that address followed by **/hystrix**
1. Fill the input field with the gateway address, followed by **actuator/hystrix.stream**
1. Click on monitor stream
