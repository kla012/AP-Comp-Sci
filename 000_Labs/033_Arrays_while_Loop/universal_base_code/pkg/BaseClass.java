/*
 *	Author:  Kayla Chong
 *  Date: 11/4/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int [] x;

	public BaseClass() {
		x = new int [1000];
	}

	public void printThousand(){
		int i = 0;
		while (i < 1000){
		System.out.println(x[i] = (int)(Math.random()*1000));
		i++;
		}
	}
}

