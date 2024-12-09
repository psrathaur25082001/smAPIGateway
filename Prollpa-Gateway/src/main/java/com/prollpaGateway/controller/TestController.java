package com.prollpaGateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	@GetMapping("/test2")
	public ResponseEntity<String> testApiGateway(){
		return ResponseEntity.ok("Api Gateway running fine");
	}

}
