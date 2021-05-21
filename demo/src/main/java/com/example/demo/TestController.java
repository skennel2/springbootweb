package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.argumentresolver.ArgumentModel;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/argumentResolverTest/{value}")
	public String argumentResolverTest(@PathVariable(required = true, name = "value") String pathValue, ArgumentModel model) {
		return "client ip: ".concat(model.getClientIp());
	}
}
