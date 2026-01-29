/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Would you like to play 'rock, paper, or scissors'?");
        String ans = sc.nextLine();
        
        if(ans.equals("yes")){
            playAgainstComputer(sc);
        }
        
        else if(ans.equals("no")){
            computerVscomputer(sc);
        }
        
        else if(ans.equals("done")){
            System.out.println("Thanks for playing! Goodbye!");
            break;
        }
        else{
            System.out.println("Please type either yes, no, or done!");
        }
    }
    sc.close();
    }
    
    public static String getObject(){
        int num = (int)(Math.random()*3);
        if (num==0) return "rock";
        else if(num ==1) return "paper";
        else return "scissors";
    }
    
    public static int compare2(String n1, String n2){
        if (n1.equals(n2)){ 
        return 0;
        }
        else if((n1.equals("rock")&&n2.equals("scissors"))||
                (n1.equals("paper")&&n2.equals("rock"))||
                (n1.equals("scissors")&&n2.equals("paper"))){
            return 1;
        }
        else{
            return 2;
        }
        }
        
    public static void playAgainstComputer(Scanner sc){
        String playerChoice = "";
        while(true){
            System.out.print("Enter rock, paper, or scissors: ");
            playerChoice = sc.nextLine();
            if (playerChoice.equals("rock")||playerChoice.equals("paper")||playerChoice.equals("scissors")){
                break;
            }
            else{
                System.out.println("Please try again.");
            }
        }
            
            String computerChoice = getObject();
            System.out.println("Computer chose: " + computerChoice);
            
            int result = compare2(playerChoice, computerChoice);
            if (result ==0){
            System.out.println("It's a tie!");
            }
            else if(result ==1){
                System.out.println("You win!");
            }
            else{
                System.out.println("Computer wins!");
            }
        }
            public static void computerVscomputer(Scanner sc){
                System.out.println("How many times should the computer play itself?");
                int rounds = sc.nextInt();
                sc.nextLine();
                int p1Wins = 0;
                int p2Wins = 0;
                int ties = 0;

                for (int i = 0; i < rounds; i++) {
                    String p1 = getObject();
                    String p2 = getObject();
                    int result = compare2(p1, p2);

                    if (result == 0) ties++;
                    else if (result == 1) p1Wins++;
                    else p2Wins++;
        }

            System.out.println("Computer vs. Computer results:");
            System.out.println("Player 1 Wins: " + p1Wins);
            System.out.println("Player 2 Wins: " + p2Wins);
            System.out.println("Ties: " + ties);
    }
}
         
