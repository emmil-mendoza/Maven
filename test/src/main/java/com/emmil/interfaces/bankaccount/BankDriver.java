package com.emmil.interfaces.bankaccount;

public class BankDriver{

	public static void main(String[] args) {
		
		BankAccount studentAccount = new CheckingAccount("Jane Doe", 100789.50, 500, 0, 35, "78FT7JH5", 379321674);
		BankAccount healthAccount = new SavingsAccount("John Doe", 250789.72, 1000, 0, 25, 10, 907631290);
        
		System.out.println(studentAccount.toString() + "\n " + "Unique ID: " + studentAccount.hashCode());
		System.out.println();
		System.out.println(healthAccount.toString() + "\n " + "Unique ID: " + healthAccount.hashCode());
		System.out.println();
		//System.out.println(" "+ studentAccount.equals(healthAccount));
		
	}

}
