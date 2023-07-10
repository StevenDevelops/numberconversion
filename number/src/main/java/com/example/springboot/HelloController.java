package com.example.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/toDecimal")
	@ResponseBody
	public String toDecimal(@RequestParam String binary) {
		return "result:" + convertToDecimal(binary);
	}

	public int convertToDecimal(String binary) {
		return Integer.parseInt(binary, 2);
	}

}
