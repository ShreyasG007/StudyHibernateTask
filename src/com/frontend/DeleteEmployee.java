package com.frontend;

import com.controller.EmployeeController;
import com.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(5);

		EmployeeController controller = new EmployeeController();
		String msg = controller.deleteEmployee(e);

		System.out.println(msg);

	}

}
