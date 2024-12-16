/*
   * Author: Kayla Chong
   * Date: 12/3/24
   * Collaborator(s):
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String sentence = sc.nextLine();
		
		while (true){
			
			String first = sentence.substring(0,1);
			String second = sentence.substring(1,2);
			
			if(sentence.indexOf(" ") == -1){
				
			if ((first.contains("b") || first.contains("c")|| first.contains("d") || first.contains("f") || first.contains("g") || first.contains("h") || first.contains("j") || first.contains("k") || first.contains("l") || first.contains("m") || first.contains("n") || first.contains("p") || first.contains("q") || first.contains("r") || first.contains("s") || first.contains("t") || first.contains("v") || first.contains("x") || first.contains("y") || first.contains("z")) && (second.contains("a") || second.contains("e") || second.contains("i") || second.contains("o") || second.contains("u"))){
				sentence = sentence.substring(1) + "-" + sentence.substring(0,1) + "ay";
				System.out.print(sentence + " ");
			}
			
			if ((first.contains("b") || first.contains("c") || first.contains("d") || first.contains("f") || first.contains("g") || first.contains("h") || first.contains("j") || first.contains("k") || first.contains("l") || first.contains("m") || first.contains("n") || first.contains("p") || first.contains("q") || first.contains("r") || first.contains("s") || first.contains("t") || first.contains("v") || first.contains("x") || first.contains("y") || first.contains("z")) && (second.contains("b") || second.contains("c") || second.contains("d") || second.contains("f") || second.contains("g") || second.contains("h") || second.contains("j") || second.contains("k") || second.contains("l") || second.contains("m") || second.contains("n") || second.contains("p") || second.contains("q") || second.contains("r") || second.contains("s") || second.contains("t") || second.contains("v") || second.contains("x") || second.contains("y") || second.contains("z"))){
				sentence = "-" + sentence.substring(0,2) + "ay";
				System.out.print(sentence + " ");
			}
			
			if (first.contains("a") || first.contains("e") || first.contains("i") || first.contains("o") || first.contains("u")){
				sentence = sentence + "-way";
				System.out.print(sentence + " ");
				}
					break;
				}
				
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			String firstLetter = word.substring(0,1);
			String secondLetter = word.substring (1,2);
			String firstAndSecond = word.substring(0,2);
			
			String newWord1 = word;
			String newWord2 = word;
			String newWord3 = word;
			String newWord4 = word;
			
			
		

		if ((firstLetter.contains("b") || firstLetter.contains("c")|| firstLetter.contains("d") || firstLetter.contains("f") || firstLetter.contains("g") || firstLetter.contains("h") || firstLetter.contains("j") || firstLetter.contains("k") || firstLetter.contains("l") || firstLetter.contains("m") || firstLetter.contains("n") || firstLetter.contains("p") || firstLetter.contains("q") || firstLetter.contains("r") || firstLetter.contains("s") || firstLetter.contains("t") || firstLetter.contains("v") || firstLetter.contains("x") || firstLetter.contains("y") || firstLetter.contains("z")) && (secondLetter.contains("a") || secondLetter.contains("e") || secondLetter.contains("i") || secondLetter.contains("o") || secondLetter.contains("u"))){
			newWord1 = word.substring(1) + "-" + word.substring(0,1) + "ay";
			System.out.print(newWord1 + " ");
		}
		
		if ((firstLetter.contains("b") || firstLetter.contains("c") || firstLetter.contains("d") || firstLetter.contains("f") || firstLetter.contains("g") || firstLetter.contains("h") || firstLetter.contains("j") || firstLetter.contains("k") || firstLetter.contains("l") || firstLetter.contains("m") || firstLetter.contains("n") || firstLetter.contains("p") || firstLetter.contains("q") || firstLetter.contains("r") || firstLetter.contains("s") || firstLetter.contains("t") || firstLetter.contains("v") || firstLetter.contains("x") || firstLetter.contains("y") || firstLetter.contains("z")) && (secondLetter.contains("b") || secondLetter.contains("c") || secondLetter.contains("d") || secondLetter.contains("f") || secondLetter.contains("g") || secondLetter.contains("h") || secondLetter.contains("j") || secondLetter.contains("k") || secondLetter.contains("l") || secondLetter.contains("m") || secondLetter.contains("n") || secondLetter.contains("p") || secondLetter.contains("q") || secondLetter.contains("r") || secondLetter.contains("s") || secondLetter.contains("t") || secondLetter.contains("v") || secondLetter.contains("x") || secondLetter.contains("y") || secondLetter.contains("z"))){
			newWord2 = "-" + word.substring(0,2) + "ay";
			System.out.print(newWord2 + " ");
		}
		
		if (firstLetter.contains("a") || firstLetter.contains("e") || firstLetter.contains("i") || firstLetter.contains("o") || firstLetter.contains("u")){
			newWord4 = word + "-way";
			System.out.print(newWord4 + " ");
			}
	
		sentence = sentence.substring(space+1);
		}

	}
}