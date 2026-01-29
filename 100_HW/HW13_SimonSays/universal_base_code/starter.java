/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();

        //Colors.print("Test 1");         // This prints out the value given without a new line   
       // Colors.println("Test 2");       // This prints out the value given then a new line
        //Colors.print("Test 3", "BRIGHT_Red");       // 2 String parameters: Value, Color of text
        //Colors.println("Test 4", "BRIGHT_Red");     // 2 String parameters: Value, Color of text WITH a new line after
        //Colors.print("Test 5", "BRIGHT_Red", "BG_Blue");         // 3 String parameters: Value, Color of text, Color of background
        //Colors.println("Test 6", "BRIGHT_Red", "BG_Blue");       // 3 String parameters: Value, Color of text, Color of background WITH a new line after
        // Notice: for the colors, you must concatenate "BRIGHT_" or "BG_" to the input parameter to get the bright or background versions of the colors.

        // Feel free to comment out the test code above when you start your assignment

        if(diff == 1){
            String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple"};

            int round = 1;
            boolean playing = true;

            while(playing){
                String[] sequence = new String[round];

                for(int i = 0; i < round; i++){
                    sequence[i] = getColorWord();
                }

                System.out.println();
                System.out.println("Round " + round);
                System.out.println("Memorize these words:");

                for(int i = 0; i < sequence.length; i++){
                    System.out.println(sequence[i]);
                }

                System.out.println("Get ready...");
                delay(5);

                for(int i = 0; i < 30; i++){
                    System.out.println();
                }

                System.out.println("Enter the colors in order:");
                String[] user = new String[round];

                for(int i = 0; i < round; i++){
                    user[i] = sc.nextLine();
                }

                boolean correct = true;

                for(int i = 0; i < round; i++){
                    if(!user[i].equals(sequence[i])){
                        correct = false;
                    }
                }

                if(correct){
                    System.out.println("Correct! Next round!");
                    round++;
                }
                else{
                    System.out.println("Game over!");
                    System.out.println("The correct sequence was:");
                    for(int i = 0; i < sequence.length; i++){
                        System.out.print(sequence[i] + " ");
                    }
                    System.out.println();
                    playing = false;
                }
            }
        }
               else if(diff == 2){
            String[] words = {"Red", "Blue", "Green", "Yellow", "Purple"};
            String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple"};
        
            int round = 1;
            boolean playing = true;
        
            while(playing){
                String[] sequenceWords = new String[round];
                String[] sequenceColors = new String[round];
        
                for(int i = 0; i < round; i++){
                    String w = getColorWord();
                    sequenceWords[i] = w;
                    sequenceColors[i] = w;
                }
        
                System.out.println("\nRound " + round);
                System.out.println("Memorize these:");

                for(int i = 0; i < round; i++){
                    Colors.println(sequenceWords[i], "BRIGHT_" + sequenceWords[i]);
                }
        
                System.out.println("Get ready...");
                delay(5);
        
                for(int i = 0; i < 30; i++){
                    System.out.println();
                }
        
                int mode = (int)(Math.random() * 2);
        
                if(mode == 0){
                    System.out.println("Enter the WORDS in order:");
                }
                else{
                    System.out.println("Enter the TEXT COLORS in order:");
                }
        
                String[] user = new String[round];
                for(int i = 0; i < round; i++){
                    user[i] = sc.nextLine();
                }
        
                boolean correct = true;
        
                for(int i = 0; i < round; i++){
                    if(mode == 0){
                        if(!user[i].equals(sequenceWords[i])){
                            correct = false;
                        }
                    }
                    else{
                        if(!user[i].equals(sequenceColors[i])){
                            correct = false;
                        }
                    }
                }
        
                if(correct){
                    System.out.println("Correct! Next round!");
                    round++;
                }
                else{
                    System.out.println("Incorrect! Game over!");
                    System.out.println("Correct sequence was:");
                    
                    for(int i = 0; i < round; i++){
                        if(mode == 0){
                            System.out.print(sequenceWords[i] + " ");
                        }
                        else{
                            System.out.print(sequenceColors[i] + " ");
                        }
                    }
                    
                    System.out.println();
                    playing = false;
                }
            }
        }
        
               else if(diff == 3){
            String[] words = {"Red", "Blue", "Green", "Yellow", "Purple"};
            String[] textColors = {"Red", "Blue", "Green", "Yellow", "Purple"}; 
            String[] bgColors = {"Red", "Blue", "Green", "Yellow", "Purple"};
        
            int round = 1;
            boolean playing = true;
        
            while(playing){
                String[] sequenceWords = new String[round];
                String[] sequenceTexts = new String[round];
                String[] sequenceBG = new String[round];
        
                for(int i = 0; i < round; i++){
                    String w = getColorWord();
                    sequenceWords[i] = w;
                    sequenceTexts[i] = w;
                    sequenceBG[i] = getColorWord(); 
                }
        
                System.out.println("\nRound " + round);
                System.out.println("Memorize these:");
        
                for(int i = 0; i < round; i++){
                    Colors.println(sequenceWords[i], "BRIGHT_" + sequenceTexts[i], "BG_" + sequenceBG[i]);
                }
        
                System.out.println("Get ready...");
                delay(5);
        
                for(int i = 0; i < 30; i++){
                    System.out.println();
                }
        
                int mode = (int)(Math.random() * 3);
        
                if(mode == 0){
                    System.out.println("Type the WORDS in order:");
                }
                else if(mode == 1){
                    System.out.println("Type the TEXT COLORS in order:");
                }
            else{
                System.out.println("Type the BACKGROUND COLORS in order:");
            }
    
            String[] user = new String[round];
            for(int i = 0; i < round; i++){
                user[i] = sc.nextLine();
            }
    
            boolean correct = true;
    
            for(int i = 0; i < round; i++){
                if(mode == 0){
                    if(!user[i].equals(sequenceWords[i])){
                        correct = false;
                    }
                }
                else if(mode == 1){
                    if(!user[i].equals(sequenceTexts[i])){
                        correct = false;
                    }
                }
                else{
                    if(!user[i].equals(sequenceBG[i])){
                        correct = false;
                    }
                }
            }
    
            if(correct){
                System.out.println("Correct! Next round!");
                round++;
            }
            else{
                System.out.println("GAME OVER!");
                System.out.println("Correct sequence was:");
    
                for(int i = 0; i < round; i++){
                    if(mode == 0){
                        System.out.print(sequenceWords[i] + " ");
                    }
                    else if(mode == 1){
                        System.out.print(sequenceTexts[i] + " ");
                    }
                    else{
                        System.out.print(sequenceBG[i] + " ");
                    }
                }
    
                System.out.println();
                playing = false;
            }
        }
    }
	}

    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
