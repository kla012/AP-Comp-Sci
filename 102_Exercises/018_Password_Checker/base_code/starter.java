import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        
        int x = 0;
        int a = 0;
        int sum = 0;
        while(a < passwords.length){
		    if(passwords[x].length() >= 8){
		    sum = sum + 1;
		    }
		 x++;
		 a++;
        }
        System.out.println("There are " + sum + " passwords of strength 1 with 8 or more characters.");
        
        int b = 0;
        int y = 0;
        int sum2 = 0;
        while (b < passwords.length){
            if(passwords[y].contains("!") || passwords[y].contains("@") || passwords[y].contains("#") || passwords[y].contains("$") || passwords[y].contains("%") || passwords[y].contains("^") || passwords[y].contains("&") || passwords[y].contains("*")){
            sum2 = sum2 + 1;
            }
        y++;
        b++;
        }
        System.out.println("There are " + sum2 + " passwords of strength 2 with a special symbol.");
        
        int c = 0;
        int z = 0;
        int sum3 = 0;
        while (c < passwords.length){
            if(passwords[z].length() >= 8 && (passwords[z].contains("!") || passwords[z].contains("@") || passwords[z].contains("#") || passwords[z].contains("$") || passwords[z].contains("%") || passwords[z].contains("^") || passwords[z].contains("&") || passwords[z].contains("*"))){
            sum3 = sum3 + 1;
            }
        c++;
        z++;
        }
        System.out.println("There are " +  sum3 + " passwords of strength 3 with both strength 1 and 2.");
        
        int total = passwords.length - (sum+sum2+sum3);
        System.out.println("There are " + total + " passwords with no strength");
		
	}
}
