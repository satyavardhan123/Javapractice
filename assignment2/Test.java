package satya;
class Cabservice{
	private String cabservicename;
	private int totalcab;
	public Cabservice(String cabservicename, int totalcab) {
		this.cabservicename = cabservicename;
		this.totalcab = totalcab;
	}
	public String getCabservicename() {
		return cabservicename;
	}
	public void setCabservicename(String cabservicename) {
		this.cabservicename = cabservicename;
	}
	public int getTotalcab() {
		return totalcab;
	}
	public void setTotalcab(int totalcab) {
		this.totalcab = totalcab;
	}
	
	double calculatereward(Driver1 driver) {
		double a=0;
		if (cabservicename=="Halo" && (driver.getName()=="Luke" || driver.getName()=="Mark")) {
			if (driver.getAveragerating()>=4.5 && driver.getAveragerating()<5) {
				a=10*driver.getAveragerating();
			}
			else if(driver.getAveragerating()>=4 && driver.getAveragerating()<=4.5) {
				a=5*driver.getAveragerating();
			}
			else {
				a=0;
			}
		
		}
		else if(cabservicename=="Aber" && (driver.getName()=="Luke" && driver.getName()=="Mark")) {
			if (driver.getAveragerating()>=4.5 && driver.getAveragerating()<=5) {
				a=8*driver.getAveragerating();
			}
			else if(driver.getAveragerating()>=4 && driver.getAveragerating()<=4.5) {
				a=3*driver.getAveragerating();
			}
			else {
				a=0;
			}
		}
		return a;
	}
	
}
class Driver1{
	private String name;
	private float averagerating;
	public Driver1(String name, float averagerating) {
		this.name = name;
		this.averagerating = averagerating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAveragerating() {
		return averagerating;
	}
	public void setAveragerating(float averagerating) {
		this.averagerating = averagerating;
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cabservice c1=new Cabservice("Halo",50);
		Driver1 d1=new Driver1("Luke",4.8f);
		Driver1 d2=new Driver1("Mark",4.2f);
		Driver1 d3=new Driver1("David",4.9f);
		Driver1[] drivers= {d1,d2,d3};
		for (Driver1 driver:drivers) {
			double bonus=c1.calculatereward(driver);
			if (bonus>0) {
				System.out.println("Driver"+driver.getName());
				System.out.println("Bonus "+bonus);
			}
			else {
				System.out.println("Driver "+driver.getName());
				System.out.println("Sorry bonus is not available");
			}
		}

	}

}
