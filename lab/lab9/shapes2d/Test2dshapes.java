package shapes2d;

public class Test2dshapes {
	public static void main(String[] args) {
		Circle c = new Circle(7);
		System.out.println(c.area());
		System.out.println(c);
		Square s= new Square(5);
		
		System.out.println(s.area());
		
		
		String str =s.toString();
		System.out.println(str);
		
	}
}