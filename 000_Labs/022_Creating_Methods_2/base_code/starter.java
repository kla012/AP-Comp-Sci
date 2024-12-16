/*
 *	Author:  Kayla Chong
 *  Date: 10/8/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		System.out.println("What is your base number?");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		
		System.out.println("What is your exponent number?");
		int exponent = sc.nextInt();
		
		int power = pow(base, exponent);
		System.out.println("Your answer is: " + power);
	}
	
	public static int pow(int base, int exponent){
		int count = 0;
		int pow = 0;
		while(count<exponent || count == exponent){
			pow = base*base;
			count = count+1;
			}
		return pow;
	}
}