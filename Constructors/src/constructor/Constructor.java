package constructor;

public class Constructor {
	private String girlfriend;
	
	public Constructor(String name) {
		girlfriend = name;
	}
		
	public String getName() {
		return girlfriend;
	}
	
	public void saying() {
		System.out.printf("Your Girlfriends Name was: %s\n", getName());
	}

}
