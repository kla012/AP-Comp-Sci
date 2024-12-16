/*
 *	Author: Kayla Chong
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
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		
		System.out.println("What is your title? Ex. Wicked Warrior"); 
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a wizard, warrior, or a rogue? ");
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
		
		System.out.println();
		
		System.out.println("You have 20 skill points to spend on the following: strength, dexterity, intelligence, and charisma. Spend the points wisely.");
	
		System.out.println();
	
		System.out.print("Strength 1-10: ");
		int a = sc.nextInt();
		
		if (a>10){
			System.out.println("Please try again.");
			System.out.print("Strength 1-10: ");
			a = sc.nextInt();
		}
		
		System.out.println("You have " + (20-a) + " points left to spend");
		

		System.out.println();
		
		System.out.print("Dexterity 1-10: ");
		int b = sc.nextInt();

		if (b>10 || b>20-a){
			System.out.println("Please try again.");
			System.out.print("Dexterity 1-10: ");
			b = sc.nextInt();
		}
			System.out.println("You have " + (20-a-b) + " points left to spend"); 
		
		System.out.println();
		
		System.out.print("Intelligence 1-10: ");
		int c = sc.nextInt();
		
		if (c>10 || c>20-a-b){
			System.out.println("Please try again");
			System.out.print("Intelligence 1-10: "); 
			c = sc.nextInt();
		}
			System.out.println("You have " + (20-a-b-c) + " points left to spend");
		
		System.out.println();
		
		System.out.print("Charisma 1-10: "); 
		int d = sc.nextInt();
		
		if (d>10 || d>20-a-b-c){
			System.out.println("Please try again");
			System.out.print("Charisma 1-10: ");
			d = sc.nextInt();
		}
		
		System.out.println();
		
		if(a+b+c+d<20){
			System.out.println("You have " + (20-(a+b+c+d)) + " points left overall");
		}
		
		System.out.println();
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You are " + role + " with the following stats!");
		System.out.println("Strength - " + a); 
		System.out.println("Dexterity - " + b); 
		System.out.println("Intelligence - " + c);
		System.out.println("Charisma - " + d);
		
		System.out.println();
		System.out.println("Good luck on your quest, " + name + "!");
	}
}
