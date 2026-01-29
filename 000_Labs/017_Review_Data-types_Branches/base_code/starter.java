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
		System.out.println(x + ", choose a type of agent: Duelist, Sentinel, or Controller.");
		String y = sc.nextLine();
		if (y.equals("Duelist")||y.equals("duelist")){
			System.out.println("You are a Duelist.");
		}else if(y.equals("Sentinel")||y.equals("sentinel")){
			System.out.println("You are a Sentinel.");
		}else if (y.equals("Controller")||y.equals("controller")){
			System.out.println("You are a Controller.");
		}else{
				System.out.println("That is not an option.");
			};
			
		System.out.println("You are given 20 points to divide amongst 4 skills sets: Strength, Dexterity, Intelligence, and Charisma.");
		System.out.println("How many points do you want to invest in strength?");
		int s = sc.nextInt();
		int leftover1 = 20-s;
		System.out.println("You have invested " + s + " points! You have " + leftover1 + " left.");
		if(s>20){
			System.out.println("Points invested must be less than or equal to 20. Try again.");
			System.out.println("How many points do you want to invest in strength?");
			int try2 = sc.nextInt();
			int leftover0 = 20-try2;
			System.out.println("You have invested " + try2 + " points! You have " + leftover0 + " left.");
		}
		System.out.println("How many points do you want to invest in dexterity?");
		int d = sc.nextInt();
		int leftover2 = leftover1-d;
		System.out.println("You have invested " + d + " points! You have " + leftover2 + " left.");
		if(d>s){
			System.out.println("Points invested must be less than or equal to " + leftover1 + ", try again.");
			System.out.println("How many points do you want to invest in dexterity?");
			int try3 = sc.nextInt();
			int leftover3 = s-try3;
			System.out.println("You have invested " + try3 + " points! You have " + leftover3 + " left.");
		}
		
		System.out.println("How many points do you want to invest in intelligence?");
		int i = sc.nextInt();
		int leftover4 = leftover2-i;
		System.out.println("You have invested " + i + " points! You have " + leftover4 + " left.");
		if(i>leftover2){
			System.out.println("Points invested must be less than or equal to " + leftover2 + ", try again.");
			System.out.println("How many points do you want to invest in intelligence?");
			int try4 = sc.nextInt();
			int leftover5 = leftover2-try4;
			System.out.println("You have invested " + try4 + " points!");
		}
		
		System.out.println("How many points do you want to invest in charisma?");
		int c = sc.nextInt();
		int leftover6 = leftover4-c;
		System.out.println("You have invested " + c + " points! You have " + leftover6 + " left.");
		if(c>leftover4){
			System.out.println("Points invested must be less than or equal to " + leftover4 + ", try again.");
			System.out.println("How many points do you want to invest in charisma?");
			int try7 = sc.nextInt();
			int leftover7 = leftover2-try7;
			System.out.println("You have invested " + try7 + " points!");
		}
		System.out.println("------------------------------------------");
		System.out.println("Your character: " + x + ", the " + y);
		System.out.println("Amount of strength: " + s);
		System.out.println("Amount of dexterity: " + d);
		System.out.println("Amount of intelligence: " + i);
		System.out.println("Amount of charisma: " + c);
		}
		}
		
