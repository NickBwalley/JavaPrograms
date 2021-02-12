package cube;

public class Main {

	public static void main(String[] args) {
		Cube cube1 = new Cube();
		System.out.println(cube1.getVolume());
		
		Cube cube2 = new Cube(40, 20, 20);
		System.out.println(cube2.getVolume());

	}

}
