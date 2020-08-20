package finalKeyword;

public class NickFury {
	private int sum;
	private final int NUMBER;//whenever you create a final variable you cannot change that variable
	
	public NickFury(int x) {
		NUMBER = x;
	}
	
	public void add() {
		sum+=NUMBER;
	}
	
	public String  toString() {
		return String.format("Sum: %d\n", sum);
	}
	
}
