/*
 *	Author:  Kayla Chong
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to be a wizard, warrior, or a rogue? ");
		String role = sc.nextLine(); 
		
		if (role.equals("wizard")) {
			System.out.println("You will be a wiazrd!");
		}
		else if (role.equals("Wizard")) {
			System.out.println("You will be a wizard!");
		}
		else if (role.equals("warrior")) {
			System.out.println("You will be a warrior!"); 
		}
		else if (role.equals("Warrior")){
			System.out.println("You will be a warrior!"); 
		}
		else if (role.equals("rogue")){
			System.out.println("You will be a rogue!"); 
		}
		else if (role.equals("Rogue")){
			System.out.println("You will be a rogue!"); 
		}
		else{
			System.out.println("Your input is not one of the three choices.");
		}
	}
}
