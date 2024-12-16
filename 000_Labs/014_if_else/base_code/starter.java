/*
 *	Author: Kayla Chong
 *  Date: 9/23/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		
		int a = (int)(Math.random()*(1000)+1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please guess a number 1-1000: ");
		int b = sc.nextInt();

		
		if(a==b){
			System.out.println("you are correct!");
		}
		
		else{
			System.out.println("guess again!");
		}
	}
}
