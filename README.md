# Cloudbeds Test v2

## Server Setup

Build and run locally:
* compile and build: `./gradlew clean build`
* start server: `./gradlew server:bootRun`

Verify server is running:
* in browser visit: `http://localhost:8080/`
* test grcp server: `grpcurl --plaintext localhost:9090 list`

Code Coverage Report: `build/reports/jacoco/test/html/index.html`

## Server Database

* Backing database is in-memory only and non-permanent. At server stop the data will be lost.
* Database UI available at `http://localhost:8080/h2-console` with password `password`

## REST server

* server runs on localhost:8080

the following endpoints are implemented:

create user:
```
curl --location --request POST 'http://localhost:8080/user' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName":"firstName",
	"lastName":"lastName",
	"email":"email",
	"password":"password",
	"addressLine1":"addressLine1",
	"addressLine2":"addressLine2",
	"city":"city",
	"state":"state",
	"zip":"zip",
	"country":"country"
}'
```

get users by country:
```
curl --location --request GET 'http://localhost:8080/user/country/{country}'
```

## gRPC Server

* server runs on localhost:9090
* there is one service with one method implemented: `UserService/GetUsersByFirstName`
* implemented using protobuf not avro

Examples
```
grpcurl --plaintext localhost:9090 list
grpcurl --plaintext localhost:9090 list com.cloudbeds.user.UserService
grpcurl --plaintext -d '{"firstName": "James"}' localhost:9090 com.cloudbeds.user.UserService/GetUsersByFirstName
```

## Work To Do

* [ ] 3 subproject gradle structure
    * [X] lib (proto/avro?)
    * [X] server
    * [ ] client
* [X] working grpc example server (protobuf not avro) 
* [X] define data models/entities/repo
* [X] create rest interface:
    * [X] create users
    * [X] get users by country
* [ ] real grcp service:
    * [ ] using avro instead of protobuf
    * [X] "retrieve user info"
* [ ] client behavior ???
* [ ] final cleanup

