package enumerations;

public enum apples {
	BraunStrowman("MonsterAmongMen", "385LBS"),
	BrockLesnar("TheBeast", "285LBS"),
	SethRollins("MondayNightMessiah", "245LBS");
	
	private final String ringName;
	private final String weight;
	
	apples(String theNames, String theWeights){
		ringName = theNames;
		weight = theWeights;
	}
	
	public String getNames() {
		return ringName;
	}
	public String getWeights() {
		return weight;
	}
	
}
