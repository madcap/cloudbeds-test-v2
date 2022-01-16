# Cloudbeds Test v2

## Server Setup

Build and run locally:
* compile and build: `./gradlew clean build`
* start server: `./gradlew server:bootRun`

Verify server is running:
* in browser visit: `http://localhost:8080/`
* test grcp: `grpcurl --plaintext -d '{"name": "test"}' localhost:9090 net.devh.boot.grpc.example.MyService/SayHello`

Code Coverage Report: `build/reports/jacoco/test/html/index.html`

## Usage Notes

* Backing database is in-memory only and non-permanent. At server stop the data will be lost.
* Database UI available at `http://localhost:8080/h2-console` with password `password`


## Work To Do

* [ ] 3 subproject gradle structure
    * [X] lib (proto/avro?)
    * [X] server
    * [ ] client
* [X] working grpc example server (protobuf not avro)
    * [ ] delete example code 
* [X] define data models/entities/repo
* [X] create rest interface:
    * [X] create users
    * [X] get users by country
* [ ] real grcp service:
    * [ ] using avro
    * [ ] get user info
* [ ] client behavior ???
* [ ] unit tests for server classes
* [ ] final cleanup

