/*
 *	Author:  Kayla Chong
 *  Date: 9/10/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
	
		int x = (13 - 6 * 11);
		int y = (30 % 7 * (-2));
		int z = Math.max(x,y);
		System.out.println(z);
		
		int a = (3 * 8 + 31 % 7);
		double b = Math.sqrt(a);
		System.out.println(b);
		
		int c = (37 / 3);
		int d = (35 % 21);
		double e = Math.pow(c,d);
		System.out.println(e);
		
		int f = (2);
		int g = (14%3);
		double h = Math.pow(f,g);
		int i = (2*6);
		double j = Math.sqrt(i);
		double k = Math.max (h,j);
		System.out.println(k);
		
		//Lab 009 Extra
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a decimal number: ");
		double num1 = sc.nextDouble();
		System.out.println("Please enter another decimal number: ");
		double num2 = sc.nextDouble();
		
		double l = (num1);
		double m = (num2);
		double n = Math.max(l,m);
		System.out.println("Here is the max of the two values: " + n);
		
		double o = Math.sqrt(m);
		System.out.println("Here is the square root of your second number " + o);
		
		double p = Math.pow(l,m);
		System.out.println("Here is the value of your first nubmer to the power of your second number: " + p);
	}
}
