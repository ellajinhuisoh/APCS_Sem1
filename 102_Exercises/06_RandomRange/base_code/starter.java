/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers to create a range for your random number");
		System.out.print("Please enter your first integer: ");
		int x = sc.nextInt();
		System.out.println("Please enter your second integer (must be greater than the first value): ");
		int y = sc.nextInt();
	
		System.out.println("Your range is from " + x + " to " + y);
		System.out.println("Here are 5 numbers generated in that range");
		
		int num1 = (int) (Math.random()*(y-x)+x);
		System.out.print(num1 + ", ");
		int num2 = (int) (Math.random()*(y-x)+x);
		System.out.print(num2 + ", ");
		int num3 = (int) (Math.random()*(y-x)+x);
		System.out.print(num3 + ", ");
		int num4 = (int) (Math.random()*(y-x)+x);
		System.out.print(num4 + ", ");
		int num5 = (int) (Math.random()*(y-x)+x);
		System.out.print(num5);
	}
}
