package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Long>{

}
