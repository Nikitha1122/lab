package com.cg.eis.pl;

import java.io.IOException;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter salary");
		double salary=sc.nextInt();
		System.out.println("enter designation");
		String designation=sc.next();
	    
		
		
		try {
			if(salary<3000)
				throw new EmployeeException();
			else
			{
				Employee e=new Employee(id,name,salary,designation);
				Service s=new Service();
				s.setEmp1(e);
				s.insurancecheck(salary, designation);
				//s.Details();
				s.dataWrite();
			}
		} catch (EmployeeException e2) {
			// TODO: handle exception
			System.out.println(e2);
		}
		
		
		
		
		
		

	}

}
