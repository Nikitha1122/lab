package com.cg.mra.db;

import java.util.HashMap;

import com.cg.mra.beans.Account;
/**
 * Class name:AccountEntryDB
 * purpose:Create hashmap and stores data
 * @author npannala
 * Date of Creation:11-07-2018
 *
 */

public class AccountEntryDB {
	private static HashMap<String, Account> accountEntry=
			new HashMap<String, Account>();

	public static HashMap<String, Account> getAccountEntry() {
		return accountEntry;
	}
	
	static
	{
		accountEntry.put("1111111111", new Account("1111111111"	, "idea", "Mark", 500.0));
		accountEntry.put("2222222222", new Account("2222222222"	, "airtel", "Jhon", 100.0));
		accountEntry.put("3333333333", new Account("3333333333"	, "BSNL", "Sara", 400.0));
		accountEntry.put("4444444444", new Account("4444444444"	, "Docomo", "Ram", 200.0));
	}
	

}
