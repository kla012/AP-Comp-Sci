/*
	Author: Kayla Chong
	Date: 10/28/24
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Spiderman first = new Spiderman();
		System.out.println("Default Spiderman's name is: " + first.getActor());
		System.out.println("Default Spiderman's age is: " + first.getAge());
		System.out.println("Default Spiderman's villain is: " + first.getVillain());
		first.fight();
		System.out.println("");
		
		Spiderman tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		System.out.println("Spiderman 1's name is: " + tobey.getActor());
		System.out.println("Spiderman 1's age is: " + tobey.getAge());
		System.out.println("Spiderman 1's villain is: " + tobey.getVillain());
		tobey.fight();
		System.out.println("");

		
		Spiderman andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		System.out.println("Spiderman 2's name is: " + andrew.getActor());
		System.out.println("Spiderman 2's age is: " + andrew.getAge());
		System.out.println("Spiderman 2's villain is: " + andrew.getVillain());
		andrew.fight();
		System.out.println("");
			
		Spiderman tom = new Spiderman("Tom Holland", 27, "The Vulture");
		System.out.println("Spiderman 3's name is: " + tom.getActor());
		System.out.println("Spiderman 3's age is: " + tom.getAge());
		System.out.println("Spiderman 3's villain is: " + tom.getVillain());
		tom.fight();
		System.out.println("");
		tom.printArt();
	}
}
