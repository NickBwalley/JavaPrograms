package enumerations;

public enum NickFury {
	DeontayWilder("The Bronze Bomber", "112kgs"),
	TysonFury("The Gypsy King", "130kgs"),
	MikeTyson("The Destroyer", "110kgs");
	
	private final String nickName;
	private final String weights;
	
	NickFury(String n, String w){
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
