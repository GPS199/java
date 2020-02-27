package shapes2d;
import java.lang.Object;

public class Square extends Object{
	protected int side;
	
	public Square(int side) {
		this.side= side;
		
		
	}
	public int area() {
		return side*side;
	}
	
	public String toString() {
		return "side = " + side;
	}
}