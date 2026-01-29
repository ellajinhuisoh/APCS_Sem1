/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess a number from 1-1000!");
		int guess = sc.nextInt();
		int random = (int)(Math.random()*1000+1);
		while (guess != random){
			if(guess>random){
				System.out.println("Your number is greater than generated number!");
			}
			else if(guess<random){
				System.out.println("Your number is less than the generated number!");
			}
			System.out.println("Guess again!");
			guess = sc.nextInt();
		}
		System.out.println("You got it!");
		
	}
}
