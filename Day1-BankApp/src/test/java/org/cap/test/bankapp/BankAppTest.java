package org.cap.test.bankapp;

import static org.junit.Assert.*;

import org.cap.dto.Account;
import org.cap.dto.Customer;
import org.cap.exception.InsufficientBalanceException;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BankAppTest {

	
	@Before
	public void setUp(){
		
		System.out.println("Before Test Case ");
		AcccountService sc=new AccountServiceImpl();

	}
	
	@After
	public void teerDown()
	{
		
		System.out.println("After Test Case ");

	}
	@Category(LoginCategory.class)
	@Test
	public void test_addNumbers_method() {
		//fail("Not yet implemented");
		
		AcccountService ac=new AccountServiceImpl();
		
		assertEquals(15, ac.addNumbers(10, 5));
		
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	
	public void test_add_account_with_null_customer() throws InvalidInitialAmountException
	{
		
		Customer customer=null;
		
	
		sc.addAccount(customer, 1000);		
		
		
	}
	
@Test(expected=InsufficientBalanceException.class)
	
	public void test_withdraw() throws InsufficientBalanceException    
	{
		
	Account ac=null;
		
		sc.withdraw(1000, 100.0);
		
	}
	


	
	

}

