package com.app.utils;

public class ValidationsRules {

	public static final double MIN_BALANCE;	
	
	static {
		MIN_BALANCE=5000;
	}
	
	// add static method to validate balance
	
	public static boolean validateBalance(double amount) {
		boolean flag=false;
		if(amount<MIN_BALANCE) {
			flag=false;
		}else {
			flag=true;
		}
		return flag;
	}
}
