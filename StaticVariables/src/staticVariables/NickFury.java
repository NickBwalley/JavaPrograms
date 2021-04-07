package staticVariables;

public class NickFury {
	private String first;
	private String last;
	private static int members;
	
	public NickFury(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Your Name is: %s, %s, Your are the %d Member in the club;\n", first, last, members );
	}
	
	public static int totalMembers() {
		return members;
	}
}
