/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    String color;
    double topSpeed;
    String model;
    int horsePower;
    boolean isElectric;
    
    //Default/Empty Constructor
    public Car(){
        color = "black";
        topSpeed = 115.22;
        model = "Cybertruck";
        horsePower = 600;
        isElectric = true;
    }
    //Constructor
    public Car (String c, double s, String m){
        color = c; 
        topSpeed = s;
        model = m;
        horsePower = 500;
        isElectric = false;
    }
    //Method
    public void vroom(){
        int count = 0;
        while (count < topSpeed){
            System.out.println(model + " goes vroom");
            count = count + 10;
        }
    }
}
