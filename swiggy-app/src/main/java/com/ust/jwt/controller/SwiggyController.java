package com.ust.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swiggy")
public class SwiggyController {

	@GetMapping
	public String getSwiggy() {
		return "Swiggy Service working";
	}
}