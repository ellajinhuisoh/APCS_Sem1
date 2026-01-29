/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
        int money = 100;
        System.out.println("You start with $" + money + ".");

        while (money > 0){
            System.out.println("Do you wish to play the game?");
            String response = sc.nextLine();

            if (response.equalsIgnoreCase("Yes") || response.equalsIgnoreCase("Y")) {
                System.out.println("How much would you like to wager?");
                int wager = sc.nextInt();
                sc.nextLine();

                if (wager <= 0 || wager > money){
                    System.out.println("You must bet between $1 and $" + money + ".");
                    continue;
                }
                int num1 = (int)(Math.random() * 9 + 1);
                int num2 = (int)(Math.random() * 9 + 1);
                int num3 = (int)(Math.random() * 9 + 1);
                System.out.println(num1 + ", " + num2 + ", " + num3);

                if (num1 == num2 && num2 == num3){
                    int winnings = wager * 3;
                    money += winnings;
                    System.out.println("Jackpot! You won $" + winnings + "!");
                } 
                else if (num1 == num2 || num1 == num3 || num2 == num3){
                    int winnings = wager * 2;
                    money += winnings;
                    System.out.println("You won $" + winnings + "!");
                } 
                else{
                    money -= wager;
                    System.out.println("You lost $" + wager + ".");
                }

                System.out.println("You now have $" + money + ".");
                System.out.println("---------------------------");
            } 
            else if (response.equalsIgnoreCase("No") || response.equalsIgnoreCase("N")){
                System.out.println("Game ended. You walk away with $" + money + ".");
            } 
            else {
                System.out.println("Invalid response. Please enter Yes or No.");
            }

            if (money <= 0){
                System.out.println("You're out of money! Game over.");
            }
        }
	}
}