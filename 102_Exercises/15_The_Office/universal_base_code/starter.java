/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(100);
		dwight.employeeToString();
		System.out.println("Annual Salary: "+dwight.getAnnualSalary());
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(60);
		jim.employeeToString();
		System.out.println("Annual Salary: "+jim.getAnnualSalary());
		
		Employee pam = new Employee(2011, "Pam", "Beesley", 2250.00);
		pam.raiseSalary(1000);
		pam.employeeToString();
		System.out.println("Annual Salary: "+pam.getAnnualSalary());
		
		Employee alena = new Employee(1589, "Alena", "Kim", 1000000);
		alena.raiseSalary(1000);
		alena.employeeToString();
		System.out.println("Annual Salary: "+alena.getAnnualSalary());
	}
		
}
