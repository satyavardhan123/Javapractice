package satya;
interface Testable{
	boolean testcompatibility();
}
class Mobile{
	private String name;
	private String brand;
	private String operatingsystemname;
	private String operatingsystemversion;
	public Mobile(String name, String brand, String operatingsystemname, String operatingsystemversion) {
		this.name = name;
		this.brand = brand;
		this.operatingsystemname = operatingsystemname;
		this.operatingsystemversion = operatingsystemversion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOperatingsystemname() {
		return operatingsystemname;
	}
	public void setOperatingsystemname(String operatingsystemname) {
		this.operatingsystemname = operatingsystemname;
	}
	public String getOperatingsystemversion() {
		return operatingsystemversion;
	}
	public void setOperatingsystemversion(String operatingsystemversion) {
		this.operatingsystemversion = operatingsystemversion;
	}
	
}
class Smartphone extends Mobile implements Testable{
	private String networkgeneration;

	public Smartphone(String name, String brand, String operatingsystemname, String operatingsystemversion,
			String networkgeneration) {
		super(name, brand, operatingsystemname, operatingsystemversion);
		this.networkgeneration = networkgeneration;
	}

	public String getNetworkgeneration() {
		return networkgeneration;
	}

	public void setNetworkgeneration(String networkgeneration) {
		this.networkgeneration = networkgeneration;
	}
	public boolean testcompatibility() {
		if (this.getOperatingsystemname()=="Saturn") {
			if (networkgeneration=="3G") {
				if (this.getOperatingsystemversion()=="1.1" || this.getOperatingsystemversion()=="1.2" || this.getOperatingsystemversion()=="1.3") {
					return true;
				}
			}
			else if(networkgeneration=="4G") {
				if (this.getOperatingsystemversion()=="1.2" || this.getOperatingsystemversion()=="1.3") {
					return true;
				}
			}
			else if(networkgeneration=="5G") {
				if (this.getOperatingsystemversion()=="1.3") {
					return true;
				}
			}
			
		}
		if (this.getOperatingsystemname()=="Gara") {
			if (networkgeneration=="3G") {
				if (this.getOperatingsystemversion()=="EXRT.1" || this.getOperatingsystemversion()=="EXRT.2" || this.getOperatingsystemversion()=="EXRU.1") {
					return true;
				}
				else if(this.getOperatingsystemversion()=="EXRT.2" || this.getOperatingsystemversion()=="EXRU.1") {
					return true;
				}
				else if(this.getOperatingsystemversion()=="EXRU.1") {
					return true;
				}
			}
		}
		
		return false;
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone smartPhone = new Smartphone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
				if(smartPhone.testcompatibility())
				 System.out.println("The mobile OS is compatible with the network generation!");
				else
				 System.out.println("The mobile OS is not compatible with the network generation!");
		Smartphone smartPhone1 = new Smartphone("FriezaA8","Quasar","Gara","EXRT.1","4G");
				if(smartPhone1.testcompatibility())
				 System.out.println("The mobile OS is compatible with the network generation!");
				else
				 System.out.println("The mobile OS is not compatible with the network generation!");

	}
}
