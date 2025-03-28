package com.vishnu.aftd;

public interface EmployeeService {
	
	Employee getEmployee(int id);
	
	Employee addEmployee(Employee e);
	
	Employee updateEmployee(Employee e);
	
	void deleteEmployee(Employee e);
}
