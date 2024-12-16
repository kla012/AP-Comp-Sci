/*
 *	Author: Kayla Chong
 *  Date: 11/14/24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	Wizard [] wizards = new Wizard [100];
	for (int a = 0; a < wizards.length; a++){
		Wizard x = new Wizard("THE Wizard");
		wizards[a] = (x);
	}
	
	Warrior [] warriors = new Warrior [100];
	for (int b = 0; b < warriors.length; b++){
		Warrior y = new Warrior("THE Warrior");
		warriors[b] = (y);
	}
	
	int c = 0; //for warriors
	int d = 0; //for wizards
	
	while (c < wizards.length-1 && d < warriors.length-1){
		
		if(warriors[c].isDead()==false && wizards[d].isDead()==false){
		wizards[d].attack(warriors[c]);
		}
		
		if(warriors[c].isDead()){
			c++;
		}
		
		if(wizards[c].isDead()==false){
		warriors[c].attack(wizards[d]);
		}
		
		if(wizards[d].isDead()){
			d++;
		}
		
		if (wizards[c].isDead()){
			System.out.println("Warriors won with " + (wizards.length-d) + " fighters left.");
			break;
		}
		
		else if (warriors[d].isDead()){
			System.out.println("Wizards won with " + (warriors.length-c) + " fighters left.");
			break;
		}
	}
}
}