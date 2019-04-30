package com.bankacct;
import java.util.Random;

public class BankAccount {
	public String acct;
	public Double checkingamt;
	public Double savingsamt;
	public static Integer numberOfAccts = 0;
	public static Double totalInBank = 0.00;
	
	public BankAccount() {
		this.acct = acctNum();
		this.checkingamt = 0.00;
		this.savingsamt = 0.00;
		numberOfAccts++;
	}
	
	private String acctNum() {
		String acctnum = "";
		String numbers = "0123456789";
		Random r = new Random();
		while(acctnum.length() < 10) {
			 acctnum += numbers.charAt(r.nextInt(numbers.length()));
		}
		return acctnum;
	}
	
	public Double getChecking() {
		return this.checkingamt;
	}
	
	public Double getSavings() {
		return this.savingsamt;
	}
	
	public void deposit(Double amt, String acctType) {
		if(acctType == "checking") {
			this.checkingamt += amt;
			totalInBank += amt;
			System.out.println("Checking balance: " + this.checkingamt);
		} else if(acctType == "savings") {
			this.savingsamt += amt;
			totalInBank += amt;
			System.out.println("Checking balance: " + this.savingsamt);
		} else {
			System.out.println("Invalid account type (checking or savings)");
		}
	}
	
	public void withdraw(Double amt, String acctType) {
		if(acctType == "checking") {
			if(amt > this.checkingamt) {
				System.out.println("Insufficient funds");
			} else {
				this.checkingamt -= amt;
				totalInBank -= amt;
				System.out.println("Checking balance: " + this.checkingamt);
			}
		} else if(acctType == "savings") {
			if(amt > this.savingsamt) {
				System.out.println("Insufficient funds");
			} else {
				this.savingsamt -= amt;
				totalInBank -= amt;
				System.out.println("Checking balance: " + this.savingsamt);
			}
		} else {
			System.out.println("Invalid account type (checking or savings)");
		}
	}
	
	public void acctTotal() {
		Double total = this.checkingamt + this.savingsamt;
		System.out.println("Total across accounts: " + total);
	}
}
