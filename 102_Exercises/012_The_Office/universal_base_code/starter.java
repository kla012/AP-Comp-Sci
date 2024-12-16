/*
 *	Author: Kayla Chong
 *  Date: 10/22/24
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
		dwight.raiseSalary(10);
		dwight.employeeToString();
		System.out.println("This is Dwight's annual salary: " + dwight.getAnnualSalary());
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(13);
		jim.employeeToString();
		System.out.println("This is Jim's annual salary: " + jim.getAnnualSalary());
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.raiseSalary(22);
		pam.employeeToString();
		System.out.println("This is Pam's annual salary: " + pam.getAnnualSalary());
		
		Employee david = new Employee (2101, "David", "Bank", 1455.23);
		david.raiseSalary(32);
		david.employeeToString();
		System.out.println("This is David's annual salary: " + david.getAnnualSalary());
		
		
	}
}
