package com.cg.employee.pl;

import java.util.Collection;
import java.util.Scanner;

import com.cg.employee.bean.Employee;
import com.cg.employee.service.*;

public class Client {
	Scanner scan=new Scanner(System.in);
	EmployeeService empService=new EmployeeServiceImp1();
	public static void main(String[] args)
	{
		Client c=new Client();
		String opt=null;
		while(true)
		{
		System.out.println("1. add employee");
		System.out.println("2. view employee by insurancescheme");
		System.out.println("3. Delete employee");
		System.out.println("4. sort employee by salary");
		System.out.println("5. Exit");
		opt=c.scan.nextLine();
		switch(opt)
		{
		case "1":
			c.addEmployee();
			break;
		case "2":
			c.getEmployeeByInsurance();
			break;
		case "3":
			c.deleteEmployee();
			break;
		}
		}
	}

	private void addEmployee() {
		Employee emp=new Employee();
		System.out.println("Enter Employee Id");
		/*String empId=scan.nextLine();
		int id=Integer.parseInt(empId);
		emp.setId(id);*/
		emp.setId(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter Name");
		emp.setName(scan.nextLine());
		System.out.println("Enter Salary");
		emp.setSalary(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter Designation");
		emp.setDesignation(scan.nextLine());
		int empId=empService.addEmployee(emp);
		System.out.println("Employee with Id "+empId+" added to the database");
	}
	
	private void getEmployeeByInsurance() {
		System.out.println("Enter Insurance Scheme");
		String scheme=scan.nextLine();
		Collection<Employee> employees=
				empService.getEmployeeByInsurance(scheme);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}	

	private void deleteEmployee() {
		System.out.println("Enter Employee id");
		int id=Integer.parseInt(scan.nextLine());
		boolean result=empService.deleteEmployee(id);
		if(result) {
			System.out.println("Employee with id "+id+" successfully deleted");
		}
		else {
			System.out.println("Employee with Id "+id+" does not exist in the database");
		}
}
}
