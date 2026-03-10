## Spring Boot Actuator Testing

The application exposes Spring Boot Actuator endpoints for health monitoring.

### Base URL
http://localhost:9090/actuator

### Health Endpoints

1. Application Health
GET http://localhost:9090/actuator/health

2. Liveness Check
GET http://localhost:9090/actuator/health/liveness

3. Readiness Check
GET http://localhost:9090/actuator/health/readiness

4. Beans Information  
GET http://localhost:9090/actuator/beans

5. Request Mappings  
GET http://localhost:9090/actuator/mappings

6. Application Loggers  
GET http://localhost:9090/actuator/loggers

7. Thread Dump  
GET http://localhost:9090/actuator/threaddump

8. Application Metrics  
GET http://localhost:9090/actuator/metrics

9. System CPU Count  
GET http://localhost:9090/actuator/metrics/system.cpu.count

10. Shutdown Application  
POST http://localhost:9090/actuator/shutdown

### How to Test
Use Postman or Browser and send a GET request to the above URLs.
Use POST request to shutdown the server.

Example Response:
{
    "message": "Shutting down, bye..."
}
