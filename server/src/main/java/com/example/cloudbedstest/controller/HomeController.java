package com.example.cloudbedstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getHome() {
		return "Cloudbeds Test is running successfully.";
	}
}
