package exam;

public class Circle {
	protected double radius;
	static double pi=3.14;
	public Circle(double radius) {
		this.radius=radius;		
	}
	public double area() {
		return pi*radius*radius;
	}
	public double perimeter() {
		return 2*pi*radius;
		
	}
	public String toString() {
		return "radius= "+radius;
	}
}
