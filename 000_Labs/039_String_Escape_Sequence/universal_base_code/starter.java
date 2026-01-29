/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String a = "Enter your pet peeve.";
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String b = "Did you just say \"" + user + "\" is your pet peeve?";
		System.out.println(b);
		String c = "\r Wow how dare you? \n \t Get out of here!";
		System.out.println(c);
	}
}
