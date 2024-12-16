/*
 *	Author:  Kayla Chong
 *  Date: 9/10/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		
		int x = (int) (Math.random() * 10);
		System.out.println(x);
		
		int y = (int) (Math.random()*(100)+1);
		System.out.println(y);
		
		System.out.println(Math.random()*(1.0)+2.5);
		
		System.out.println(Math.random()*(589)+14);
	}
}
