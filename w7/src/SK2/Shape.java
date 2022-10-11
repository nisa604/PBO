package SK2;

public class Shape {
	private String color;
	private boolean filled = true;
	
	public Shape() {
		// TODO Auto-generated method stub
		color = "green";
		filled = true;
	}
	public Shape (String color) {
		color = color;
		filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		String shapeFill = this.filled? "Fileed" : "Not Filled";
		return "A shape with color of " + getColor() + "and" + shapeFill +"]";
	}
	
	

}
