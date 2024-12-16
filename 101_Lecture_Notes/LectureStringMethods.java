/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/
import java.util.*;

class LectureStringMethods{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter a sentence");
        String sentence = sc.nextLine();
        
        int space1 = sentence.indexOf(" "); // gets the very first space
        String firstWord = sentence.substring(0, space1); // gets the first word
        
        int space2 = sentence.indexOf(" ", space1+1); // gets the second space by looking for a space after the very first space
        String secondWord = sentence.substring (space1+1, space2); // gets the second word
        
      //  System.out.println(firstWord);
      //  System.out.println(secondWord);
      
        while(true){
            if(sentence.indexOf(" ") == -1){
                System.out.println(sentence); // at this point, sentence = the last word since we've been cutting off the other words
                break;
            }  
        int space = sentence.indexOf(" ");
        String word = sentence.substring(0, space);
        sentence = sentence.substring(space+1); // cuts off the first word after it is found
        System.out.println(word);
        }
        
	}
}