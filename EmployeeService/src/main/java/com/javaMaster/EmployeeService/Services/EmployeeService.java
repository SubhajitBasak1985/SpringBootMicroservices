package com.javaMaster.EmployeeService.Services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaMaster.EmployeeService.Entities.Employee;
import com.javaMaster.EmployeeService.Repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
		
	}
	
	public Employee addEmployee(Employee employee)
	{
		return this.employeeRepository.save(employee);		
	}
	
	public Employee getEmployee(Long employeeId)
	{
		Optional<Employee> optionalEmpVal = this.employeeRepository.findById(employeeId);
		return optionalEmpVal.orElse(null);		
	}
	
	public Employee updateEmployee(Employee employee, long empId)
	{
		Employee existingEmployee = this.getEmployee(empId);
		if(existingEmployee == null)
		{
			return null;
		}
		else
		{
			existingEmployee.setFirstname(employee.getFirstname());
			existingEmployee.setLastname(employee.getLastname());
			existingEmployee.setCity(employee.getCity());
			existingEmployee.setCountry(employee.getCountry());
			
		}
		return this.employeeRepository.save(existingEmployee);		
	}
	
	public void deleteEmployee(Long employeeId)
	{
		this.employeeRepository.deleteById(employeeId);
	}

}
