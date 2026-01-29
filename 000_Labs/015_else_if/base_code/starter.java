/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number between 1 and 1000");
	int x = sc.nextInt();
	
	int y = (int)Math.random()*1000+1;
	
	if(x>y){
		System.out.println("Your number is higher than x.");
	}
	else if(x<y){
		System.out.println("Your number is lower than x.");
	}
	else{
		System.out.println("Your number is correct!");
	}
	}
}
