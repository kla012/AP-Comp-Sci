/*
 *	Author: Kayla Chong
 *  Date: 11/21/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		runnerData kaitlin = new runnerData();
		kaitlin.setTime1(18.10);
		kaitlin.setTime2(16.45);
		kaitlin.setTime3(18.08);
		kaitlin.setTime4(18.19);
		kaitlin.setTime5(18.25);
		
		kaitlin.getTime1();
		kaitlin.getTime2();
		kaitlin.getTime3();
		kaitlin.getTime4();
		kaitlin.getTime5();
		
		System.out.println("The average time of CV's first girl runner is " + kaitlin.getAverage() + " minutes for their first five 3 mile race.");
		System.out.println("The total time of this runner for her first five 3 mile races was: " + kaitlin.totalTime() + " minutes");
		System.out.println("");
	
		runnerData millie = new runnerData();
		millie.setTime1(18.30);
		millie.setTime2(17.11);
		millie.setTime3(18.32);
		millie.setTime4(18.24);
		millie.setTime5(18.28);
		
		millie.getTime1();
		millie.getTime2();
		millie.getTime3();
		millie.getTime4();
		millie.getTime5();
		
		System.out.println("The average time of CV's second girl runner is " + millie.getAverage() + " minutes for their first five 3 mile race.");
		System.out.println("The total time of this runner for her first five 3 mile races was: " + millie.totalTime() + " minutes");
		System.out.println("");

		runnerData addison = new runnerData();
		addison.setTime1(19.08);
		addison.setTime2(17.52);
		addison.setTime3(19.10);
		addison.setTime4(19.06);
		addison.setTime5(19.04);
		
		addison.getTime1();
		addison.getTime2();
		addison.getTime3();
		addison.getTime4();
		addison.getTime5();
		
		System.out.println("The average time of CV's third girl runner is " + addison.getAverage() + " minutes for their first five 3 mile race.");
		System.out.println("The total time of this runner for her first five 3 mile races was: " + addison.totalTime() + " minutes");
		System.out.println("");
		
		runnerData brooklyn = new runnerData();
		brooklyn.setTime1(19.08);
		brooklyn.setTime2(18.05);
		brooklyn.setTime3(19.26);
		brooklyn.setTime4(19.36);
		brooklyn.setTime5(18.13);
		
		brooklyn.getTime1();
		brooklyn.getTime2();
		brooklyn.getTime3();
		brooklyn.getTime4();
		brooklyn.getTime5();
		
		System.out.println("The average time of CV's fourth girl runner is " + brooklyn.getAverage() + " minutes for their first five 3 mile race.");
		System.out.println("The total time of this runner for her first five 3 mile races was: " + brooklyn.totalTime() + " minutes");
		System.out.println("");

		runnerData naiya = new runnerData();
		naiya.setTime1(19.16);
		naiya.setTime2(18.24);
		naiya.setTime3(18.38);
		naiya.setTime4(19.45);
		naiya.setTime5(19.58);
		
		naiya.getTime1();
		naiya.getTime2();
		naiya.getTime3();
		naiya.getTime4();
		naiya.getTime5();
		
		System.out.println("The average time of CV's fifth girl runner is " + naiya.getAverage() + " minutes for their first five 3 mile race.");
		System.out.println("The total time of this runner for her first five 3 mile races was: " + naiya.totalTime() + " minutes");
		System.out.println("");
		
		runnerData veronica = new runnerData();
		veronica.setTime1(20.19);
		veronica.setTime2(19.01);
		veronica.setTime3(21.16);
		veronica.setTime4(20.51);
		veronica.setTime5(20.54);
		
		veronica.getTime1();
		veronica.getTime2();
		veronica.getTime3();
		veronica.getTime4();
		veronica.getTime5();
		
		System.out.println("The average time of CV's sixth girl runner is " + veronica.getAverage() + " minutes for their first five 3 mile race.");
		System.out.println("The total time of this runner for her first five 3 mile races was: " + veronica.totalTime() + " minutes");
		System.out.println("");
		
		runnerData jennie = new runnerData();
		jennie.setTime1(19.48);
		jennie.setTime2(18.31);
		jennie.setTime3(20.14);
		jennie.setTime4(20.14);
		jennie.setTime5(20.16);
		
		jennie.getTime1();
		jennie.getTime2();
		jennie.getTime3();
		jennie.getTime4();
		jennie.getTime5();
		
		System.out.println("The average time of CV's seventh girl runner is " + jennie.getAverage() + " minutes for their first five 3 mile race.");
		System.out.println("The total time of this runner for her first five 3 mile races was: " + jennie.totalTime() + " minutes");
	}
}

	
