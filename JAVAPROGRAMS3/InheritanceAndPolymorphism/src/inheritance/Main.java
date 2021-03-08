package inheritance;

public class Main {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.set_values(10, 10);
		tri.set_values(10, 10);
		
		System.out.println("Area of Rectangle = " + rec.area());
		System.out.println("Area of Triangle = " + tri.area());

	}

}
