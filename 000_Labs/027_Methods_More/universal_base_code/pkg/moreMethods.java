/*
 *	Author:  Kayla Chong
 *  Date: 10/22/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class moreMethods {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	boolean all;

	public moreMethods(String r, int s, int d, int i, int c, boolean all){
		role = r;
		strength = s;
		dexterity = d;
		intelligence = i;
		charisma = c;
		all = all;
	}
	
	public String setRole (String r){
		role = r;
		return r;
	}
	
	public int setStrength(int s){
		if (s > 0){
		strength = s;
		}
		else if (s<0){
			strength = 0;
		}
		return s;
	}
	
	public int setDexterity(int d){
		dexterity = d;
		return d;
	}
	
	public int setIntelligence(int i){
		intelligence = i;
		return i;
	}
	
	public int setCharisma(int c){
		charisma = c;
		return c;
	}
	
	public boolean setAll(String r, int s, int d, int i, int c){
		all = true;
		return true;
	}
	
	public void myToString(){
	System.out.println("Your role is " + role);
	System.out.println("Your strength is " + strength);
	System.out.println("Your dexterity is " + dexterity);
	System.out.println("Your intelligence is " + intelligence);
	System.out.println("Your charisma is " + charisma);
	
	System.out.println();
	System.out.println("----------------------------------------");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("What class would you like to be?");
	String name = sc.nextLine();
	if(name.equals("Wizard")){
			System.out.println("You will be a Wizard!");
		}
		else if(name.equals("wizard")){
			System.out.println("You will be a wizard!");
		}
		else if (name.equals("Warrior")){
			System.out.println("You will be a Warrior!");
		}
		else if (name.equals("warrior")){
			System.out.println("You will be a warrior!");
		}
		else if (name.equals("Rogue")){
			System.out.println("You will be a Rogue!");
		}
		else if (name.equals("rogue")){
			System.out.println("You will be a rogue!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
	
	System.out.println("You're " + name);
	System.out.println("Your strength is " + strength);
	System.out.println("Your dexterity is " + dexterity);
	System.out.println("Your intelligence is " + intelligence);
	System.out.println("Your charisma is " + charisma);
	return;
	}
}
