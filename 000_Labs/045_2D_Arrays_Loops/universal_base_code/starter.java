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
		System.out.println("How many rows would you like for your 2D array?");
		int rows = sc.nextInt();
		System.out.println("How many columns would you like for your 2D array?");
		int columns = sc.nextInt();
		System.out.println("--------------------------------------------");
		int [][] arr = new int[rows][columns];
		for(int x = 0; x < arr.length; x++){
			for(int y = 0; y < arr[0].length; y++){
				arr[x][y] = Math.random()*10+1;
			}
		}
		System.out.println(arr);
		System.out.println("----------------------------------------------");
		System.out.println("What row would you like to get the average of?");
		int selection = sc.nextInt();
		
		//public static row(int arr.length()){
			//double avg = 
			
		}
		BaseClass test = new BaseClass();

	
		
}
