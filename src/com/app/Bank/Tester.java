package com.app.Bank;

import java.util.Scanner;
import static com.app.utils.ArrayCollectionUtil.bankAccounts;
import static com.app.Bank.AccountType.*;
import com.app.utils.*;
import static java.time.LocalDate.parse;


public class Tester {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Object[] accounts=bankAccounts(); //creaiting rreferance variable and and storing wich returned by bankaccount method
		System.out.println("\t Welcome to Bank ");
		while(true) {
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("\n"+"1 : Add new account \n"+"2 : Display all accounts \n"+"3 : Diposite \n"+"4 : Withdraw \n"+"5 : Exit \n");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			if(choice==1) {
				MyArray arr = ArrayCollectionUtil.arr;
				AccountType AcType = null;
				System.out.println("\n salect account type \n"+"\t 1:saving \t"+" 2:current \t"+" 3:loan \t"+" 4:fd \t");
				int m=sc.nextInt();
				switch(m) {
				case 1:
					AcType=SAVING;
					break;
				case 2:
					AcType=CURRENT;
					break;
				case 3:
					AcType=LOAN;
					break;
				case 4:
					AcType=FD;
				}
				System.out.println("\n enter account no , balance , name");
				arr.add(new BankAccount(sc.nextInt(),AcType,sc.nextDouble(),parse("2022-11-14"),sc.next()));
			}else if(choice==2) {	
				//display all accounts
				for(Object bankaccount :accounts) {
					if(bankaccount!=null) {
						System.out.println(bankaccount);
					}
				}
			}
			else if(choice==3) {
				System.out.println("\n"+"Enter Account number");
				int accountNo=sc.nextInt();
				boolean foundAc=false;
				double amount=0;
				for(Object obj:accounts) {
					if(obj instanceof BankAccount) {
						BankAccount account = (BankAccount)obj;
						if(account.getAccNo()==accountNo) {
							foundAc=true;
							System.out.println("\n"+"Enter Amount to Diposite");
							amount=sc.nextInt();
							account.deposit(amount);
							System.out.println("\n Amount is credited succesfully");
							
							
						}
					}
				}
				if(!foundAc)
					System.out.println("Account not found");
			}
			
			if(choice==4) {
				System.out.println("\n"+"Enter Account number");
				int accountNo=sc.nextInt();
				boolean foundAc=false;
				double amount=0;
				for(Object obj:accounts) {
					if(obj instanceof BankAccount) {
						BankAccount account = (BankAccount)obj;
						if(account.getAccNo()==accountNo) {
							foundAc=true;
							System.out.println("\n"+"Enter Amount to Withdraw");
							amount=sc.nextInt();
							account.withdraw(amount);			
						}
					}
				}
				if(!foundAc)
					System.out.println("Account not found");
			}
			
			if(choice==5) {
				System.out.println("Thank you using our services");
				break;
			}
		}
	}  

}
