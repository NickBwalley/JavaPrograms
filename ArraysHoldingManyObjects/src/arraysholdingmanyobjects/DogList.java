package arraysholdingmanyobjects;

public class DogList {
	private Dog[] theDog = new Dog[5];
	private int i=0;
	
	public void add (Dog d) {
		if(i<theDog.length) {
			theDog[i] = d;
			System.out.println("Dog added at Index: " + i);
			i++;
		}
	}
	
}
