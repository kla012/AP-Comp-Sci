/*
 *	Author:  Kayla Chong
 *  Date: 10/28/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf(randName(), 10);
		PooleDwarf test2 = new PooleDwarf(randName(), 9);
		PooleDwarf test3 = new PooleDwarf(randName(), 8);
		PooleDwarf test4  = new PooleDwarf(randName(), 7);
		PooleDwarf test5  = new PooleDwarf(randName(), 6);
		PooleDwarf test6  = new PooleDwarf(randName(), 5);
		PooleDwarf test7  = new PooleDwarf(randName(), 4);
		
		String a = test.getName();
		String b = test2.getName();
		String c = test3.getName();
		String d = test4.getName();
		String e = test5.getName();
		String f = test6.getName();
		String g = test7.getName();
		
		int duplicates = 0;
		
		while (duplicates>=0 && duplicates<7){
		if (test.isSameName(b)){
			duplicates++;
		}
		if (test.isSameName(c)){
			duplicates++;
		}
		if (test.isSameName(d)){
			duplicates++;
		}
		if (test.isSameName(e)){
			duplicates++;
		}
		if (test.isSameName(f)){
			duplicates++;
		}
		if (test.isSameName(g)){
			duplicates++;
		}
	}
	int	sum = duplicates;
	System.out.println(a + " was the name with " + sum + " match(es)!");
}
}

