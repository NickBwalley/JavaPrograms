package breakAndContinue;

public class Main {

	public static void main(String[] args) {
		// break statement
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		System.out.println();
		// continue statement
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		System.out.println();
		// break statement in while loop
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
			if(i==4)
				break;
		}
		System.out.println();
		// continue statement in while loop
		int j = 0;
		while(j<10) {
			if(j==4) {
				j++;
				continue;
			}				
			System.out.println(j);
			j++;
		}
	}

}
