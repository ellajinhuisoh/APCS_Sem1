/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please enter a number: ");
	int x = sc.nextInt();
	System.out.println("Here are the next 5 numbers!");
	System.out.print(x+1 + ",");
	System.out.print(x+2 + ",");
	System.out.print(x+3 + ",");
	System.out.print(x+4 + ",");
	System.out.println(x+5);
	
	System.out.println("Here are the next 5 multiples of " + x + "!");
	System.out.print(x+x + ",");
	System.out.print(x+x+x + ",");
	System.out.print(x+x+x+x + ",");
	System.out.print(x+x+x+x+x + ",");
	System.out.println(x+x+x+x+x+x);

	System.out.println("Here is " + x + " divided by 100!");
	System.out.println(x/100.0);
	System.out.println("Here is " + x + " divided by 10!");
	System.out.print(x/10.0);
	}
}
