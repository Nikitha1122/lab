package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileReachargeException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;
/**
 * Class Name:MainUI
 * Number of Methods:2
 * Purpose:Accept and display the data
 * @author npannala
 * Date of Creation:11-07-2018
 *
 */

public class MainUI {
	Scanner sc=new Scanner(System.in);
	AccountService accountService=new AccountServiceImpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainUI mainUI=new MainUI();
		String option="";
		while(true)
		{
			System.out.println("1.Account Balancy Enquiry");
			System.out.println("2.Recharge Account");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			option=mainUI.sc.nextLine();
			switch(option)
			{
			case "1":
				mainUI.accountBalanceEnquiry();
				break;
			case "2":
				mainUI.rechargeAccount();
				break;
			case "3":
				mainUI.sc.close();
				System.exit(0);
				default:
					System.out.println("select option between 1 and 3");
					break;
			}
		}
		

	}
	/**
	 * Method Name: accountBalanceEnquiry
	 * Return Type:void
	 * Purpose:Accept mobile number and display balance
	 * @author npannala
	 * Date of creation:11-07-2018
	 *  
	 */
	private void accountBalanceEnquiry()
	{
		System.out.print("Enter Mobile No :");
		String mobileNo=sc.nextLine();
		try {
			Account account=accountService.getAccountDetails(mobileNo);
			System.out.println("Your Current Balance is Rs." +account.getAccountBalance());
		} catch (MobileReachargeException e) {
			System.out.println();
			System.err.println("ERROR:" +e.getMessage());
			System.out.println();
		}
	}
	/**
	 * Method Name: rechargeAccount
	 * Return Type:void
	 * Purpose:Accept the mobile number and update the balance
	 * @author npannala
	 * Date of creation:11-07-2018
	 */
	
	private void rechargeAccount()
	{
		System.out.println("Enter MobileNo :");
		String mobileNo=sc.nextLine();
		
		try {
			Account account=accountService.getAccountDetails(mobileNo);
			accountService.getAccountDetails(mobileNo);
		
			System.out.println("Enter Recharge Amount :");
			double recharge=Double.parseDouble(sc.nextLine());
			
			
			int newAccountBalance=accountService.rechargeAccount(mobileNo, recharge);
			System.out.println("Your Account Recharged Successfully");
			System.out.println("Hello " +account.getCustomerName() + " ,Available Balance is "+ newAccountBalance);
		} catch (MobileReachargeException e) {
			System.out.println();
			System.err.println("ERROR: Cannot Recharge Account as "+e.getMessage());
			System.out.println();
			
		}
		
		
		
		
		
	}

}
