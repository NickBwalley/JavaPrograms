package finalKeyword;

public class Main {

	public static void main(String[] args) {
		NickFury nicky = new NickFury(10);
		
		for(int i=0; i<5; i++) {
			nicky.add();
			System.out.printf("%s", nicky);
		}
		
			
	}

}
