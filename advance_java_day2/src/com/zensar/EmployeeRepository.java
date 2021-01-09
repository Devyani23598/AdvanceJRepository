package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.zensar.bean.Employee;
import com.zensar.utility.DBUtil;

public class EmployeeRepository {
	
	public void addEmployee(Employee employee) {
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="insert into employee values(?,?,?,?,?)";
		try {
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,employee.getEmployeeId());
		pst.setString(2,employee.getEmployeeName());
		pst.setString(3,employee.getDesignation());
		pst.setInt(4,employee.getSalary());
		pst.setString(5,employee.getGender());
		int result=pst.executeUpdate();
		if(result==0) {
			System.out.println("Database operation failed");
		}else {
			System.out.println("Database operation successful");
		}
		}catch(Exception e) {
			System.out.println("Exception occoured!"+e);
		}
		
	}

	
	public List<Employee> getAllEmployees(){
		List<Employee> listOfAllEmployees = new ArrayList<Employee>();
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="select * from employee";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				int employeeId = rs.getInt("employee_id");
				String employeeName = rs.getString("employee_name");
				String designation = rs.getString("designation");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");
				Employee employee = new Employee(employeeId, employeeName, designation, salary, gender);
				listOfAllEmployees.add(employee);
		}
		}catch(Exception e) {
			System.out.println("Exception!!"+e);
		}
		
		return listOfAllEmployees;
		}

	}

