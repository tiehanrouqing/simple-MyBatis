package com.zit.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringBoot {
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("indexStr", "Hello SpringBoot For Web!");
		return "hello";
	}

}
