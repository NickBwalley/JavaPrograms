package programs;

public class Main {

	public static void main(String[] args) {
		Animals[] theAnimal = new Animals[2];
		
		Hyena h = new Hyena();
		Cheetah ch = new Cheetah();
		
		theAnimal[0] = h;
		theAnimal[1] = ch;
	}

}
