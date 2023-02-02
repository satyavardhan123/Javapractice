package satya;
abstract class Payment{
	private int customerid;
	protected String paymentid;
	protected double servicetaxpercentage;
	public Payment(int customerid) {
		this.customerid=customerid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}
	public double getServicetaxpercentage() {
		return servicetaxpercentage;
	}
	public void setServicestaxpercentage(double servicetaxpercentage) {
		this.servicetaxpercentage = servicetaxpercentage;
	}
	public abstract double paybill(double amount);
	
	
}
class Debitcardpayment extends Payment{
	private double discountpercent;
	private static int count=1000;
	public Debitcardpayment(int customerid) {
		super(customerid);
		paymentid="D"+ ++count;
		}
	public double getDiscountpercent() {
		return discountpercent;
	}
	public void setDiscountpercent(double discountpercent) {
		this.discountpercent = discountpercent;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Debitcardpayment.count = count;
	}
	
	public double paybill(double amount) {
		double servicetax=0;
		double discountamount=0;
		if (amount<=500) {
			servicetaxpercentage=2.5;
			discountpercent=1;}
		else if(amount<=1000) {
			servicetaxpercentage=4;
			discountpercent=2;}
		else {
			servicetaxpercentage=5;
			discountpercent=3;}
		servicetax=amount*servicetaxpercentage/100;
		discountamount=amount*discountpercent/100;
		return amount+servicetax-discountamount;
	}
	
}
class Creditcardpayment extends Payment{
	private static int count=1000;
	public Creditcardpayment(int customerid) {
		super(customerid);
		paymentid="C"+ ++count;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Creditcardpayment.count = count;
	}
	public double paybill(double amount) {
		double servicetaxamount=0;
		if (amount<=500)
			servicetaxpercentage=3;
		else if(amount<=1000)
			servicetaxpercentage=5;
		else
			servicetaxpercentage=6;
		servicetaxamount=amount*servicetaxpercentage/100;
		return amount+servicetaxamount;
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Debitcardpayment debitCardPayment = new Debitcardpayment(101);
		double billAmount=Math.round(debitCardPayment.paybill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerid());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentid());
		System.out.println("Service tax percentage: " +debitCardPayment.getServicetaxpercentage());
		System.out.println("Discount percentage: " +debitCardPayment.getDiscountpercent());
		System.out.println("Total bill amount: " + billAmount);
		Creditcardpayment creditCardPayment = new Creditcardpayment(102);
		billAmount=Math.round(creditCardPayment.paybill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerid());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentid());
		System.out.println("Service tax percentage: " + creditCardPayment.getServicetaxpercentage());
		System.out.println("Total bill amount: " + billAmount);

	}

}
