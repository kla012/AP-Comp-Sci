public class StepTracker{ //class name
    int steps; //global variables
    int days;
    
    public StepTracker(int steps, int days){ //constructor
        this.steps = steps;
        days = 0;
    }
    
    public void addDailySteps(int a){ //method 1
            while (a>0){
                days++;
            }
        }
        
    public int activeDays(){ //method 2
        while (days>0){
            if(steps >= 10000){
            days++;
            }
        }
    return days;
    }
    
    public int averageSteps(){ //method 3
        int sum = 0;
        while (days>0){
            sum = sum + steps;
            days++;
        }
    double average = sum/days;
    return average;
    }
}