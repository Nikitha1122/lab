package com.cg.booking.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.booking.bean.Request;
import com.cg.booking.exception.BookingException;
import com.cg.booking.service.BookingService;
import com.cg.booking.service.IBookingService;

public class Client {
	IBookingService bookingservice=new BookingService();
	
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("=======Booking App======");
		Client c=new Client();
		String option="";
		while(true)
		{
			System.out.println("1.raise a cab request");
			System.out.println("2.view cab request status");
			System.out.println("3.Exit");
			System.out.println("enter your choice");
			option=c.sc.nextLine();
			switch(option)
			{
			case "1":
				c.addRequest();
				break;
			case "2":
				c. displayRequest();
				break;
			case "3":
				System.out.println("Thank you");
				System.exit(0);
				default:
					System.out.println("please select option between 1and 3");
					break;
			
			
			}
		}
	}
	
	private void addRequest()
	{
		Request req=new Request();
		System.out.println("enter customer name");
		req.setCustomerName(sc.nextLine());
		System.out.println("enter phone number");
		req.setPhone(sc.nextLine());
		System.out.println("enter pickup address");
		req.setAddressOfPickup(sc.nextLine());
		System.out.println("enter pin");
		req.setPincode(sc.nextLine());
		req.setRequestStatus("not accepted");
		req.setDateOfRequest(LocalDate.now());
		try {
			boolean result=bookingservice.validaterequest(req);
			if(result)
			{
				int ret=bookingservice.addRequest(req);
				System.out.println("request  with"+ret+ "added successfully");
			}
		} catch (BookingException e) {
			System.out.println();
			System.err.println(e.getMessage());
			System.out.println();
			
		}
	}
	
	private void displayRequest()
	{
		System.out.println("enter request id");
		int id=Integer.parseInt(sc.nextLine());
		try {
			Request req=bookingservice.getRequestById(id);
			System.out.println("customer name:" +req.getCustomerName());
			System.out.println("request status:" +req.getRequestStatus());
			System.out.println("cab number:" +req.getCabNumber());
			System.out.println("Request date:" +req.getDateOfRequest());
			System.out.println("pick up address:" +req.getAddressOfPickup());
		} catch (BookingException e) {
			System.out.println();
			System.err.println(e.getMessage());
			System.out.println();
			
			
		}
		
	}

}
