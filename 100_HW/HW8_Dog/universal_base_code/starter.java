/*
 *	Author: Kayla Chong
 *  Date: 10/22/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Dog first = new Dog();
			first.setName("Mochi");
			first.setAge(3);

		Dog second = new Dog();
			second.getName();
			second.getBreed();
			
		if(first.isSleeping() == false){
			first.bark();
			if(second.isSleeping() == false){
				second.bark();
			}
			else{
			}
		}
		
		if(second.isSleeping()){
			second.bark();
		}
		else{
		}
	}
}	
