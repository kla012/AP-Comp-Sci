/*
 *	Author:  Kayla Chong
 *  Date: 9/17/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int a = sc.nextInt();
		
		System.out.println("Please enter another number: ");
		int b = sc.nextInt();
		
		if(a!=b){
		System.out.println("Your numbers are different! ");
		}
		
		else{
			System.out.println("Your numbers are the same");
		}
	}
}
