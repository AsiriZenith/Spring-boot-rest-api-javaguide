package net.javaguides.springboot.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Employees;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employees saveEmployee(Employees employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employees> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
