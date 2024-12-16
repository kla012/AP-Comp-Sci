/*
 *	Author: Kayla Chong
 *  Date: 10/16/24
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
		role = "Wizard";
		strength = 4;
		dexterity = 5;
		intelligence = 3;
		charisma = 8; 
	}
	
	public myCharacter (String n, int s, int d, int i, int c){
		role = n;
		strength = s;
		dexterity = d;
		intelligence = i;
		charisma = c;
	}
	
	public String getInfo(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma is " + charisma);
		return role;
	}

}


