package com.app.Bank;

import java.time.LocalDate;
import static com.app.utils.ValidationsRules.validateBalance;

public class BankAccount {

	private int accNo;
	private AccountType acType;
	private double balance;
	private LocalDate creationaDate;
	private String customerName;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accNo,AccountType acType,double balance,LocalDate creationaDate,String customerName ) {
		this.accNo=accNo;
		this.acType=acType;
		this.balance=balance;
		this.creationaDate=creationaDate;
		this.customerName=customerName;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public AccountType getAcType() {
		return acType;
	}

	public void setAcType(AccountType acType) {
		this.acType = acType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getCreationaDate() {
		return creationaDate;
	}

	public void setCreationaDate(LocalDate creationaDate) {
		this.creationaDate = creationaDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", acType=" + acType + ", balance=" + balance + ", creationaDate="
				+ creationaDate + ", customerName=" + customerName + "]";
	}
	
	//BL
	
	public void deposit(double amount) {
		//this.balance=this.balance+amount
		this.balance+=amount;
	}
	
	public void withdraw(double amount) {
		if(validateBalance(balance-amount)) {
				this.balance-=amount;
				System.out.println("\n Amount is debited from your account");
		}
				else {
					System.out.println("\n insuficient balance !!");
	}
	}
	public void transferAmount(BankAccount dest,double amount) {
		this.withdraw(amount);
		this.deposit(amount);
	}
}
