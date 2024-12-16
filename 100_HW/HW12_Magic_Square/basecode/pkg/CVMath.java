/*
 *	Author: Kayla Chong
 *  Date: 11/19/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class CVMath {
	public static int findMid(int one, int two, int three){
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquares(int n){
		int x = 1;
		while (x<=n){
		if(isSum(x)==true && perfectSquare(x)==true){
			System.out.println(x);
		}
		x++;
	}
}	
	public static boolean perfectSquare(int x){
			if (Math.sqrt(x) == (int)(Math.sqrt(x))){
				return true;
			}
		return false; 
		}
		
	public static boolean isSum(int x){
		int b = 1;
		int sum = 0;
		while (sum<x){
			int subSum = b;
			sum = sum + subSum;
			b++;
			}
		return sum == x;
		}
	}



