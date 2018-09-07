package com.cg.eis.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.cg.eis.bean.Employee;

public class Service implements Iemplyeescheme {
	Employee emp1;
	
	public Employee getEmp1() {
		return emp1;
	}
	public void setEmp1(Employee emp1) {
		this.emp1 = emp1;
	}
	@Override
	public void insurancecheck(double salary, String designation) {
		// TODO Auto-generated method stub
		
		
		if(salary<20000)
		{
			switch (designation)
			{
			case "designationA":
				System.out.println("scheme is A");
				break;
			case "designationB":
				System.out.println("scheme is B");
				break;
			}
		}
		else if(salary>20000 && salary< 100000)
		{
			switch(designation)
			{
			case "designationC":
				System.out.println("scheme is C");
				break;
			case "designationD":
				System.out.println("scheme is D");
				break;
			}
		}
		else
		{
			switch(designation)
			{
			case "designationE":
				System.out.println("scheme is E");
				break;
			case "designationF":
				System.out.println("scheme is F");
				break;
			}
		}
		
	}
	public void Details()
	{
		System.out.println("Employee id         :"+emp1.getId());
		System.out.println("Employee name          :"+emp1.getName());
		System.out.println("Employee salary         :"+emp1.getSalary());
		System.out.println("Employee Designation     :"+emp1.getDesignation());
	}
	
	public void dataWrite() throws IOException
	{
		File file=new File("d:/lab9.3/employee.txt");
		FileOutputStream fos=new FileOutputStream(file);
		String sal="salary" +Double.toString(emp1.getSalary());
		String name="Name" +emp1.getName();
		String id="EmployeId" +emp1.getId();
		String des="Designation" + emp1.getDesignation();
		String ins="Insurance Scheme"+emp1.getInsurancescheme();
		
		fos.write(sal.getBytes());
		fos.write(name.getBytes());
		fos.write(id.getBytes());
		fos.write(des.getBytes());
		fos.write(ins.getBytes());
		
		System.out.println("data has been written");
		fos.close();
	}

}
