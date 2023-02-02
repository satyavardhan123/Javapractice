package satya;
class Bill{
	private static int counter;
	private String paymentmode;
	private String billid;
	static {
		counter=9001;
	}
	public Bill(String paymentmode) {
		this.billid="B"+ ++counter;
		this.paymentmode=paymentmode;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public String getBillid() {
		return billid;
	}
	public void setBillid(String billid) {
		this.billid = billid;
	}
	
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill bill1=new Bill("Debitcard");
		Bill bill2=new Bill("paypal");
		Bill[] bills= {bill1,bill2};
		for (Bill bill:bills) {
			System.out.println("Bill Details");
			System.out.println("Bill id:"+bill.getBillid());
			System.out.println("payment method:"+bill.getPaymentmode());
			System.out.println();
		}

	}

}
