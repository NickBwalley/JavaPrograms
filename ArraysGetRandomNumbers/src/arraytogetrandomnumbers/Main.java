package arraytogetrandomnumbers;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int freq[] = new int[7];
		
		// loop to count the frequency of a duplicate number when the dice is rolled 1000 times and counts
		// dice has 6 sides so every die roll, it counts the frequency of a side which has been acquired
		for(int roll=1; roll < 1000; roll++) {
			++freq[1+rand.nextInt(6)];			
		}
		
		System.out.println("Face\tFrequency");
		
		for(int face = 1; face<freq.length; face ++) {
			System.out.println(face + "\t" + freq[face]);
		}
	}

}
