/*
 *	Author: Kayla Chong
 *  Date: 10/1/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		int mon = 100;
		
		while(true){
		System.out.print("Would you like to play the slots? (yes/Yes/y/Y) : ");
		String a = sc.nextLine();
		
		if(a.equals("yes") || a.equals("Yes") || a.equals("y") || a.equals("Y")){
			System.out.print("You have $" + mon + ". How much would you like to wager? ");
		}
		
		else if(a.equals("no") || a.equals("No") || a.equals("n") || a.equals("N")){
			System.out.print("Sad to see you go! You have $" + mon + " left.");
		}
		
		int b = sc.nextInt();
		sc.nextLine();
	
		if (b>100 || b>mon || b<0){
			System.out.print("You entered an invalid wager. Please start over.");
			sc.nextInt();
			break;
			}	
		
		System.out.println("");
		System.out.println("Great! Let's play!");
		System.out.println("Your rolls are: ");
		System.out.println("");
	
		System.out.println("________________________");
		int x = (int)(Math.random()*100+1);
		System.out.print("| " + x + " | ");
		int y = (int)(Math.random()*100+1);
		System.out.print(y + " | ");
		int z = (int)(Math.random()*100+1);
		System.out.println(z + " | ");
		System.out.println("________________________");
		System.out.println("");
		
		if (x!=y || x!=z || y!=z){
			System.out.println("Didn't win this time, better luck next time!");
			mon = (mon - b);
			System.out.println("You now have $" + mon);
			System.out.println("");
		}
		if (x == y || x == z || y == z){
			System.out.println ("You won! Your wager has now doubled!");
			mon = (mon-b) + (b*2);
			System.out.println("You now have $" + mon);
			System.out.println("");
			
			break;
		}
		if (x == y && y == z && x ==z){
			System.out.println("Jackpot!! Your wager has now tripled!");
			mon = (mon-b) + (b*3);
			System.out.println("You now have $" + mon);
			System.out.println("");
		}
		if (mon==0){
			System.out.println("You've run out of money. The game is over. Thanks for playing!");
			System.out.print("");
			
			break;
		}
		}
	}
}
