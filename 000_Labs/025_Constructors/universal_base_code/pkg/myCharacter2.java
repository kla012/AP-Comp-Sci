/*
 *	Author:  Kayla Chong
 *  Date: 10/16/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter2 {
	String role; 
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public myCharacter2() {
		role = "No role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public myCharacter2 (String r){
		role = r;
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
		
	public void printEmptyRole(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma is " + charisma);
	}
	public void printRole(){
		System.out.println();
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("What class would you like to be?");
		String r = sc.nextLine();
		
		if(r.equals("Wizard")){
			System.out.println("You will be a Wizard!");
		}
		else if(r.equals("wizard")){
			System.out.println("You will be a wizard!");
		}
		else if (r.equals("Warrior")){
			System.out.println("You will be a Warrior!");
		}
		else if (r.equals("warrior")){
			System.out.println("You will be a warrior!");
		}
		else if (r.equals("Rogue")){
			System.out.println("You will be a Rogue!");
		}
		else if (r.equals("rogue")){
			System.out.println("You will be a rogue!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma is " + charisma);
	}
}


