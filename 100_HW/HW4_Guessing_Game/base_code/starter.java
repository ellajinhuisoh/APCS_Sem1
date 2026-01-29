/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
	int game = (int)(Math.random()*3);
		
		if(game==0){
			System.out.println("The goal of the game is to guess a word with two hints.");
			System.out.println("Game 1: Guess the planet!");
			System.out.println("Hint 1: This planet is closest to the sun.");
			System.out.println("Your guess: ");
		}	
		String guess1 = sc.nextLine();
		
		if (guess1.equals("Mercury")||(guess1.equals("mercury"))){
			System.out.println("You got it!");
		} else{
			System.out.println("Wrong! Hint 2: It is the second hottest planet in our solar system.");
			System.out.println("Your guess: ");
			String guess2 = sc.nextLine();
			if (guess2.equals("Mercury") || guess2.equals("mercury")){
				System.out.println("You got it!");
			}else{
				System.out.println("Sorry, the answer was 'Mercury'.");
			}
		}
		
		if(game==1){
			System.out.println("The goal of the game is to guess a word with two hints.");
			System.out.println("Game 2: Guess the song!");
			System.out.println("Hint 1: This song was written by Fleetwood Mac.");
			System.out.println("Your guess: ");
		}	
		String guess3 = sc.nextLine();
		
		if (guess3.equals("Landslide")||(guess3.equals("landslide"))){
			System.out.println("You got it!");
		} else{
			System.out.println("Wrong! Hint 2: This song is named after a natural disaster.");
			System.out.println("Your guess: ");
			String guess4 = sc.nextLine();
			if (guess4.equals("Landslide") || guess4.equals("landslide")){
				System.out.println("You got it!");
			}else{
				System.out.println("Sorry, the answer was 'Landslide'.");
			}
		}
		
		if(game==2){
			System.out.println("The goal of the game is to guess a word with two hints.");
			System.out.println("Game 1: Guess the actress!");
			System.out.println("Hint 1: This actress is in the movie, 'The Notebook'.");
			System.out.println("Your guess: ");
		}	
		String guess5 = sc.nextLine();
		
		if (guess5.equals("Rachel McAdams")||(guess5.equals("rachel mcadams")||(guess5.equals("Rachel Mcadams")))){
			System.out.println("You got it!");
		} else{
			System.out.println("Wrong! Hint 2: She also stars in 'Mean Girls'.");
			System.out.println("Your guess: ");
			String guess6 = sc.nextLine();
			if (guess6.equals("Rachel McAdams")||(guess6.equals("rachel mcadams")||(guess6.equals("Rachel Mcadams")))){
				System.out.println("You got it!");
			}else{
				System.out.println("Sorry, the answer was 'Rachel McAdams'.");
			}
		}
	}
}
