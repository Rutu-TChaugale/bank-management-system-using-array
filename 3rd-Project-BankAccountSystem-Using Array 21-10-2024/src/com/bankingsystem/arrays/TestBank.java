package com.bankingsystem.arrays;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] bank = new BankAccount[10];
		
		int index = 0;
		
		//BankAccount(int accNo, String name, double balance, String accType) ---> constructor parameterized
		bank[index++] = new BankAccount(11, "Pratik", 7000, "Saving");
		bank[index++] = new BankAccount(12, "Ram", 8500, "Current");
		bank[index++] = new BankAccount(13, "Shyam", 9000, "Saving");
		bank[index++] = new BankAccount(14, "Kartik", 5500, "Current");

		while (true) {
			System.out.println("************ WELCOME TO SKILLS IT BANKING SYSTEM ************");
			System.out.println("\t 1. Create Account \n" + "\t 2. Display all accounts \n" + "\t 3. Search account by account number \n"
								+ "\t 4. Deposit \n" + "\t 5. Withdraw \n" + "\t 6. Exit");
			
			System.out.println("-------------------------------------------------------------------------------------------------------");
			
			System.out.println("Enter your choice from above menu: ");
			int choice = sc.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Enter Acc number, Name, Balance, Acc type:");
				bank[index++] = new BankAccount(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
				System.out.println("Account created successfully!!!");
			}
			else if(choice == 2)
			{
				for(BankAccount account : bank)
				{
					if(account != null)
					{
						
							System.out.println("Account holder account number: "+account.accNo);
							System.out.println("Account holder name: "+account.name);
							System.out.println("Account holder balance: "+account.balance);
							System.out.println("Account holder type: "+account.accType);
							System.out.println("-----------------------------------------------------------------------------------------------");
					}
				}
			}
			else if(choice == 3)
			{
				System.out.println("Enter account number to search account: ");
				int accNo = sc.nextInt();
				
				for(BankAccount account : bank)
				{
					if(account != null)
					{
						if(account.accNo == accNo)
						{
							System.out.println("Account holder account number: "+account.accNo);
							System.out.println("Account holder name: "+account.name);
							System.out.println("Account holder balance: "+account.balance);
							System.out.println("Account holder type: "+account.accType);
							System.out.println("-----------------------------------------------------------------------------------------------");}
						}
				}
			}
			else if(choice == 4)
			{
				System.out.println("Enter account number to deposit: ");
				int accNo = sc.nextInt();
				
				System.out.println("Enter amount to deposit:");
				double amount = sc.nextDouble();
				
				for(BankAccount account : bank)
				{
					if(account != null)
					{
						if(account.accNo == accNo)
						{
							account.deposit(amount);
						}
					}
				}
			}
				
			else if(choice == 5)
			{
				System.out.println("Enter account number to withdraw: ");
				int accNo = sc.nextInt();
					
				System.out.println("Enter amount to withdraw:");
				double amount = sc.nextDouble();
					
				for(BankAccount account : bank)
				{
					if(account != null)
					{
						if(account.accNo == accNo)
							{
								account.withdraw(amount);
							}
					}
				}
			}
			else if(choice == 6)
			{
				System.out.println("Thanks for using...");
				break;
			}
		}
	}
}
