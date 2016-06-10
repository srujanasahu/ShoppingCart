package com.niit.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.niit.training.bean.Account;
import com.niit.training.bean.Customer1;

public class Test {
	public static void displayAccountDetails(Account a)
	{
		System.out.println(a.getId());
		System.out.println(a.getName());
	}
	public static void display(Customer1 c){
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPassword());
		
	List accounts=c.getMyAccounts();
	Iterator it=accounts.iterator();
	while(it.hasNext())
	{
	Account a=(Account)it.next();
	displayAccountDetails(a);
	}
	}
	
	public static void main(String[] args) {
		Customer1 c1=new Customer1();
		c1.setId("101");
	c1.setName("Customer");
	c1.setPassword("NIIT");
	Account ac=new Account();
	ac.setId(10001);
	ac.setName("SB");
	List accounts=new ArrayList();
	accounts.add(ac);
	ac=new Account();
	ac.setId(10002);
	ac.setName("CA");
	accounts.add(ac);
	c1.setMyAccounts(accounts);
	Test.display(c1);
	}
}
