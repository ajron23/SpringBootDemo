package com.sbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkoRestController {
	
	@GetMapping("/markorest")
	public String rest() {
		return "A ovo radi?!?!?!??!?";
	}

}
