 /*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your value of x?");
		int x = sc.nextInt();
		System.out.println("What is your value of y?");
		int y = sc.nextInt();
		
		if (x % 2 ==0){
			System.out.println(x + " is an even number.");
		}
		else if(x % 2 != 0){
			System.out.println(x + " is an odd number.");
		}
		
		if (y % 2 == 0){
			System.out.println(y + " is an even number.");
		}
		else if(y % 2 != 0){
			System.out.println(y + " is an odd number.");
		}
		
		boolean divisibleBy3 = (x%3 !=0);
		boolean divisibleBy4 = (x%4 !=0);
		boolean divisibleBy5 = (x%5 !=0);
		
		if (divisibleBy3 && divisibleBy4 && divisibleBy5){
			System.out.println(x + " is not divisible by 3, 4, or 5.");
		}
	
	
		boolean DivisibleBy3 = (y%3 !=0);
		boolean DivisibleBy4 = (y%4 !=0);
		boolean DivisibleBy5 = (y%5 !=0);
		
		if (DivisibleBy3 && DivisibleBy4 && DivisibleBy5){
			System.out.println(y + " is not divisible by 3, 4, or 5.");
		}
	}
}
