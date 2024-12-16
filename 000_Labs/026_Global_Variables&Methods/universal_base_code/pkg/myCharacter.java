/*
 *	Author:  Kayla Chong
 *  Date: 10/22/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role; 
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public myCharacter() {
		role = "No role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public myCharacter (String a){
		role = a;
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
		
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma is " + charisma);
		
		System.out.println();
		System.out.println("----------------------------------------");
	}
}

