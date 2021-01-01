package com.cos.blog2.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPControllerTest {

	@GetMapping("/temp/jsp")
	public String homeJSP() {
		return "test";
	}
}
