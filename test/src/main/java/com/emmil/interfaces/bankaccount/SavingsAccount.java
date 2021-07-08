package com.emmil.interfaces.bankaccount;

public class SavingsAccount implements BankAccount {

	private String owner;
	private double balance;
	private double deposit;
	private double withdrawal;
	private double annualInterestRate;
	private double depositMonthlyInterest;
	private int accountNumber;

	public SavingsAccount(String owner, double balance, double deposit, double withdrawal, double annualInterestRate,
			double depositMonthlyInterest, int accountNumber) {

		this.owner = owner;
		this.balance = balance;
		this.deposit = deposit;
		this.withdrawal = withdrawal;
		this.annualInterestRate = annualInterestRate;
		this.depositMonthlyInterest = depositMonthlyInterest;
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

	public double getAnnualInterestRate() {
		return annualInterestRate / 100;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getDepositMonthlyInterest() {
		return depositMonthlyInterest;
	}

	public void setDepositMonthlyInterest(double depositMonthlyInterest) {
		this.depositMonthlyInterest = depositMonthlyInterest;
	}

	@Override
	public String toString() {
		return String.format(
				"Bank Owner: %s,  Balance: %d, Deposit: %d, Withdrawal: %d, Annual Interest Rate: %d, Monthly Interest: %d, Account Number: %d ",
				owner, balance, deposit, withdrawal, annualInterestRate, depositMonthlyInterest, accountNumber);
	}

	
	
}
