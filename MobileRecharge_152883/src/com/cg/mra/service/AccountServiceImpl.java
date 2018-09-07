package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.MobileReachargeException;
/**
 * Class Name:AccountServiceImpl
 * Interface implemented:AccountService
 * Date of Creation:11-07-2018
 * @author npannala
 *
 */

public class AccountServiceImpl implements AccountService {
	
	AccountDao accountDao=new AccountDaoImpl();

	@Override
	public Account getAccountDetails(String mobileNo)
			throws MobileReachargeException {
		// TODO Auto-generated method stub
		return accountDao.getAccountDetails(mobileNo);
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		// TODO Auto-generated method stub
		return accountDao.rechargeAccount(mobileNo, rechargeAmount);
	}

	@Override
	public boolean validateMobile(String mobileNo)
			throws MobileReachargeException {
		// TODO Auto-generated method stub
		if(!mobileNo.matches("\\d{10}"))
		{
			throw new MobileReachargeException("Give exactly 10 digits");
		}
		return true;
	}

}
