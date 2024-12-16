/*
	Author: Kayla Chong
	Date: 12/5/24
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter a sentence.");
	String sentence = sc.nextLine();
	
	int a = 0; 
	int b = 1;
	
	while (sentence.length() > b){
	
		String even = sentence.substring(a, a+1);
		even = even.toLowerCase();
		
		String odd = sentence.substring(b, b+1);
		odd = odd.toUpperCase();
		
		System.out.print(even + odd);
	
		a = a + 2;
		b = b + 2;
		}
	
	int c = sentence.length();
	
		if(c%2 == 1){
		String odd2 = sentence.substring(c-1);
		odd2 = odd2.toUpperCase();
		System.out.print(odd2);
		}
	}
}

