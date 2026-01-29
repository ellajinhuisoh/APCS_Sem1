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
		double x = sc.nextDouble();
		System.out.println("What is your value of y?");
		double y = sc.nextDouble();
		
		System.out.println(Math.max(x,y));
		System.out.println(Math.sqrt(y));
		System.out.println(Math.pow(x,y));
		System.out.println();
		
		System.out.println(Math.max(13-6*11, 30%7*(-2)));
		System.out.println(Math.sqrt(3 * 8 + 31 % 7));
		System.out.println(Math.pow(37 / 3, 35 % 21));
		System.out.println(Math.max(Math.pow( 2,14%3) , Math.sqrt( 2*6)));
		
		
	}
}
