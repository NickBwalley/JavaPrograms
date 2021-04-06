package polymorphism2;

public class MainClass {

	public static void main(String[] args) {
		Animals[] theAnimal = new Animals[2];
		
		Hyena hyena = new Hyena();
		Cheetah cheetah = new Cheetah();
		
		theAnimal[0] = hyena;
		theAnimal[1] = cheetah;
		//creating an enhanced forLoop for printing the varibles inside the classes
		for(Animals x: theAnimal) {
			//printing out the methods inside those classes instead of creating objects everytime 
			//more effecient way to run methods inside different classes 
			x.speed();
		}
	}

}
