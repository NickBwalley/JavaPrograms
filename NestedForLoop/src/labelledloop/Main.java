package labelledloop;

public class Main {

	public static void main(String[] args) {
		labelledLoop();
	}
	
	//method for labelled loop
	public static void labelledLoop() {
		//outerLoop
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if(i==2 && j==2) {
					System.out.println("continue Executes for Outer Loop: ");
				}
				System.out.println("Value of i: "+i + " Value of j "+j);
			}
		}
	}

}
