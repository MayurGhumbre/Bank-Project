package com.app.utils;

import com.app.Bank.BankAccount;
import static com.app.Bank.AccountType.*;
import static java.time.LocalDate.parse;

public class ArrayCollectionUtil {
	
	//add static method to populate bank account..
	//parse (yyyy,mm,dd)
	public static MyArray arr = new MyArray(10); //creating object of MyArray class and passing values/parameter/argument 
	//and defines the size of array
	
	public static Object[] bankAccounts() { // creating Object type static method 
		
		 //takes  int accNo,	AccountType acType,	double balance,	LocalDate creationaDate,	String customerName
		
		
		//with help of arr passing values in MyArray arr
		
		arr.add(new BankAccount(909,SAVING,80000,parse("2020-12-25"), "jay"));
		arr.add(new BankAccount(910,CURRENT,985490,parse("2021-10-05"), "Vishal"));
		arr.add(new BankAccount(911,FD,5070,parse("2019-11-13"), "Ram"));
		arr.add(new BankAccount(912,SAVING,10000,parse("2023-02-25"), "Abdul"));
		arr.add(new BankAccount(913,LOAN,13000,parse("2018-09-29"), "Prem"));
		
		return arr.getArray();
	}
	
}
