package com.example.cloudbedstest;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Routes extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		restConfiguration()
			.port(8090)
			.component("jetty")
			.contextPath("/api");

		rest("/")
			.produces("text/html")
			.get()
			.route()
			.routeId("home")
			.log("camel home page access")
			.transform(constant("<html><body>Cloudbeds Test Camel API</body></html>"))
			.log("done");

		//from("avro:http:localhost:8095?protocolClassName=org.apache.camel.avro.generated.KeyValueProtocol")

	}
}
