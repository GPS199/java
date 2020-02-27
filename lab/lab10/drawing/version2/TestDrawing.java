package drawing.version2;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;


public class TestDrawing {

	public static void main(String[] args) {
		
		Drawing drawing = new Drawing();
		
		drawing.addShapes(new Circle(5));
		drawing.addShapes(new Rectangle(5,6));
		drawing.addShapes(new Square(5));

		System.out.println("Total area = " + drawing.calculateTotalArea());
	}

}