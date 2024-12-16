package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog{
	String name;
	int age;
	String breed;
	
	public Dog(){
		name = new String ("Clifford"); 
		age = 3;
		breed = new String ("big red dog");
	}
	
	public Dog(String n){
		name = n;
		age = 1;
		breed = new String ("dog dog");
	}
	
	public Dog(String n, String b){
		name = n;
		breed = b; 
		age = 1;
	}
	
	public Dog(String n, int a){
		name = n;
		age = a;
		breed = new String ("dog dog");
	}
	
	public void setName(String dogName){
		Scanner sc = new Scanner (System.in);
		System.out.println("Dog name?");
		String n = sc.nextLine();
		name = n;
	}
	
	public void setAge(int dogAge){
		Scanner sc = new Scanner (System.in);
		System.out.println("What age should " + name + " be?");
		int a = sc.nextInt();
		age = a;
	}
	
	public void setBreed(String dogBreed){
		System.out.println(name + " is a dog dog that is " + age + " years old!");
		System.out.println("Toto is a Cairn Terrier that is 1 years old!");
		dogBreed = breed;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age; 
	}
	
	public String getBreed(){
		return breed;
	}
	
	public boolean isSleeping(){
		int s = (int)(Math.random()*(2)); // 1 = dog is sleeping
		if (s == 1){
			System.out.println(name + " is sleeping!");
			return true;
		}
		else{
			System.out.println(name + " is awake!");
			return false;
		}
	}
	
	public void bark(){
		System.out.println(name + " barks!");
	}
}
