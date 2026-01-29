/* 
    Lecture note example - Methods
*/
import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numba 1:");
        int num1 = sc.nextInt();
        System.out.println("Numba 2:");
        int num2 = sc.nextInt();
        
        add(num1, num2);
        
        int y = square(num2);
        
        int z = absValue(num1-num2);
        System.out.print(x)
	}
	
	public static int abs(int value){
	    if(value < 0){
	        return value * (-1);
	    }
	    else{
	        return value;
	    }
	}
	
	public static int square(int a){
	    int answer = a * a;
	    return answer;
	}
	    
	    
	public static void add(int a, int b){
	    int sum = a + b;
	    System.out.println(sum);
	    return;
	}
	
}public static int total(sum)
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");