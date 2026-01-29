/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		String[][] words = {
			// Col 0, 1, 2, 3
			{"The", "A", "My", "Our"},					// Row 0
			{"quick", "lazy", "happy", "curious"},		// Row 1
			{"dog", "cat", "robot", "student"},			// Row 2
			{"eats", "builds", "chases", "studies"},	// Row 3
			{"pizza", "code", "homework", "dreams"}		// Row 4
		};
		
		System.out.print(words[0][0] + " ");
		System.out.print(words[1][0] + " ");
		System.out.print(words[2][0] + " ");
		System.out.print(words[3][0] + " ");
		System.out.println(words[4][0]);
		
		System.out.print(words[0][2] + " ");
		System.out.print(words[1][1] + " ");
		System.out.print(words[2][1] + " ");
		System.out.print(words[3][2] + " ");
		System.out.println(words[4][2]);
		
		System.out.print(words[0][1] + " ");
		System.out.print(words[1][2] + " ");
		System.out.print(words[2][3] + " ");
		System.out.print(words[3][3] + " ");
		System.out.println(words[4][1]);
		
		System.out.print(words[0][1] + " ");
		System.out.print(words[1][3] + " ");
		System.out.print(words[2][2] + " ");
		System.out.print(words[3][1] + " ");
		System.out.println(words[4][3] + " ");
	
		System.out.print(words[0][0] + " ");
		System.out.print(words[1][0] + " ");
		System.out.print(words[2][2] + " ");
		System.out.print(words[3][3] + " ");
		System.out.println(words[4][0] + " ");
		
		System.out.print(words[0][2] + " ");
		System.out.print(words[1][2] + " ");
		System.out.print(words[2][2] + " ");
		System.out.print(words[2][0] + " ");
		System.out.print(words[3][0] + " ");
		System.out.print(words[4][2] + " ");
		
	}
}
