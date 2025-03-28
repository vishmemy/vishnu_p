package com.vishnu.aftd;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	@Transactional
	public Employee getEmployee(int id) {
		Optional<Employee> e1= employeeRepository.findById(id);
		return e1.get();
	}
	
	@Transactional
	public Employee addEmployee(Employee e1) {
		return employeeRepository.save(e1);
	}
	
	@Transactional
	public Employee updateEmployee(Employee e) {
	        Employee e1 = employeeRepository.findById(e.getId()).orElseThrow();
	        e1.setName(e.getName());
	        e1.setDepartment(e.getDepartment());
	        e1.setSalary(e.getSalary());
	        return employeeRepository.save(e1);
	}
	
	@Transactional
	public void deleteEmployee(Employee e) {
		employeeRepository.deleteById(e.getId());
	}
	
	

}
