package org.cap.dao;

import org.cap.dto.Account;
import org.cap.dto.Customer;

public interface AccountDao {
	
	public boolean createAccount(Account account1);
	
	public Account findAccountById(int accountNo);
	

}
