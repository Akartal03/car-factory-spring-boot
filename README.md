# Car Factory

## Steps to Setup

**1. Clone the application**

```bash
https://github.com/Akartal03/car-factory-spring-boot.git
```

**2. Build and run the app using maven**

```bash
mvn package
java -jar target/CarFactory-0.0.1-SNAPSHOT.jar

```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/v1/car/{model}
    

## Rest API Examples

    GET http://localhost:8080/api/v1/car/sedan
    GET http://localhost:8080/api/v1/car/hatchback
    GET http://localhost:8080/api/v1/car/cabrio
    
