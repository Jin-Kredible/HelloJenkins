package com.bit2017.helloJenkins.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String HelloJenkins() {
		return "Hello Jenkins";
	}
	
}
