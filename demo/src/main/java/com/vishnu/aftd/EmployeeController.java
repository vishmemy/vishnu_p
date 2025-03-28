package com.vishnu.aftd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vishnu.aftd.EmployeeServiceImpl;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/employees")
public class EmployeeController{
	
	@Autowired
	private EmployeeServiceImpl employeeService;
		
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee e) {
		return employeeService.addEmployee(e);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee e) {
		return employeeService.updateEmployee(e);
	}
	
	@DeleteMapping("/delete")
	public void DeleteEmployee(@RequestBody Employee e) {
		employeeService.deleteEmployee(e);
	}

}
