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
		
	System.out.println("Please enter a pet peeve: ");
	Scanner sc = new Scanner(System.in);
	String petPeeve = sc.nextLine();
	
	String a = "Wow \nyour pet peeve is \'" + petPeeve + "\'??\nThat's crazy.\\My pet peeve is nails on a chalkboard."; 
	System.out.println(a);
	}
}
