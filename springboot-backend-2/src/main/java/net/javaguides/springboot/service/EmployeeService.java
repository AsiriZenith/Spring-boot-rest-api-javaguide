package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Employees;

public interface EmployeeService {
	Employees saveEmployee(Employees employee);
	List<Employees> getAllEmployees();
}
