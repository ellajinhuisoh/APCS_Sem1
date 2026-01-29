/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {

	int[] arr = new int[20];
	for (int i = 0; i < arr.length; i++){
		arr[i] = (int)(Math.random()*10)+1;
	}
	System.out.println("array:");
	for (int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + " ");
	}
	
	int targetnumber = (int)(Math.random() * 10) + 1;
	System.out.println("Target number: " + targetnumber);
	int duplicate = 0;
	
	System.out.print("Index with target number: ");
	for (int i =0; i< arr.length; i++){
		if (arr[i] == targetnumber){
			System.out.print(i+" ");
			duplicate++;
		}
	}
	System.out.println("Total duplicates: " + duplicate);
	System.out.println();
	
	System.out.println("Consective duplicates: ");
	
	boolean consecutive = false;
	for (int i = 0; i< arr.length - 1; i++){
		if(arr[i] == arr[i+1]){
			System.out.println("Value " + arr[i] + " at indexes " + i + " and " + (i+1));
			consecutive = true;
	}
	}
}
}
