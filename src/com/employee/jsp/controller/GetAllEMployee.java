package com.employee.jsp.controller;

import com.employee.jsp.dao.JavaEmployeeDao;

public class GetAllEMployee {

	public static void main(String[] args) {
		JavaEmployeeDao javaEmployeeDao=new JavaEmployeeDao();
		javaEmployeeDao.getAllEmployee();

	}

}
