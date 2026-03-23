package com.javaMaster.EmployeeServ.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaMaster.EmployeeServ.Entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
