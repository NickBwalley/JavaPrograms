package setterAndGetter;

public class nicky {
	private String girlfriend;
	
	public void setName(String name) {
		girlfriend = name;
	}
	
	public String getName() {
		return girlfriend;
	}
	
	public void saying() {
		System.out.printf("You Ex-girlfriend's name is %s", getName());
	}
}
