package com.example.gittest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController2 {

	@GetMapping
	public String home() {
		return "hello-world3";
	}

}
