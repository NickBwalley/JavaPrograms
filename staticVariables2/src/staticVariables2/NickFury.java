package staticVariables2;

public class NickFury {
	private String first;
	private String last;
	private static int members;
	
	public NickFury(String fname, String lname) {
		first = fname;
		last = lname;
		members++;
		
		System.out.printf("Your name is: %s, %s >> You are the [%d] Member in the Club\n", first , last, members);
	}
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public static int getMembers() {
		return members;
	}
	
	
}
