package com.bankingsystem.arrays;

public class BankAccount {

	int accNo;
	String name;
	double balance;
	String accType;
	
	public BankAccount(int accNo, String name, double balance, String accType)
	{
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.accType = accType;
	}
	
	//Deposit Balance
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
			System.out.println(amount + "credited to your account" + accNo + "successfully!!!!");
			System.out.println("After deposit your current balance is : "+balance);
		}
		else
		{
			System.out.println("Negative amount cannot be deposited!!!!");
		}
	}
	
	//Withdraw balance
	public void withdraw(double amount)
	{
		if(amount < balance)
		{
			balance = balance - amount;
			System.out.println(amount + "debited from your account " + accNo + " successfully!!!!");
			System.out.println("After withdraw your current balance is: "+balance);
		}
		else
		{
			System.out.println("Insufficient balance:"+balance);
		}
	}
	
	//Balance check
	public void checkBalance()
	{
		System.out.println("Your current balance is: "+balance);
	}
	
}
