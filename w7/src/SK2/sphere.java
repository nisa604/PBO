package SK2;

public class sphere extends Shape{
	private double radius;
	
	public sphere(double r) {
		// TODO Auto-generated method stub
		super("Sphere");
		radius = r;
	}
	public double area() {
		return 4*Math.PI*radius*radius;
	}
	public String toString() {
		return super.toString() + "of radius" + radius;
	}
}
