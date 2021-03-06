package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Employees;
import net.javaguides.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping("/employees")
	public ResponseEntity<Employees> saveEmployee(@RequestBody Employees employee) {
		return new ResponseEntity<Employees>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	@GetMapping("/employees")
	public List<Employees> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
