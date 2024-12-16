package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
public Movie(){
    movieName = "Avengers";
    rating = 8.0;
    numRatings = 33;
    revenue = 623357910;
}
public Movie(String m, double r, int n, int rev){
    movieName = m; 
    rating = r;
    numRatings = n;
    revenue = rev; 
}
public void movieToString(){
    System.out.println("Movie: " + movieName);
    System.out.println("Rating: " + rating);
    System.out.println("Number of Ratings: " + numRatings);
    System.out.println("Revenue: " + revenue);
    System.out.println("");
}
public String getMovieName(){
    return movieName;
}
public int getRevenue(){
    return revenue;
}
public double addRating(double ar){
    double subTotal = ((rating*numRatings)+ar);
    numRatings =  numRatings + 1;
    rating = subTotal/numRatings;
return rating;
}
public boolean compareRatings(Movie x){
    return rating > x.rating;
    }
}
