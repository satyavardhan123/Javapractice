package dxc123;
interface Certification {
	double fees=0;
	double calculatefee();
}
public class RR implements Certification {
	private String sname;
	private String cname;
	protected int rid;
	private int adtmarks;
	private int counter;
	private double discount;
	public RR(String sname, String cname, int rid, int adtmarks, int counter) {
		this.sname = sname;
		this.cname = cname;
		this.rid = rid;
		this.adtmarks = adtmarks;
		this.counter = counter;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getAdtmarks() {
		return adtmarks;
	}
	public void setAdtmarks(int adtmarks) {
		this.adtmarks = adtmarks;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public double calculateFee() {
	    if (adtmarks>= 90)
	        discount = 0.1 * fees;
	    else if (adtmarks>= 75)
	        discount = 0.05 * fees;
	    return fees - discount;
	}

}
class RRC extends RR{
	private int fee=2000;
    private int cd;
	public RRC(String sname, String cname, int rid, int adtmarks, int counter,int cd) {
		super(sname, cname, rid, adtmarks, counter);
	}
	public int getCd() {
		return cd;
	}
	public void setCd(int cd) {
		this.cd = cd;
	}
	private void generateRegistrationId() {
	    rid = (int) (Math.random() * 1000) + 1001;
	    if (rid % 2 == 0)
	        rid++;
	}
	
}
