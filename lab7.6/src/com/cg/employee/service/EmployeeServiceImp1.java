package com.cg.employee.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import com.cg.employee.bean.Employee;
import com.cg.employee.db.EmployeeDB;



public class EmployeeServiceImp1 implements EmployeeService {
	HashMap<Integer,Employee> empData=
			EmployeeDB.getEmployeeMap();

	@Override
	public int addEmployee(Employee emp) {
		double sal=emp.getSalary();
		String desig=emp.getDesignation();
		
		if((sal>5000 && sal<20000) && desig.equals("System Associate") ){
			emp.setInsuranceScheme("Scheme C");
		}
		else if((sal>=20000 && sal<40000) && desig.equals("Programmer")) {
			emp.setInsuranceScheme("Scheme B");
		}
		else if((sal>=40000 && desig.equals("Manager"))) {
			emp.setInsuranceScheme("Scheme A");
		}
		else if(sal<5000 && desig.equals("Clerk")) {
			emp.setInsuranceScheme("No Scheme");
		}
		empData.put(emp.getId(), emp);
		return emp.getId();
	}

	@Override
	public Collection<Employee> getEmployeeByInsurance(String insurance) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
		for (Employee emp : empData.values()) {
			if(emp.getInsuranceScheme().equals(insurance)) {
				employees.add(emp);
			}
		}
		return employees;
	}
	
	

	@Override
	public boolean deleteEmployee(int id) {
		Employee emp=empData.remove(id);
		if(emp!=null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
