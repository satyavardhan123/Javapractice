package satya;
class Employee{
	private int empid;
	private String empname;
	public Employee(int empid, String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid=empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname=empname;
	}
	
	}
class Pemployee extends Employee{
	private double bpay;
	private double hra;
	private float experience;
	public Pemployee(int empid, String empname, double bpay, double hra, float experience) {
		super(empid, empname);
		this.bpay = bpay;
		this.hra = hra;
		this.experience = experience;
	}
	public double getBpay() {
		return bpay;
	}
	public void setBpay(double bpay) {
		this.bpay = bpay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public void calculatemonthsalary() {
		double salary;
		if (experience<3) {
			salary=bpay+hra;
			System.out.println("Hi "+this.getEmpname()+" your salary is "+Math.round(salary));
		}
		else if(experience>=3 && experience<=5) {
			salary=bpay+hra+0.05*bpay;
			System.out.println("Hi "+this.getEmpname()+" your salary is "+Math.round(salary));
		}
		else if(experience>=5 && experience<=7) {
			salary=bpay+hra+0.07*bpay;
			System.out.println("Hi "+this.getEmpname()+" your salary is "+Math.round(salary));
		}
		else {
			salary=bpay+hra+0.12*bpay;
			System.out.println("Hi "+this.getEmpname()+" your salary is "+Math.round(salary));
		}
	}
}
class Contractemp extends Employee{
	private double wage;
	private float hoursworked;
	public Contractemp(int empid, String empname, double wage, float hoursworked) {
		super(empid, empname);
		this.wage = wage;
		this.hoursworked = hoursworked;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public float getHoursworked() {
		return hoursworked;
	}
	public void setHoursworked(float hoursworked) {
		this.hoursworked = hoursworked;
	}
	public void calculatesalary() {
		double salary=hoursworked*wage;
		System.out.println("Hi "+this.getEmpname()+" your salary is "+salary);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pemployee p1=new Pemployee(711211,"Rafael",1855,115,3.5f);
		p1.calculatemonthsalary();
		Contractemp c1=new Contractemp(102,"Jennifer",16,90);
		c1.calculatesalary();

	}

}
