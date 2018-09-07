package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileReachargeException;
/**
 * Interface:AccountDao
 * @author npannala
 * Date of Creation:11=07-2018
 *
 */

public interface AccountDao {
	Account getAccountDetails(String mobileNo) throws MobileReachargeException;
	int rechargeAccount(String mobileNo,double rechargeAmount) ;

}
