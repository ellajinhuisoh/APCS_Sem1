/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String input = sc.nextLine();
        int numOfWords = 0;
        String input1 = input;
        while (true) {
            if (input1.indexOf(" ") == -1) {
                numOfWords++;
                break;
            }
            int space = input1.indexOf(" ");
            input1 = input1.substring(space + 1);
            numOfWords++;
        }
        String[] arr = new String[numOfWords];
        int c = 0;
        input1 = input;
        while (true) {
            if (input1.indexOf(" ") == -1) {
                arr[c] = input1;
                break;
            }
            int space = input1.indexOf(" ");
            String word = input1.substring(0, space);
            arr[c] = word;
            input1 = input1.substring(space + 1);
            c++;
        }
        String v = "AEIOUaeiou";
        for (int i = 0; i < arr.length; i++) {
            String char1 = "";
            String char2 = "";
            if(arr[i].length() > 1){
                char1 = arr[i].substring(0, 1);
                char2 = arr[i].substring(1, 2);
            }
            else{
                char1 = arr[i].substring(0, 1);
            }
            if(!v.contains(char1) && v.contains(char2)){
                arr[i] = arr[i].substring(1) + "-" + char1 + "ay";
            }
            else if(!v.contains(char1) && !v.contains(char2) && arr[i].length() > 2){
                arr[i] = arr[i].substring(2) + "-" + char1 + char2 + "ay";
            }
            else if(!v.contains(char1) && !v.contains(char2) && arr[i].length() <= 2){
                arr[i] = arr[i].substring(2) + char1 + char2 + "-ay";
            }
            else if(v.contains(char1)){
                arr[i] = arr[i] + "-way";
            }
            System.out.print(arr[i] + " ");
        }
	}
}
