/*
 *	Author: Kayla Chong
 *  Date: 11/5/24
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		System.out.print("Here are the 20 numbers: ");
		int a = 0; 
		while (a < arr.length){
			int value = ((int)(Math.random()*10+1));
			arr[a] = value;
			System.out.print(arr[a] + " ");
			a++;
		}
		
		int target = (int)(Math.random()*10+1);
		System.out.println(" ");
		System.out.println("The random number to look for is " + target);
		
		System.out.println(" ");
		
		int b = 0;
		int sum = 0;
		int duplicates = 0;
		while (b < arr.length){
			if (target == arr[b]){
				System.out.println("Duplicate found at index " + b);
				sum++;
				System.out.println("Total number of duplicates for " + target + " is " + sum);
			}
			b++;
		}
		
		System.out.println(" ");
		
		System.out.println("Looking for two in a row: ");
		
		int c = 0;
		while (c < (arr.length-1)){
			if(arr[c] == arr[(c+1)]){
				System.out.println("Two in a row found at indexes " + c + " and " + (c+1) + ". The number is " + arr[c]); 
			}
		c++;
		}
	}
	
}

