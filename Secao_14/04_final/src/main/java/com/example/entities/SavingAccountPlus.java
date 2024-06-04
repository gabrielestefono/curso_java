package com.example.entities;

public class SavingAccountPlus extends SavingsAccount{

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2;
	}
	
}
