/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

       Scanner sc = new Scanner(System.in);
       System.out.println("What is the name of your dog?");
       String name1 = sc.nextLine();
       
       System.out.println("What age is " + name1 + "?");
       int age1 = sc.nextInt();
       
       Dog dog1 = new Dog(name1);
       dog1.setAge(age1);
       
       Dog dog2 = new Dog("Brown", "Pug");

        boolean dog1Sleeping = dog1.isSleeping();
        boolean dog2Sleeping = dog2.isSleeping();
        boolean dog1Barked = false;

        if (dog1Sleeping) {
            System.out.println(dog1.getName() + " is asleep.");
        } else {
            dog1.bark();
            dog1Barked = true;
        }

        if (dog2Sleeping) {
            System.out.println(dog2.getName() + " is asleep.");
            if (dog1Barked) {
                dog2.bark();
            }
        } else {
            if (dog1Barked) {
                dog2.bark();
            } else {
                System.out.println(dog2.getName() + " does nothing.");
            }
        }
    }
}
