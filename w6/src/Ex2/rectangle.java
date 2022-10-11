package Ex2;

public class rectangle extends shape {
	private double width;
	private double length;
	
	public rectangle() {
		width = 1.0;
		length = 1.0;
	}
	public rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public rectangle(double width, double length, String color) {
		this.width = width;
		this.length = length;
		super.setColor(color);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
