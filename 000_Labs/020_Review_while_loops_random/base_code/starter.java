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
	System.out.print("Please guess a number 1-1000: ");
	int guess = sc.nextInt();
	
	int secret = (int)Math.random()*1000;
	
	while (true){
		if(secret==guess){
			System.out.print ("You got it!");
			break;
			}
		else{
			System.out.print("guess again: ");
		}
	guess = sc.nextInt();
		}	
	}
}
