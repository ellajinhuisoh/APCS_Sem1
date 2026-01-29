/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your value of x?");
		int x = sc.nextInt();
		System.out.println("What is your value of y?");
		int y = sc.nextInt();
		System.out.println("What is your value of z?");
		int z = sc.nextInt();
		
		if ((x>y)&&(x>z)){
			System.out.println(x + " is the greatest integer.");
		}
		else if ((y>x)&&(y>z)){
			System.out.println(y + "is the greatest integer.");
		}
		else{
			System.out.println(z + " is the greatest integer.");
		}
		
		
		if ((x<y)&&(x<z)){
			System.out.println(x + " is the smallest integer.");
		}
		else if ((y<x)&&(y<z)){
			System.out.println(y + "is the smallest integer.");
		}
		else{
			System.out.println(z + " is the smallest integer.");
		}
	}
}
