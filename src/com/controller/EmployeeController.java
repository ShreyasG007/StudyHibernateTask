package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	public void getEmployees() {
		EmployeeService service = new EmployeeService();
		service.getEmployees();
	}

	public String insertEmployee(Employee employee) {
		EmployeeService service = new EmployeeService();
		return service.insertEmployee(employee);
		
	}

	public String deleteEmployee(Employee e) {
		EmployeeService service = new EmployeeService();
		return service.deleteEmployee(e);
		
	}

	public void employeeByProfile(Employee e) {
		EmployeeService service = new EmployeeService();
		service.employeeByProfile(e);
		
	}

	public void getMaxSalary() {
		EmployeeService service = new EmployeeService();
		service.getMaxSalary();
	}

	public void getMinSalary() {
		EmployeeService service = new EmployeeService();
		service.getMinSalary();
		
	}

	public void getEmployeeSalaryLessThanTwentyK() {
		EmployeeService service = new EmployeeService();
		service.getEmployeeSalaryLessThanTwentyK();
		
	}
}
