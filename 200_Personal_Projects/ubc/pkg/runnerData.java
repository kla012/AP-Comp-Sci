/*
 *	Author:  Kayla Chong
 *  Date: 11/21/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class runnerData {
	double time1;
	double time2;
	double time3;
	double time4;
	double time5;
	
	public runnerData() {
		this.time1 = time1;
		this.time2 = time2;
		this.time3 = time3;
		this.time4 = time4;
		this.time5 = time5;
		
	}
	
	public void setTime1(double time1){
		this.time1 = time1;
	}
	
	public void setTime2(double time2){
		this.time2 = time2;
	}
	
	public void setTime3(double time3){
		this.time3 = time3;
	}
	
	public void setTime4(double time4){
		this.time4 = time4;
	}
	
	public void setTime5(double time5){
		this.time5 = time5;
	}
	
	public double getTime1(){
		return time1;
	}
		
	public double getTime2(){
		return time2;
	}
		
	public double getTime3(){
		return time3;
	}
	
	public double getTime4(){
		return time4;
	}	
	
	public double getTime5(){
		return time5;
	}
	
	public double getAverage(){
		double sum = getTime1() + getTime2() + getTime3() + getTime4() + getTime5();
		double average = sum/5.0;
		return average;
	}
	
	public double totalTime(){
	double sum = getTime1() + getTime2() + getTime3() + getTime4() + getTime5();
	return sum;
	}
}

	

