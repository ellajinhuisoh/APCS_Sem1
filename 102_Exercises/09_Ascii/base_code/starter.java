/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one of the options: animal, object, or face.");
		String x = sc.nextLine();
		if(!x.equals("animal")||x.equals("object")||x.equals("face")){
			System.out.println("that is NOT one of the options.");
		}
		if(x.equals("animal")){
			System.out.println("(\\_//)");
			System.out.println("('x')");
			System.out.println("c(')(')");
		}
		else if(x.equals("object")){
			System.out.println("------~-------");
			System.out.println("((  ^ . ^  ))");
		}
		else if(x.equals("face")){
			System.out.println("-----------------");
			System.out.println("\\ ( .\\  //.) //");
			System.out.println(" \\           //");
			System.out.println("  \\    ..   //");
			System.out.println("   \\ v...v //");
			System.out.println("    \\     //");
			System.out.println("     ------");
		}
	}
}
