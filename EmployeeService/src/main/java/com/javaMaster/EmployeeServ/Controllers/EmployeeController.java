package com.javaMaster.EmployeeServ.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaMaster.EmployeeServ.Entities.Employee;
import com.javaMaster.EmployeeServ.Services.EmployeeService;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
		
	}
	
	@PostMapping("/Add")
	public Employee addEmployee( @RequestBody Employee employee)
	{
		return this.employeeService.addEmployee(employee);
	}
	
	@GetMapping("/GetEmployee/{empId}")
	public Employee getEmployeeById(@PathVariable(name="empId") Long employeeId)
	{
		return this.employeeService.getEmployee(employeeId);
	}
	
	@PutMapping("/UpdateEmployee/{empId}")
	public Employee updateEmployee(@PathVariable(name="empId") Long employeeId, @RequestBody Employee employee)
	{
		return this.employeeService.updateEmployee(employee, employeeId);
	}
	
	@DeleteMapping("/DeleteEmployee/{empId}")
	public void addTwoNumber(@PathVariable(name="empId") Long employeeId)
	{
		this.employeeService.deleteEmployee(employeeId);
	}
	

}
