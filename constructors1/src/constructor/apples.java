package constructor;

public class apples {
	private String girlfriend;
	
	public apples(String name) {
		girlfriend = name;
	}
		
	public String getName() {
		return girlfriend;
	}
	
	public void saying() {
		System.out.printf("Your Girlfriends Name was: %s\n", getName());
	}

}
