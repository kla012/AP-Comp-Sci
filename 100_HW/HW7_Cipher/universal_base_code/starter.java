/*
 *	Author: Kayla Chong
 *  Date: 10/18/24
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		/*
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a message you want to decipher: ");
		String message = sc.nextLine();
		
		String a = message;
		System.out.println("Your message encoded is: " + Cipher.encode(a));
		*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a message you want to decipher: ");
		String message = sc.nextLine();
		System.out.println("Please enter the key for the message you want to decipher: ");
		int key = sc.nextInt();
	
		String a = message;
		int b = key;
		
		System.out.println("Your message encoded is: " + Cipher.keyedEncode(message,key));
		
	}
	}
