package staticVariables;

public class nickFury {
	private String first;
	private String last;
	private static int members;
	
	public nickFury(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Your Name is: %s, %s, Your are the %d Member in the club;\n", first, last, members );
	}
	
	public int totalMembers() {
		return members;
	}
	public void helloWorld() {
		System.out.println("Hello World!..");
	}
}
