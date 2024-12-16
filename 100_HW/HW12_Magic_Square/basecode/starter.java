/*
 *	Author: Kayla Chong
 *  Date: 11/19/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		System.out.println(CVMath.findMid(2,3,1));
		
		System.out.print("Please print how many magic squares you want to see: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CVMath.specialSquares(n);
	}
}
