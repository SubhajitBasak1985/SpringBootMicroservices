package com.javaMaster.EmployeeService.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name ="id", nullable =false)
	private Long id;
	
	@Column(name ="firstname", nullable =false)
	private String firstname; 
	
	@Column(name ="lastname", nullable =false)
	private String lastname; 
	
	@Column(name ="city", nullable =false)
	private String city; 
	
	@Column(name ="country", nullable =false)
	private String country;

}
