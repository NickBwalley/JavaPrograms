package programs;

public class Main {

	public static void main(String[] args) {
		Animals[] theAnimal = new Animals[2];
		
		Hyena hyena = new Hyena();
		Cheetah cheetah = new Cheetah();
		
		theAnimal[0] = hyena;
		theAnimal[1] = cheetah;
	}

}
