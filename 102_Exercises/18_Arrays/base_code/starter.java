/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int [1001];
		 int len1=arr1.length;
		 int i=0;
		 int x =3;
		 while (i<1001){
		 	arr1[i]=x;
		 	x=x+3;
		 	i= i + 1;
		 }
		 
		 i=0;
		 while(i<arr1.length){
		 	System.out.print(arr1[i] + " ");
		 	i=i+1;
		 }
		 
		 int [] arr2 = new int [1001];
		 int i2=0;
		 int x2=1000;
		 while (i2<1001){
		 	int len2=arr2.length;
		 	arr2[i2]=x2;
		 	x2=x2-1;
		 	i2 = i2+1;
		 }
		 
		 i2=1000;
		 while(i2<arr2.length){
		 	System.out.print(arr2[i2] + " ");
		 	i2=i2+1;
		 }
		 }
	}
