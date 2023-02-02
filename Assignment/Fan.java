package basic1;
class Fan1{
	private int speed;
	private boolean specify;
	private double radius;
	private String colour;
	public Fan1() {
		speed=1;
		specify=false;
		radius=5;
		colour="blue";
	}
	public Fan1(int speed, boolean specify, double radius, String colour) {
		this.speed = speed;
		this.specify = specify;
		this.radius = radius;
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isSpecify() {
		return specify;
	}
	public void setSpecify(boolean specify) {
		this.specify = specify;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void tostring() {
		if (specify==true) {
			
		    if (speed==1) {
			   System.out.println("speed:low");
			   System.out.println("color:"+colour);
			   System.out.println("radius:"+radius);
			   System.out.println("fan is on");}
		    else if (speed==2) {
				   System.out.println("speed:medium");
				   System.out.println("color:"+colour);
				   System.out.println("radius:"+radius);
				   System.out.println("fan is on");}
		    else if (speed==3) {
					   System.out.println("speed:high");
					   System.out.println("color:"+colour);
					   System.out.println("radius:"+radius);
					   System.out.println("fan is on");}
		}
		else
		{
			System.out.println("color:"+colour);
			System.out.println("radius:"+radius);
		    System.out.println("fan is off");
		}
		
	}
	
}
public class Fan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan1 f1=new Fan1();
		Fan1 f2=new Fan1(2,true,2.4,"red");
		f1.tostring();
		f2.tostring();

	}

}
