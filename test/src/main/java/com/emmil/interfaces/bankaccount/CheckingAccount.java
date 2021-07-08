package com.emmil.interfaces.bankaccount;

public class CheckingAccount implements BankAccount {

	private String owner;
	private double balance;
	private double deposit;
	private double withdrawal;
	private double insufficientFundsFee;
	private String processCheck;
	private int accountNumber;

	public CheckingAccount(String owner, double balance, double deposit, double withdrawal, double insufficientFundsFee,
			String processCheck, int accountNumber) {

		this.owner = owner;
		this.balance = balance;
		this.deposit = deposit;
		this.withdrawal = withdrawal;
		this.insufficientFundsFee = insufficientFundsFee;
		this.processCheck = processCheck;
		this.accountNumber = accountNumber;

	}

	@Override
	public String getOwner() {

		return owner;
	}

	@Override
	public Double getBalance() {

		if (withdrawal > 0 && deposit > 0) {

			balance = balance + deposit - withdrawal;
		}

		else if (withdrawal > 0 && deposit == 0) {

			balance = balance - withdrawal;
		}

		else if (withdrawal == 0 && deposit > 0) {

			balance = balance + deposit;
		}

		else {
			return balance;
		}
		return balance;
	}

	@Override
	public Double getDeposit() {

		return deposit;
	}

	@Override
	public Double getWithdrawal() {

		return withdrawal;
	}

	@Override
	public Integer getAccountNumber() {

		return hashCode();
	}

	public double getInsufficientFundsFee() {
		return insufficientFundsFee;
	}

	public void setInsufficientFundsFee(double insufficientFundsFee) {
		this.insufficientFundsFee = insufficientFundsFee;
	}

	public String getCheckToProcess() {
		return processCheck;
	}

	public void setCheckToProcess(String processCheck) {
		this.processCheck = processCheck;
	}

	@Override
	public String toString() {

		return String.format(
				"Bank Owner: %s,  Balance: %d, Deposit: %d, Withdrawal: %d, Insufficient Funds Fee: %d, Check: %s, Account Number: %d ",
				owner, balance, deposit, withdrawal, insufficientFundsFee, processCheck, accountNumber);
	}

}
