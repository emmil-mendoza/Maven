package com.emmil.interfaces.bankaccount;

public interface BankAccount {

	String getOwner();
	
	Double getBalance();
	
	Double getDeposit();
	
	Double getWithdrawal();
	
	Integer getAccountNumber();
}
