package enumeratons;

public enum Mango {
	Lashley("Spear", "278LBS"),
	GoldBerg("JackHammer", "282LBS"),
	Charlotte("Figure4", "168LBS");
	
	private final String Finisher;
	private final String weights;
	
	Mango(String finisherMoves, String pounds){
		Finisher = finisherMoves;
		weights = pounds;
	}
	
	public String getFinisher() {
		return Finisher;
	}
	
	public String getWeight() {
		return weights;
	}
	
}
