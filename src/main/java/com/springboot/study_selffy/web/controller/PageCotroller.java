package com.springboot.study_selffy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageCotroller {

	@GetMapping({"/","index"})
	public String indexPage() {
		return "index";
	}
	
}
