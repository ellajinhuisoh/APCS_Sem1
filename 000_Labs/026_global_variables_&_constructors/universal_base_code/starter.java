/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static voidm   main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		x.bankaccountToString();
		
		BankAccount one = new BankAccount("Eren",1234, 999.99, true);
		one.bankaccountToString();
		
		BankAccount two = new BankAccount("bob");
		two.bankaccountToString();
		
		BankAccount three = new BankAccount("boon", 589.0);
		three.bankaccountToString();
		
		BankAccount four = new BankAccount("polly");
		four.bankaccountToString();
	}
}
