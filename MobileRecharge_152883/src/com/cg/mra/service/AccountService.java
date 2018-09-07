package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileReachargeException;

public interface AccountService {
	Account getAccountDetails(String mobileNo) throws MobileReachargeException;
	int rechargeAccount(String mobileNo,double rechargeAmount) throws MobileReachargeException; 
	
	boolean validateMobile(String mobileNo) throws MobileReachargeException;


}
