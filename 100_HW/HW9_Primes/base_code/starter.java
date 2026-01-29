/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input a number and we'll print out every prime until that number: ");
	int input = sc.nextInt();
	
	printPrimes(input);
	
	sc.close();
	
	}

public static boolean checkPrime(int num){
	int i=2;
	while(i<num){
		if(num%i==0){
			return false;
		}
		i++;
	}
	return true;
}

public static void printPrimes(int limit){
	int n=2;
	while(n<limit){
		if (checkPrime(n)){
			System.out.println(n);
		}
		n++;
	}
}
}