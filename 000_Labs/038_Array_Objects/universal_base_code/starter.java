/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior x[] = new Warrior[100];
		Wizard y[] = new Wizard[100];
		
		for(int i =0; i< x.length; i++){
			x[i] = new Warrior();
			y[i] = new Wizard();
		}
			
		int a = 0;
		int b = 0;
		while(true){
			x[a].attack(y[b]);
			if(y[b].isDead()){
				b++;
				if(b == 100){
					System.out.println("Warriors won with " + a + " left.");
					break;
				}
			}
			
			y[b].attack(x[a]);
			if(x[a].isDead()){
				a++;
				if(a == 100){
					System.out.println("Wizards won with " + b + " left in their army.");
					break;
				}
			}
			
		}

	}
}
