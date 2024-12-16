/*
 *	Author: Kayla Chong
 *  Date: 9/19/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Please enter a number: "); 
		int a = sc.nextInt(); 
		
		System.out.print("Please enter another number: "); 
		int b = sc.nextInt();
		
		System.out.print("Please enter another number: "); 
		int c = sc.nextInt(); 
		
		if(a>b && a>c){
			System.out.println(a + " is your largest number"); 
		}
		else if(b>c && b>a){
			System.out.println(b + " is your largest number");
		}
		else if(c>a && c>b){
			System.out.println(c + " is your largest number");
		}
		else{
			System.out.println("There is no largest number");
		}
		
		if(a<b && a<c){
			System.out.println(a + " is your smallest number"); 
		}
		else if(b<c && b<a){
			System.out.println(b + " is your smallest number"); 
		}
		else if(c<a && c<b){
			System.out.println(c + " is your smallest number");
		}
		else{
			System.out.println("There is no smallest number");
		}
	}
}


