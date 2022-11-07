package com.puhu17.signupapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("registerform")
	public void register() {
		System.out.println("toform");	
	}
}
