/*
 *	Author: Kayla Chong
 *  Date: 11/12/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		int [] x = new int [100];
		for (int i = 0; i < x.length; i++){
			x[i] = (int)(Math.random()*100+1);
		}
		toStringArray(x);
		int y = 0; 
		y = getArrayAverage(x);
		int z = 0;
		z = getArrayMax(x);
		int h = 0;
		h = getArrayMin(x);
		
	

	}
	
	public static void toStringArray(int[] x){
	for (int a = 0; a < x.length; a++){
	System.out.print(x[a] + " ");
		}
	System.out.println("");
	}
	
	public static int getArrayAverage(int[] x){
		int b = 0; 
		int sum = 0;
		while (b < x.length){
			int average = x[b];
			b++;
			sum = sum + (average/x.length);
		}
		System.out.println("The average of all the numbers is: " + sum);
		return sum; 
	}
	
	public static int getArrayMax(int[] x){
		int min = Integer.MAX_VALUE;
		for (int c = 0; c < x.length; c++){
			if(x[c] < min){
				min = x[c];
			}
		}
		System.out.println("The minimum of all the numbers is: " + min);
		return min;
	}
	
	public static int getArrayMin(int[] x){
		int max = Integer.MIN_VALUE;
		for (int d = 0; d < x.length; d++){
			if (x[d] > max){
				max = x[d];
			}
		}
		System.out.println("The maximum of all the numbers is: " + max);
		return max;
	}
	
}


