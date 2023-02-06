package assign;
class Point{
	private double x;
	private double y;
	public Point() {
		this.x=0;
		this.y=0;
	}
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	public double distance(Point point) {
		double a=Math.sqrt((x-point.x)*(x-point.x)+(y-point.y)*(y-point.y));
		return Math.round(a);
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
