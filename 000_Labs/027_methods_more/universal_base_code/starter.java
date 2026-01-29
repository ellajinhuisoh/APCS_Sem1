/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
	System.out.println("Welcome to the ATM!");
	System.out.println("We're going to create a bank account! What information do we know?");
	System.out.println("1 - Nothing");
	System.out.println("2 - Owner");
	System.out.println("3 - Owner and Initial Deposit");
	Scanner sc = new Scanner(System.in);
	int answer = sc.nextInt();
	sc.nextLine();
	if(answer==1){
		System.out.println("---Account Information---");
		BankAccount x = new BankAccount();
		x.bankaccountToString();
		
		System.out.println("Would you like to check your balance of this account? (yes/no)");
		String answer2 = sc.nextLine();
		if(answer2.equals("yes")){
			System.out.print("$");
			x.checkBalance();
		}
		else if(answer2.equals("no")){
			return;
		}
	}
	else if(answer==2){
		System.out.println("---Account Information---");
		System.out.println("What is the name of the owner of this bank account?");
		String name = sc.nextLine();
		BankAccount two = new BankAccount(name);
		two.bankaccountToString();
		
		System.out.println("Would you like to check your balance of this account? (yes/no)");
		String answer3 = sc.nextLine();
		if(answer3.equals("yes")){
			System.out.print("$");
			two.checkBalance();
		}
		else if(answer3.equals("no")){
			return;
		}
	}
	else if(answer==3){
		System.out.println("---Account Information---");
		System.out.println("What is the name of the owner of this bank account?");
		String name2 = sc.nextLine();
		System.out.println("How much are you initially depositing into this account?");
		double deposit = sc.nextDouble();
		sc.nextLine();
		BankAccount three = new BankAccount(name2, deposit);
		three.bankaccountToString();
		
		System.out.println("Would you like to check your balance of this account? (yes/no)");
		String answer4 = sc.nextLine();
		if(answer4.equals("yes")){
			System.out.print("$");
			three.checkBalance();
		}
		else if(answer4.equals("no")){
			return;
		}
	}
	}
}

