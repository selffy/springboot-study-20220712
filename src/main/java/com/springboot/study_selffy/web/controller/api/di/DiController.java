package com.springboot.study_selffy.web.controller.api.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/di")
public class DiController {

	@Autowired //객체를 스프링프레임워크에서 자동으로 주입
	@Qualifier("t1")
	private TestInterface testInterface1;

	@Autowired //객체를 스프링프레임워크에서 자동으로 주입
	@Qualifier("t2")
	private TestInterface testInterface2;
	
	@GetMapping("/test1")
	public ResponseEntity<?> test1() {
		testInterface1.a();
		testInterface2.b();
		
		testInterface2.a();
		testInterface2.b();
		return ResponseEntity.ok().body(null);
	}
}
