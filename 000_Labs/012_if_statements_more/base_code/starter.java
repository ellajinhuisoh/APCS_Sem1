/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your value of x?");
		int x = sc.nextInt();
		System.out.println("What is your value of y?");
		int y = sc.nextInt();
	
		boolean b = x!=y;
		if(b)
		{
			System.out.println("You're wrong");
		 }
	}
}
