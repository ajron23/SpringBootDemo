package com.sbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarkoController {
	
	@GetMapping("/")
	public String home() {
		//return "home.jsp";
		return "Cao breeeeeeeee";
	}

}
