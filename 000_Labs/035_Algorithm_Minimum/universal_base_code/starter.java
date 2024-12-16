/*
 *	Author:  Kayla Chong
 *  Date:  11/5/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x = (int)((Math.random()*149)+51);
		int [] a = new int [x];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		System.out.println("Number of Elements: " + x);
		
		int count = 0;
		double sum = 0.0;
		
		for(int i = 0; i < a.length; i++){
			a[i] = (int)((Math.random()*100)+1);
		while (count<a.length){
			sum = sum+(a[i]);
			count++;
		}
		}
		int finalAverage = sum/x;
		
		System.out.println("Average: " + finalAverage);

		
		for (int b = 0; b < a.length; b++){
			if(a[b] < min){
				min = a[b];
			}
		}
	System.out.println("Minimum: " + min);
		
		for (int c = 0; c < a.length; c++){
			if (a[c] > max){
				max = a[c];
			}
		}
	System.out.println("Maximum: " + max);
	}
}
