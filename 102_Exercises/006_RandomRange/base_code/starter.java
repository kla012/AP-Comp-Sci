/*
 *	Author: Kayla Chong
 *  Date: 9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random; 

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Enter 2 numbers to create a range for you random number");
		
		System.out.print("Please enter a number: ");
		int x = sc.nextInt();
		
		System.out.print("Please enter another number that's bigger than the first: "); 
		int y = sc.nextInt();
		
		System.out.println("Your range is " + x + " to " + y + ".");
		
		System.out.println("Here are 5 number generated in that range: ");
		
		int z = (int)(Math.random()*(y-x)+x);
		System.out.print(z + ", ");
		
		int a = (int)(Math.random()*(y-x)+x);
		System.out.print(a + ", ");
		
		int b = (int)(Math.random()*(y-x)+x);
		System.out.print(b + ", ");
		
		int c = (int)(Math.random()*(y-x)+x);
		System.out.print(c + ", ");
		
		int d = (int)(Math.random()*(y-x)+x);
		System.out.print(d + ", ");
		
	
		
	}
}
