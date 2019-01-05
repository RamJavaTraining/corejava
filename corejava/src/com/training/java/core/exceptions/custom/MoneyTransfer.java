package com.training.java.core.exceptions.custom;

public class MoneyTransfer
{
	private double checkingAcctBalance;
	private double savingsAcctBalance;
	
	public MoneyTransfer(double checkingAcctBalance, double savingsAcctBalance)
	{
		this.checkingAcctBalance = checkingAcctBalance;
		this.savingsAcctBalance = savingsAcctBalance;
	}

	public void transferMoney(double transferAmount) throws InsufficientFundsException
	{
		if(transferAmount > checkingAcctBalance)
		{
			throw new InsufficientFundsException("You don't have enough money to transfer");
		}
		
		checkingAcctBalance -= transferAmount;
		savingsAcctBalance += transferAmount;
	}

	public double getCheckingAcctBalance()
	{
		return checkingAcctBalance;
	}

	public double getSavingsAcctBalance()
	{
		return savingsAcctBalance;
	}
}
