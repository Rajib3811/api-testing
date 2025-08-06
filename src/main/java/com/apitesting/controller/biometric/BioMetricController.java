package com.apitesting.controller.biometric;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BioMetricController {
	
	
	@GetMapping("/hello-world")
	@ResponseBody
	public String helloWorld() {
		return "<h1 style=\"color: blue\" >Hello World!</h1>";
	}

}
