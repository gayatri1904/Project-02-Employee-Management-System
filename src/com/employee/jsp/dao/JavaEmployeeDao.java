package com.employee.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.employee.jsp.dto.JavaEmployee;

import com.student.jsp.util.HelperClass;

public class JavaEmployeeDao {
	HelperClass helperClass = new HelperClass();

	public JavaEmployee insertEmployee(JavaEmployee javaEmployee) {

		Connection connection = helperClass.getConnection();
		String sql = "insert into javaemployee values(?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, javaEmployee.getId());
			preparedStatement.setString(2, javaEmployee.getEmpname());
			preparedStatement.setString(3, javaEmployee.getDept());
			preparedStatement.setDouble(4, javaEmployee.getSall());

			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return javaEmployee;
	}

	public boolean deleteEmployee(int id) {
		Connection connection = helperClass.getConnection();
		String sql = "delete from javaemployee where empid=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;

	}

	public JavaEmployee updateEmployee(JavaEmployee javaEmployee) {

		Connection connection = helperClass.getConnection();
		String sql = "update javaemployee set empname=?, dept=?,sall=? where empid=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(4, javaEmployee.getEmpid());
			preparedStatement.setString(1, javaEmployee.getEmpname());
			preparedStatement.setString(2, javaEmployee.getDept());
			preparedStatement.setDouble(3, javaEmployee.getSall());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				System.out.println("record updated");
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return javaEmployee;
	}

	public void getAllEmployee() {

		Connection connection = helperClass.getConnection();
		String sql = "select * from javaEmployee";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void getByIdEmployee(int id) {

		Connection connection = helperClass.getConnection();
		String sql = "select * from javaEmployee where empid=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
