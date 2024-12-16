/*
 *	Author:  Kayla Chong
 *  Date: 9/26/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter your name: ");
	String name = sc.nextLine();
	
	System.out.print("How many times would you like your name printed? ");
	int times = sc.nextInt();
	
	int count = 0;
	while(count<times){
		System.out.println(name);
		count=count+1;
		}
	}
}
