package com.employee.jsp.controller;

import com.employee.jsp.dao.JavaEmployeeDao;

public class GetByIdEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEmployeeDao javaEmployeeDao=new JavaEmployeeDao();
		javaEmployeeDao.getByIdEmployee(103);
	}

}
