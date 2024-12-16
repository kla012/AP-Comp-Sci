/*
 *	Author: Kayla Chong
 *  Date: 11/5/24
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] value1 = new int[1001];
			for(int a = 0; a < value1.length; a++){
			value1[a] = (a+1)*3;
			System.out.println(value1[a]);
		}
		/*
		while (a < value1.length){
			value1 [a] = (a+1)*3;
			System.out.println(value1 [a]);
			a++;
		}
		*/
	
		
		int [] value2 = new int [1001];
		int m = 0;
		int c = 1001;
		while (m < 1001){
			c--;
			value2[m] = c;
			System.out.println(value2 [m]); // formula for subtracting 1: arr2[z] = arr2.length-1-z;
			m++;
		}
	}
}
