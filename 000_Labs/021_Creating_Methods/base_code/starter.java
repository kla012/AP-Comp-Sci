/*
 *	Author:  Kayla Chong
 *  Date: 10/8/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		System.out.println("Write a sentence");
		Scanner sc = new Scanner(System.in);
		String sentenceA = sc.nextLine();
		toString(sentenceA);
		
		System.out.println("Write a sentence");
		String sentenceB = sc.nextLine();
		toStringCombined(sentenceB);
		
		System.out.println("This is using the methods");
		System.out.println(sentenceA);
		System.out.println(sentenceA + " " + sentenceB);
	}
	
	public static void toString(String sentenceA){
		
	}
	
	public static void toStringCombined(String sentenceB){
		
	}
	
}
