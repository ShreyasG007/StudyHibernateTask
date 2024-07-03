package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {
	public void getEmployees() {
		EmployeeDao dao = new EmployeeDao();
		dao.getEmployees();
	}

	public String insertEmployee(Employee employee) {
		EmployeeDao dao = new EmployeeDao();
		dao.insertEmployee(employee);
		
		if(true) {
			return "Employee Inserted Sucessfully";
		}
		else {
			return "Employee not inserted";
		}
		
	}

	public String deleteEmployee(Employee e) {
		EmployeeDao dao = new EmployeeDao();
		dao.deleteEmployee(e);
		
		if(true) {
			return "Employee deleted Success";
		}
		else {
			return  "Employee not deleted";
		}
		
	}

	public void employeeByProfile(Employee e) {
		EmployeeDao dao = new EmployeeDao();
		dao.employeeByProfile(e);
		
		
	}

	public void getMaxSalary() {
		EmployeeDao dao = new EmployeeDao();
		dao.getMaxSalary();
	}

	public void getMinSalary() {
		EmployeeDao dao = new EmployeeDao();
		dao.getMinSalary();
		
	}

	public void getEmployeeSalaryLessThanTwentyK() {
		EmployeeDao dao = new EmployeeDao();
		dao.getEmployeeSalaryLessThanTwentyK();
		
	}
}
