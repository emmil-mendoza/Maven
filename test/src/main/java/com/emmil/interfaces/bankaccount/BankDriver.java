package com.emmil.interfaces.bankaccount;

public class BankDriver{

	public static void main(String[] args) {
		
		BankAccount studentAccount = new CheckingAccount("Jane Doe", 100789.50, 500, 0, 35, "78FT7JH5", 0);
		BankAccount healthAccount = new SavingsAccount("John Doe", 250789.72, 1000, 0, 25, 10, 0);
        
		System.out.println("Account Owner: " + studentAccount.getOwner());
		System.out.println("Balance: $" + studentAccount.getBalance());
		System.out.println("Deposit: $" + studentAccount.getDeposit());
		System.out.println("Withdrawal: $" + studentAccount.getWithdrawal());
		System.out.println(studentAccount.getAccountNumber());
		System.out.println();
		System.out.println("Account Owner: " + healthAccount.getOwner());
		System.out.println("Balance: $" + healthAccount.getBalance());
		System.out.println("Deposit: $" + healthAccount.getDeposit());
		System.out.println("Withdrawal: $" + healthAccount.getWithdrawal());
		System.out.println(healthAccount.getAccountNumber());
	}

}
