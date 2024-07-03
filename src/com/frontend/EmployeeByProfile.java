package com.frontend;

import com.controller.EmployeeController;
import com.entity.Employee;

public class EmployeeByProfile {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.setProfile("dev");
		
		EmployeeController controller  = new EmployeeController();
		controller.employeeByProfile(e);

	}

}
