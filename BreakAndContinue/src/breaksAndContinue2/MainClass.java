package breaksAndContinue2;

public class MainClass {

	public static void main(String[] args) {
		keywordBreak();
		System.out.println();
		keywordContinue();
	}
	
	public static void keywordBreak() {
		for(int i = 0; i < 10; i++) {
			if(i==5)
				break;// means that whenever the for loop reaches to the 5th element the for loop breaks 
			System.out.printf("%d ", i);
		}
		System.out.println("\n------------------------");
		int count = 0;
		//using a while loop 
		while(count < 10) {
			System.out.println(count);
			count++;
			if(count == 4)
				break;
		}
	}
	
	public static void keywordContinue() {
		for(int i = 0; i < 10; i++) {
			if(i == 4)
				continue;//it means that it jumps 4 so the fourth operation is not carried out;
			System.out.printf("%d ", i);
		}
		//using a while loop
		System.out.println("\n------------------------");
		int count = 0;
		while(count < 10) {
			if(count == 4) {
				count++;
				continue;
				
			}
				
			System.out.println(count + " ");
			count++;

		}
	}

}

