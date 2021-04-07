package is_A_Relationship;

public class Main2 {
	
	public static void main(String[] args) {
		Tuna tuna = new Tuna();
		Tilapia tilapia = new Tilapia();
		
		System.out.println(tuna instanceof Fish);
		System.out.println(tilapia instanceof Fish);
		System.out.println(tilapia instanceof Fish);
	}
	
	/*In Java, you can create objects of Class only.
	 *You cannot create object of interfaces or abstract classes.*/

}
