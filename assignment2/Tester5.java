package basic1;
class Shipment{
	public void checkproductnamevalidity(String productname) {
		String st2=("^[A-Za-z]+ [A-Za-z]+$|^[A-Za-z]+ [A-Za-z]+ [A-Za-z]+$");
		if (productname.matches(st2))
			System.out.println("valid");
		else 
			System.out.println("Invalid");
	}
	public void checkpid(String productid) {
		String st3="[\\w]{2,20}";
		if (productid.matches(st3))
			System.out.println("valid");
		else 
			System.out.println("Invalid");

		}
	public void checktrackerid(String trackerid) {
		String st4="^[A-Z]{1}[\\:]{1}[A-Z]{4}[\\:][a-z]{3}[\\:][0-9]{2}$";
		if (trackerid.matches(st4))
			System.out.println("valid");
		else 
			System.out.println("Invalid");
	}
	}
public class Tester5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shipment shipment = new Shipment();
		 
		 //Change the values for testing your code with different values
		 
		 String productName = "Digital Camera";
		 shipment.checkproductnamevalidity(productName);
		 String productid = "DC1911";
		 shipment.checkpid(productid);
		 String trackerId = "D:CMDC:cmd:23";
		 shipment.checktrackerid(trackerId);

	}

}
