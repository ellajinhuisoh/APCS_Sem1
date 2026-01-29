/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter {
	
    public static String randName() {
        int rand = (int)(Math.random() * 7);
        if (rand == 0) return "Dopey";
        else if (rand == 1) return "Bashful";
        else if (rand == 2) return "Grumpy";
        else if (rand == 3) return "Sleepy";
        else if (rand == 4) return "Sneezy";
        else if (rand == 5) return "Happy";
        else return "Doc";
    }

    public static void main(String[] args) {
        PooleDwarf[] dwarfs = new PooleDwarf[7];

        for (int i = 0; i < 7; i++) {
            String name = randName();
            int age = (int)(Math.random() * 200) + 50; 
            dwarfs[i] = new PooleDwarf(name, age);
        }

        String firstName = dwarfs[0].getName();
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (dwarfs[i].isSameName(firstName)) {
                count++;
            }
        }
        System.out.println(firstName + " was the name with " + count + " matches!");
    }
}
