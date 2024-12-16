/*
 *	Author:  Kayla Chong
 *  Date: 11/19/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		// BaseClass test = new BaseClass();

	System.out.println("Please enter a word:");
	Scanner sc = new Scanner(System.in);
	String word = sc.nextLine();
	
	System.out.println("\nLetter by letter:\n");
	
	int i = 0;
	int p = 0;
	
	while(i<(word.length()+1) && p<(word.length())){
		System.out.println(i + " " + word.substring(p,p+1));
		i++;
		p++;
	}

}
}
