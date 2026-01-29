/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int size = (int)(Math.random()*150)+51;
		int[] arr = new int[size];
		
		for (int i = 0; i<arr.length;i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
			sum += arr[i];
		}
		double average = (double) sum/arr.length;
		
		System.out.println("Elements: " + arr.length);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + average);

		
	}
}
