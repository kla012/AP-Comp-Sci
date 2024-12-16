/*
 *	Author: Kayla Chong
 *  Date: 9/17/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely.");
		
		Scanner sc = new Scanner(System.in); 
		String zero = new String ("Sunday");
		String one = new String ("Monday");
		String two = new String ("Tuesday");
		String three = new String ("Wednesday");
		String four = new String ("Thursday");
		String five = new String ("Friday");
		String six = new String ("Friday");
		String seven = new String ("Saturday");
		
		System.out.println("What day is it today?");
		String day = sc.nextLine();
		
		if((day).equals("Sunday")){
		System.out.println("Wake up! It's 10am!");
		}
		else if((day).equals("Saturday")){
		System.out.println("Wake up! It's 10am!");
		}
		else if ((day).equals("Monday")){
		System.out.println("Wake up! It's 7am!");
		}
		else if ((day).equals("Tuesday")){
		System.out.println("Wake up! It's 7am!");
		}
		else if ((day).equals("Wednesday")){
		System.out.println("Wake up! It's 7am!");
		}
		else if ((day).equals("Thursday")){
		System.out.println("Wake up! It's 7am!");
		}
		else if ((day).equals("Friday")){
		System.out.println("Wake up! It's 7am!");
		}
	}
}
