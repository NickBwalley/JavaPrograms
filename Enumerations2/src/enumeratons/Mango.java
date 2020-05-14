package enumeratons;

public enum Mango {
	BobbyLashley("Spear", "278LBS"),
	BillGoldBerg("JackHammer", "282LBS"),
	CharlotteFlair("Figure4", "168LBS"),
	FinnBalor("1960", "218LBS"),
	AleisterBlack("Black-Mass", "270LBS"),
	ShinsukeNakamura("Kinshasa", "240"),
	sethRollins("Stomp", "221LBS"),
	RayMysterio("619", "199LBS"),
	RandyOrton("RKO", "260LBS"),
	JohnCena("AA", "278LBS");
	
	
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
