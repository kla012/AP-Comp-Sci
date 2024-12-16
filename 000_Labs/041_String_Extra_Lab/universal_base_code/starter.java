/*
 *	Author: Kayla Chong
 *  Date: 12/2/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		System.out.println("Please enter a phrase:");
		Scanner sc = new Scanner(System.in);
		String phrase = sc.nextLine();
		
		String result = "";
		
		while(true){
			if(phrase.indexOf(" ") == -1){
				System.out.print(phrase + " ");
				break;
			}
		
		int a = phrase.indexOf(" ");
		String word = phrase.substring(0, a);
		phrase = phrase.substring(a+1);
		
		result = word + " " + result;
		
		}
		
		System.out.print(result);
	
	}
}
