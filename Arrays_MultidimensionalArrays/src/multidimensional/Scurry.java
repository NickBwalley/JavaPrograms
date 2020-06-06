package multidimensional;

public class Scurry {

	public static void printArray(int z[][]) {
		for(int row = 0; row < z.length; row++) {
			for (int column = 0; column < z[row].length; column++) {
				System.out.print(z[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
