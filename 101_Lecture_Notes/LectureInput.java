/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        double item1Price = 2.02;
        double item2Price = 3.03;
        double item3Price = 90.99;
        
        System.out.println("🍨 Welcome to Ella's Ice Cream Store!🍨");
        System.out.println("Here's our menu:");
        System.out.println("1. 🍫 Chocolate Ice Cream - $" + item1Price);
        System.out.println("2. 🍫🍫 Double Chocolate Ice Cream - $" + item2Price);
        System.out.println("3. 🍫🍫🍫 Ultimate Decadency Triple Chocolate Ice Cream - $" + item3Price);
        
        System.out.println("What's the name for your order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many Chocolate Ice Creams would you like?");
        int quantity1=sc.nextInt();
        System.out.println("How many Double Chocolate Ice Creams would you like?");
        int quantity2=sc.nextInt();
        System.out.println("How many Ultimate Decadency Triple Chocolate Ice Creams would you like?");
        int quantity3=sc.nextInt();
        
        double total1 = item1Price * quantity1;
        double total2 = item2Price * quantity2;
        double total3 = item3Price * quantity3;
        double total = total1 + total2 + total3;
        
        System.out.println();
        System.out.println("Your current total is: $" + total);
        System.out.println("What percent would you like to tip?");
        double tipPercent = sc.nextDouble();
        double tip = total * (tipPercent/100);
        
        double grandTotal = tip + total;
        
        System.out.println("-------------------");
        System.out.println("🧾" + name + "'s Receipt:");
        System.out.println(quantity1 + "x 🍫 Chocolate Ice Cream = " + total1);
        System.out.println(quantity2 + "x 🍫🍫 Double Chocolate Ice Cream = " + total2);
        System.out.println(quantity3 + "x 🍫🍫 Ultimate Decadency Triple Chocolate Ice Cream = " + total3);
        
        System.out.println("Tip" + "(" + tipPercent + ") = " + tip);
        System.out.println("-------------------");
        
        System.out.println("Grand Total = " + grandTotal);
        System.out.println("-------------------");
        System.out.println("Thanks for dining at Ella's Ice Cream Store!");
        
	}
}
