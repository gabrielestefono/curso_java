package com.example.entities;

public class SavingsAccount extends Account{
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double ietInterestRate() {
		return this.interestRate;
	}

	public void ietInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance(){
		balance += balance * this.interestRate;
	}

	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
