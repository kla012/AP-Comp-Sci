/*
 *	Author: Kayla Chong
 *  Date: 9/24/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int a = sc.nextInt();
		
		System.out.print("Please enter another integer: "); 
		int b = sc.nextInt();
		
		if ((a%2)==0){
			System.out.println(a + " is even");
		}
		else if ((a%2)!=0){
			System.out.println(a + " is odd"); 
		}
		if ((b%2)==0){
			System.out.println(b + " is even");
		}
		else if ((b%2)!=0){
			System.out.println(b + " is odd");
		}
		if ((a%3)==0){
			System.out.println(a + " is divisible by 3");
		}
		else if ((a%3)!=0){
			System.out.println(a + " is not divisible by 3");
		}
		if ((a%4)==0){
			System.out.println(a + " is divisible by 4");
		}
		else if ((a%4)!=0){
			System.out.println(a + " is not divisible by 4");
		}
		if ((a%5)==0){
			System.out.println(a + " is divisible by 5");
		}
		else if ((a%5)!=0){
			System.out.println(a + " is not divisible by 5");
		}
		if ((b%3)==0){
			System.out.println(b + " is divisible by 3");
		}
		else if ((b%3)!=0){
			System.out.println(b + " is not divisible by 3");
		}
		if ((b%4)==0){
			System.out.println(b + " is divisible by 4");
		}
		else if ((b%4)==0){
			System.out.println(b + " is not divisible by 4");
		}
		if ((b%5)==0){
			System.out.println(b + " is divisible by 5");
		}
		else if ((b%5)!=0){
			System.out.println(b + " is not divisible by 5");
		}
	}
}
