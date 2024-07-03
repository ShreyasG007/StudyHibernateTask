package com.frontend;

import com.controller.EmployeeController;
import com.entity.Employee;

public class AddEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee(7, "Shreeraj", "dev", "shreeraj@gmail.com",50000, 27, 5, "pune");
		
		EmployeeController controller = new EmployeeController();
		String msg = controller.insertEmployee(employee);
		System.out.println(msg);
	}

}
