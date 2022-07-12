package com.springboot.study_selffy.web.controller;

import org.springframework.stereotype.Controller; //spring framwork에서만 쓸 수 있음
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MethodStudyController {

	@GetMapping({"/", "/index"})
	public String getMethod() {
		return "method/get";
	}
	
	@GetMapping("/test")
	public String getMetod() {
		return "method/test";
	}
}
