/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
		System.out.println("What is your value of x?");
		int x = sc.nextInt();
		
		System.out.println("What is your value of y?");
		int y = sc.nextInt();
		
		int result = pow(x,y);
		System.out.println(x + " to the power of " + y + " is " + result);
	}
		public static int pow(int x, int y){
			int result = 1;
			while(y>0){
			result = result * x;
			y--;
		}
		return result;
		}
		}
		
		
		System.out.println(Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r"));
        System.out.println(Cipher.encode("sv8vq17r 1r q25 85rq"));
        System.out.println(Cipher.encode("q25 z5l qv wpx85s f 1r gg"));
        System.out.println(Cipher.encode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz"));
        System.out.println(Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d"));
        System.out.println(Cipher.encode("a8 1oy 92 1kx rxdj in 4"));
        System.out.println(Cipher.encode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8"));
        System.out.println(Cipher.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw"));

	}
}

Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message to encode: ");
        String message = sc.nextLine();

        System.out.print("Enter a key (0–35): ");
        int key = sc.nextInt();

        String encoded = Cipher.keyedEncode(message, key);
        System.out.println("Your encoded message: " + encoded);
    }
}