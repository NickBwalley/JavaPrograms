package enumerations;

public enum Wrestlers2 {
	DeontayWilder("The Bronze Bomber", "112kgs"),
	TysonFury("The Gypsy King", "130kgs"),
	MikeTyson("The Destroyer", "110kgs");
	
	private final String nickName;
	private final String weights;
	
	Wrestlers2(String n, String w){
		nickName = n;
		weights = w;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public String getWeights() {
		return weights;
	}
}
