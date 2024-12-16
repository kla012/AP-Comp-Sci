/*
 *	Author:  Kayla Chong
 *  Date: 11/19/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		// BaseClass test = new BaseClass();
		
	System.out.println("Please enter a first and last name with a space in between: ");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	
	int a = name.indexOf(" ");
	System.out.println(name.substring(a+1));
	}
}
