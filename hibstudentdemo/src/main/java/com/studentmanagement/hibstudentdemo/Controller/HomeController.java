package com.studentmanagement.hibstudentdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
	public String homePage() {
		
		System.out.println("In Home Page.....");
		
		return "home";
	}
}
