/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
	String x = sc.nextLine();
		System.out.println(x + ", do you choose to be a Wizard, Warrior, or a Rogue?");
	String y = sc.nextLine();
		if (y.equals("Wizard")||y.equals("wizard")){
			System.out.println("You are a Wizard.");
		}else if(y.equals("Warrior")||y.equals("warrior")){
			System.out.println("You are a Warrior.");
		}else if (y.equals("Rogue")||y.equals("rogue")){
			System.out.println("You are a Rogue.");
		}else{
				System.out.println("That is not an option.");
			};
			}
		}
