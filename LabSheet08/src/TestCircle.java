
public class TestCircle {

	public static void main(String[] args) {
		Circle_1 c1 = new Circle_1();
		Circle_1 c2 = new Circle_1();
		Circle_1 c3 = new Circle_1();
		
		
		c1.setRadius(2.0);
		c1.setColor("blue");
		System.out.println("Circle 1 area = " + c1.getArea() + ", and color is " + c1.getColor());
	
		c2.setRadius(2.0);
		c2.setColor("red");
		System.out.println("Circle 2 area = " + c2.getArea() + ", and color is " + c2.getColor());
	
		c3.setRadius(1.0);
		c3.setColor("red");
		System.out.println("Circle 3 area = " + c3.getArea());
	}
}
