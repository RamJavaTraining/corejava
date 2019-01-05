package com.training.java.core.enums;

public class Customer {
	public AccountType customerType;
	
	public void setCustomerType(AccountType checking)
	{
		customerType=checking;
	}
	
	public AccountType getCustomerType(){
		return customerType;
	}
public static void main(String args[]){
	
	Customer customer=new Customer();
	customer.setCustomerType(AccountType.CHECKINGS);
	
	
	
}
}
