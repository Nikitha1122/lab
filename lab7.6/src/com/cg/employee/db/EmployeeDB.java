package com.cg.employee.db;

import java.util.HashMap;

import com.cg.employee.bean.Employee;

public class EmployeeDB {
	private static HashMap<Integer,Employee> employeeMap=
			new HashMap<Integer,Employee>();

	public static HashMap<Integer, Employee> getEmployeeMap() {
		return employeeMap;
	
	}
}
