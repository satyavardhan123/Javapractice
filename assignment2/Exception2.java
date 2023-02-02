package satya;
class Busbooking{
	private int bookingid;
	private String destination;
	private String trippackage;
	private double totalamount;
	public Busbooking(int bookingid, String destination, String trippackage) {
		this.bookingid = bookingid;
		this.destination = destination;
		this.trippackage = trippackage;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrippackage() {
		return trippackage;
	}
	public void setTrippackage(String trippackage) {
		this.trippackage = trippackage;
	}
	public double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}
	public boolean validatecouponcode(String couponcode,int numberofmembers)throws Invalidcouponcodeexception{
		if((couponcode.equals("BIGBUS") && numberofmembers>=10) || (couponcode.equals("MAGICCBUS") && numberofmembers>=15))
			return true;
		else throw new Invalidcouponcodeexception("Invalid coupon code");}
	public String booktrip(String couponcode,int numberofmembers) {
		try {
			if (!(this.destination.equals("Washington Dc") || this.destination.equals("Philadelphia") || this.destination.equals("Orlando") || this.destination.equals("Boston") || this.destination.equals("Atlanta")))throw new Invaliddestinationexception("Invalid Destination");
			else if(!(this.trippackage.equals("Regular") || this.trippackage.equals("Premium")))
				throw new Invalidtrippackageexception("Invalid package");
			validatecouponcode(couponcode,numberofmembers);
			if (trippackage.equals("Regular")) {
				setTotalamount(500*numberofmembers);
				return "Booking Successful";
			}
			else throw new Invalidtrippackageexception("Invalid package");
		}
		catch(Invalidcouponcodeexception | Invalidtrippackageexception | Invaliddestinationexception e) {
			return e.getMessage();
		}
			
	}
	
}
class Invalidcouponcodeexception extends Exception{
	public Invalidcouponcodeexception(String message) {
		super(message);
	}
}
class Invaliddestinationexception extends Exception{
	public Invaliddestinationexception(String message) {
		super(message);
	}
	}
class Invalidtrippackageexception extends Exception{
	public Invalidtrippackageexception(String message) {
		super(message);
	}
}
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Busbooking booking = new Busbooking(101,"Toronto", "Regular");
		String result = booking.booktrip("BIGBUS", 11);
		if(result.equals("Booking successful")){
		    System.out.println(result);
		    System.out.println("Total amount for the trip: " + booking.getTotalamount());
		    }
		else{
		  System.out.println(result);
		  System.out.println("Your booking was not successful, please try again!");

	}

}
}