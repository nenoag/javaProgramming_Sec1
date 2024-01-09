
public class Circle_1 {
	private double radius;
	private String color;
	
	
	public void setRadius(double ra) {
		radius = ra;
	}
	
	public void setColor(String co) {
		color = co;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return Math.PI* radius*radius;
	}
}
