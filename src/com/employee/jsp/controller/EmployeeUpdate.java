package com.employee.jsp.controller;

import com.employee.jsp.dao.JavaEmployeeDao;
import com.employee.jsp.dto.JavaEmployee;

public class EmployeeUpdate {
	public static void main(String[] args) {
		JavaEmployee javaEmployee1 = new JavaEmployee();

		javaEmployee1.setEmpid(102);
		javaEmployee1.setEmpname("anurag");
		javaEmployee1.setDept("markesting");
		javaEmployee1.setSall(890000);

		JavaEmployeeDao studentDao = new JavaEmployeeDao();
		JavaEmployee javaEmployee = studentDao.updateEmployee(javaEmployee1);
		if (javaEmployee != null) {
			System.out.println("record updated");
		} else
			System.out.println("recorrd not updated");

	}
}
