package com.prajesh.example.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAppController {

	@GetMapping("/demo")
	public String getStatus() {
		return "Welcome to the demo application";
	}
}
