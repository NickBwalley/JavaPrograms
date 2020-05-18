package polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		RoundOf16 ro16 = new RoundOf16();
		QuarterFinals qf = new QuarterFinals();
		SemiFinals sf = new SemiFinals();
		Finals ff = new Finals();
		ff.finalists(ro16);
		ff.finalists(qf);
		ff.finalists(sf);
	}

}
