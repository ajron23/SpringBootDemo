package com.sbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
public class MarkoController {
	
	@GetMapping("/")
	public String home() {
		return "home";
		//return "Cao breeeeeeeee";
	}
	
	@RequestMapping("/marko")
	public ModelAndView prikaziHome() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
		//return "Cao breeeeeeeee";
	}

}
