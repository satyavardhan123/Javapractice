package dxc123;

public class Cousreregistration {
	private String studentname;
	private int registrationid;
	private float qualifyingmarks;
	private double coursefee;
	private int courseid;
	private boolean hostel;
	public Cousreregistration(String studentname, int registrationid, float qualifyingmarks,
			int courseid, boolean hostel) {
		this.studentname = studentname;
		this.registrationid = registrationid;
		this.qualifyingmarks = qualifyingmarks;
		this.courseid = courseid;
		this.hostel = hostel;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRegistrationid() {
		return registrationid;
	}
	public void setRegistrationid(int registrationid) {
		this.registrationid = registrationid;
	}
	public float getQualifyingmarks() {
		return qualifyingmarks;
	}
	public void setQualifyingmarks(float qualifyingmarks) {
		this.qualifyingmarks = qualifyingmarks;
	}
	public double getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(double coursefee) {
		this.coursefee = coursefee;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public boolean isHostel() {
		return hostel;
	}
	public void setHostel(boolean hostel) {
		this.hostel = hostel;
	}
	public double validatemarks() {
		double d=0;
		if (qualifyingmarks<65)
			System.out.println("Marks is less than 65 you are not eligible for admission");
		if (qualifyingmarks>65 && qualifyingmarks<69) 
			d=0.05;
		else if (qualifyingmarks>70 && qualifyingmarks<84)
			d=0.01;
		else
			d=0.15;
		return d;
			}
	public double validatecourseid() {
		double fee=0;
		if (courseid==1001)
			fee=55000;
		else if(courseid==1002)
			fee=35675;
		else if(courseid==1003)
			fee=28300;
		else if(courseid==1004)
			fee=22350;
		else if(courseid==1005)
			fee=115000;
		return fee;
	}
	public void caluculatefee(double f,double d) {
		coursefee=f-(f*d);
		System.out.println(coursefee);
		if (this.hostel==true)
			System.out.println("Hostel required");
		else
			System.out.println("Hostel required no");
	}

}
