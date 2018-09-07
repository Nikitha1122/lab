package com.cg.mra.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class TestDao {
	Account account;
	AccountDao dao;
@Before
public void init()
{
	dao=new AccountDaoImpl();
}
	@Test
	public void testRechargeAccount()  {
		dao.rechargeAccount("1111111111", 10);
		
		
		
	}

}
