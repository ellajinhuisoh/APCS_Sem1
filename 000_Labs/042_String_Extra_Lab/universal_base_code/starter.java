/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence!");
		String sentence = sc.nextLine();	
		String sum = (" ");
		while(sentence.indexOf(" ")!= -1){
			String word = sentence.substring(0, sentence.indexOf(" "));
			sentence = sentence.substring(sentence.indexOf(" ")+1);	
			sum = word + " " + sum;	
		}
			System.out.println(sentence + " " + sum);
		BaseClass test = new BaseClass();


		
	}
}
