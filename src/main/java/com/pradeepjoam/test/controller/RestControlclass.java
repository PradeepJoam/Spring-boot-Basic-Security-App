package com.pradeepjoam.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RestControlclass {

	@GetMapping("/info")
	public String infoData() {
		return "Security data";
	}
}
