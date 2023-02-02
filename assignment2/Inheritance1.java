package satya;
class Camera{
	private String brand;
	private double cost;
	public Camera() {
		this.brand="Nikon";
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
class Digitalcamera extends Camera{
	private int memory;

	public Digitalcamera(String brand,double cost) {
		this.memory=16;
		this.setBrand(brand);
		this.setCost(cost);
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digitalcamera Camera=new Digitalcamera("Canon",100);
		System.out.println(Camera.getBrand()+" "+Camera.getCost()+" "+Camera.getMemory());

	}

}
