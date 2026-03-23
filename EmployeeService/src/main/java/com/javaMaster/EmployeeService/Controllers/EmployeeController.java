package com.javaMaster.EmployeeService.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaMaster.EmployeeService.Entities.Employee;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@PostMapping("/Add")
	public Employee addEmployee( @RequestBody Employee employee)
	{
		return null;
	}
	
	@GetMapping("/GetEmployee/{empId}")
	public Employee getEmployeeById(@PathVariable Long employeeId)
	{
		return null;
	}
	
	@PutMapping("/UpdateEmployee/{empId}")
	public Employee updateEmployee(@PathVariable Long employeeId, Employee employee)
	{
		return null;
	}
	
	@DeleteMapping("/DeleteEmployee/{empId}")
	public void addTwoNumber(@PathVariable Long employeeId)
	{
		
	}
	

}
