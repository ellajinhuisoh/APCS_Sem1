/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	String Owner; 
	int AccountNumber;
	double Balance;
	boolean isActive;

private static int nextAccountNumber= (int)(Math.random()*950+50);
	
	public BankAccount() {		// Default Constructor
		Owner = new String("unknown");
		AccountNumber = nextAccountNumber;
		nextAccountNumber++;
		Balance = 0.00;
		isActive = true;
	}
	
	public BankAccount(String o){
		Owner = o;
		AccountNumber = nextAccountNumber;
		nextAccountNumber++;
		Balance = 0.00;
		isActive = true;
	}
	
	public BankAccount(String o, double b){
		Owner = o;
		AccountNumber = nextAccountNumber;
		nextAccountNumber++;
		Balance = b;
		isActive = true;
	}
	

	public BankAccount(String o, int an, double b, boolean tf){		// int, String, String, int Constructor
		Owner = o;
		AccountNumber = an;
		Balance = b;
		isActive = tf;
	}
	
	private String getOwner(){
		return Owner;
	}
	
	private int getAccountNumber(){
		return AccountNumber;
	}
	
	private double getBalance(){
		return Balance;
	}
	
	private boolean getisActive(){
		return isActive;
	}	
	
	public void checkBalance(){
		System.out.println(Balance);
	}
	
	public void displayAccountInfo(){
		System.out.println(Owner);
		System.out.println(AccountNumber);
		System.out.println(Balance);
		System.out.println(isActive);
	}
	
	
		
	public void bankaccountToString(){					// Prints all values of the Employee	
		System.out.println("------------------------------");
		System.out.println("Owner: " + Owner);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Balance: " + Balance);
		System.out.println("Active? " + isActive);
		System.out.println("------------------------------");
		System.out.println("");
	}

}