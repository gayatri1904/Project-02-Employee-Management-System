package com.employee.jsp.controller;

import com.employee.jsp.dao.JavaEmployeeDao;
import com.employee.jsp.dto.JavaEmployee;

public class JavaEmployee_controller {
	public static void main(String[] args) {
		JavaEmployee e1 = new JavaEmployee();
		e1.setEmpid(106);
		e1.setEmpname("gayatri");
		e1.setDept("seles");
		e1.setSall(600000);

		JavaEmployeeDao emp = new JavaEmployeeDao();

		JavaEmployee javaEmployee = emp.insertEmployee(e1);
		if (javaEmployee != null) {
			System.out.println("data updated");
		} else
			System.out.println("data not updated");

	}
}
