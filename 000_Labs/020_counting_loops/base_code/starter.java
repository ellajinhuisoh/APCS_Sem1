/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("how many times?");
		int times = sc.nextInt();
		int count = 0;
		System.out.println(name);
		System.out.println("how many times?");
		while(true){
			if (count>=times){
				break;
			}
			System.out.println(count+1 + " " + name);
			count = count+1;
		}
	}
}
