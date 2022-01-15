# Cloudbeds Test v2

## Server Setup

Build and run locally:
* compile and build: `./gradlew clean build`
* start server: `./gradlew server:bootRun`

Verify server is running:
* in browser visit: `http://localhost:8080/`
* test grcp: `grpcurl --plaintext -d '{"name": "test"}' localhost:9090 net.devh.boot.grpc.example.MyService/SayHello`

Code Coverage Report: `build/reports/jacoco/test/html/index.html`



## Work To Do

* [ ] 3 subproject gradle structure
    * [X] lib (proto)
    * [X] server
    * [ ] client
* [X] working grpc example server
* [ ] define data models/entities/repo
* [ ] create rest interface:
    * [ ] create users
    * [ ] get users by country
* [ ] real grcp service:
    * [ ] get user info
* [ ] client behavior TBD
* [ ] unit tests for server classes

