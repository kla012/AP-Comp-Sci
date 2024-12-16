/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        //if(5<5){
            //System.out.println("This runs!");
        //}
        //else if (5>3){
            //System.out.print("This runs too!");
        //}
            Scanner sc = new Scanner(System.in);
            System.out.println("Numba please");
            int num = sc.nextInt();
            
        if(num>10){
            System.out.println("Your numba bigger than 10");
        }
        
        else{
            //this else catches everything else
            //THIS CTCHES GREAT THAN OR EQUAL TO
            System.out.print("Your value isn't greater than 10");
        }
    
    }
}      