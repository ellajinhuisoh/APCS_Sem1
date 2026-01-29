package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;
	int age;		
	String villain;
	
	
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int b){
		actor = "unknown";
		age = b;
		villain = "unknown";
	}
	
	public Spiderman(String a, int b){
		actor = a;
		age = b;
		villain = "unknown";
	}
	
	public Spiderman(String a, int b, String v){
		actor = a;
		age = b;
		villain = v;
	}

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	

	public class setActor{
		String Actor;
		
		public String setActor(){
			return Actor;
		}
	}
	public class getActor{
		String Actor;
		
		public void getActor(String a){
			Actor = a;
		}
	}
	
	public class setAge{
		int Age;
		
		public int setAge(){
			return Age;
		}
	}
	public class getAge{
		int Age;
		
		public void getAge(int b){
			Age = b;
		}
	}
	
	public class setVillain{
		String Villain;
		
		public String setVillain(){
			return Villain;
		}
	}
	
	public class getVillain{
		String Villain;
		
		public void getVillain(String v){
			Villain = v;
		}
	}
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
	
	public void SpidermanToString(){					// Prints all values of the Employee	
		System.out.println("------------------------------");
		System.out.println("Spiderman Actor: " + actor);
		System.out.println("Spiderman Age: " + age);
		System.out.println("Spiderman Villain: " + villain);
		System.out.println("------------------------------");
		System.out.println("");
}
}
