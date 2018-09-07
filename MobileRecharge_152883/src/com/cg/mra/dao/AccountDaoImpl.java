package com.cg.mra.dao;

import java.util.HashMap;

import com.cg.mra.beans.Account;
import com.cg.mra.db.AccountEntryDB;
import com.cg.mra.exception.MobileReachargeException;
/**
 * Class name:AccountDaoImpl
 * purpose:data access for mobileRecharge
 * Number of methods:2
 * @author npannala
 * Date of Creation:11-07-2018
 *
 */

public class AccountDaoImpl implements AccountDao {
	
	static HashMap<String, Account> accountmap=
			AccountEntryDB.getAccountEntry();

	@Override
	public Account getAccountDetails(String mobileNo)
			throws MobileReachargeException {
		// TODO Auto-generated method stub
		
		Account account=accountmap.get(mobileNo);
		if(account==null)
		{
			throw new MobileReachargeException("Given Account Id Does Not Exists");
		}
		return account;
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		// TODO Auto-generated method stub
		Account account=accountmap.get(mobileNo);
		double amount=0;
		
		
			amount=rechargeAmount+account.getAccountBalance();
			account.setAccountBalance(amount);
		return (int) amount;
	}

}
