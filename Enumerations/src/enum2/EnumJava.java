package enum2;

public enum EnumJava {
	myDetails("NickBwalley", "20"),
	myCareer("Programmer", "Drumist");
	
	private final String details;
	private final String career;
	
	EnumJava(String d, String c) {
		details = d;
		career = c;
	}
	
	public String getDetails() {
		return details;
	}
	
	public String getCareer() {
		return career;
	}
}
