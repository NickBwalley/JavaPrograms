package javaConcepts;

public class Loops {

	public static void main(String[] args) {
		int a = 0;
		while(a <= -1) { //first evaluates the condition and then excutes your statements 
			System.out.println(a);
			a++; // increment operator to make the loop a non-infinite loop
		}
		System.out.println("-------");
		int b = 0;
		do { // executes your statement first then does your conditions
			System.out.println(b);
			b++;
		}while(b <= -1);
		
	}

}
