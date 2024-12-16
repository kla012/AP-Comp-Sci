/*
 *	Author: Kayla Chong
 *  Date: 10/8/24
*/

import java.util.Scanner;

class starter {
		
	public static boolean checkPrime(int a){
		int count = 2;
		while(count < a && count > 1){
			if ((a%count)==0){
			return false;
			}
			count++;
		}
		return true;
}
	public static void printPrimes(int a){
			while (a>1){
				if((checkPrime(a)==true)){
				System.out.println(a);
			}
			a--;
		}
}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely.");
		
		System.out.print("Input a number and we'll print out every prime until that number: ");
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		
		int a = number;
		printPrimes(a);
		
	}
}
