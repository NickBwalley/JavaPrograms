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
/*what abstract class means is that you cannot create an object from that class but you can use 
 *methods inside that class for inheritance and polymorphism
 */