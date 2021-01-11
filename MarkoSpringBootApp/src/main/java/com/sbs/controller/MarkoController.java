package com.sbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkoController {
	
	@GetMapping("/")
	public String home() {
		//return "home.jsp";
		return "Cao breeeeeeeee";
	}

}
