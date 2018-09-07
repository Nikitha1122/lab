package com.cg.employee.service;

import java.util.Collection;

import com.cg.employee.bean.Employee;

public interface EmployeeService {
	int addEmployee(Employee emp);
	Collection<Employee> getEmployeeByInsurance(String insurance);
	boolean deleteEmployee(int id);

}
