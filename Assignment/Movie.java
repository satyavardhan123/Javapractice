package str1;
import java.util.Scanner;
class Movieticket{
	private int movieid;
	private int noofseats;
	private double costperticket;
	public Movieticket(int movieid, int noofseats, double costperticket) {
		this.movieid = movieid;
		this.noofseats = noofseats;
		this.costperticket = costperticket;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	public double getCostperticket() {
		return costperticket;
	}
	public void setCostperticket(double costperticket) {
		this.costperticket = costperticket;
	}
	public double totalamount() {
		double a=0;
		if (movieid==111 || movieid==112 || movieid==113) {
		  a=costperticket*noofseats;}
		else
			System.out.println("please enter validid");
		return Math.round(a);
	}
	
	
	
	
}



public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter vaalues");
		Scanner in=new Scanner(System.in);
		System.out.println("enter id");
		int id=in.nextInt();
		System.out.println("enter seats");
		int seat=in.nextInt();
		System.out.println("enter cost");
		double cost=in.nextDouble();
		Movieticket s1=new Movieticket(id,seat,cost);
	    System.out.println(s1.totalamount());

	}

}
