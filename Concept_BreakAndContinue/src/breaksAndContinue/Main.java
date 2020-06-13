package breaksAndContinue;

public class Main {

	public static void main(String[] args) {
		keywordBreak();
	}
	
	public static void keywordBreak() {
		for(int i = 0; i < 10; i++) {
			if(i==5)
				break;
			System.out.printf("%d ", i);
		}
	}

}

