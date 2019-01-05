package com.training.java.core.exceptions.custom;

public class MoneyTransferDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		MoneyTransfer mt = new MoneyTransfer(5000.00, 5000.00);
		try
		{
			mt.transferMoney(7500.00);
			
			System.out.println("Checking acct balance after transfer = " + mt.getCheckingAcctBalance());
			System.out.println("Savings acct balance after transfer = " + mt.getSavingsAcctBalance());
		} catch (InsufficientFundsException e)
		{
			System.out.println(e.getCause());
		}
	}

}
