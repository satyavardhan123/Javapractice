package satya;
interface Tax{
	double calculatetax(double price);
}
class Purchasedetails implements Tax{
	private String purchaseid;
	private String paymenttype;
	private double taxpercent;
	public Purchasedetails(String purchaseid, String paymenttype) {
		this.purchaseid = purchaseid;
		this.paymenttype = paymenttype;
	}
	public String getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(String purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public double getTaxpercent() {
		return taxpercent;
	}
	public void setTaxpercent(double taxpercent) {
		this.taxpercent = taxpercent;
	}
	public double calculatetax(double price) {
		if (paymenttype=="Debit Card") {
			taxpercent=2;}
		else if(paymenttype=="Credit Card") {
			taxpercent=3;
		}
		else {
			taxpercent=4;
		}
		return price+(price*taxpercent/100);
	}
}
class Seller implements Tax{
	private String location;
	private double taxpercent;
	public Seller(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxpercent() {
		return taxpercent;
	}
	public void setTaxpercent(double taxpercent) {
		this.taxpercent = taxpercent;
	}
	public double calculatetax(double price) {
		if (location=="Canada") {
			taxpercent=22;
		}
		else if(location=="Middle east") {
			taxpercent=15;
		}
		else if(location=="Japan") {
			taxpercent=12;
		}
		else if(location=="Europe") {
			taxpercent=25;
		}
		return price+(price*taxpercent/100);
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Purchase Details\n***************");
		Purchasedetails purchaseDetails = new Purchasedetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculatetax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxpercent());
	    System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + 
		Math.round(seller.calculatetax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxpercent());

	}

}
