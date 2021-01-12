package com.sbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class MarkoController {
	
	@GetMapping("/")
	public String home() {
		return "home";
		//return "Cao breeeeeeeee";
	}
	
	@RequestMapping("/marko")
	public String prikaziHome() {
		return "home";
		//return "Cao breeeeeeeee";
	}

}
