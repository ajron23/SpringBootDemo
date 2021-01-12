package com.sbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
@Controller
public class MarkoController {
	
	@GetMapping("/")
	public String home() {
		return "home";
		//return "Cao breeeeeeeee";
	}

}
