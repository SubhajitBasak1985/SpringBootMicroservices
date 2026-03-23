package com.javaMaster.EmployeeServ.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public String DisplayWelcomeText()
	{
		return "Welcome to Employee Micro Service";
	}
	
	@GetMapping("/addTwoNumber")
	public int addTwoNumber(@RequestParam int a, @RequestParam int b)
	{
		return a+b;
	}
	
	@GetMapping("/multiplyTwoNumber")
	public int multiplyTwoNumber(@RequestParam int a, @RequestParam int b)
	{
		return a*b;
	}

}
