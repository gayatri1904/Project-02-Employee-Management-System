package com.employee.jsp.controller;

import java.sql.ResultSet;

import com.employee.jsp.dao.JavaEmployeeDao;

public class Delete {
	public static void main(String[] args) {
		JavaEmployeeDao javaEmployeeDao=new JavaEmployeeDao();
	boolean abc=javaEmployeeDao.deleteEmployee(101);
	if(abc==true) {
		System.out.println("record deletd");
	}else
		System.out.println("record not found");
	
	
	}

}
