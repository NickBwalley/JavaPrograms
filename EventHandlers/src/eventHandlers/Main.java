package eventHandlers;

import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		WorldCup2018 world = new WorldCup2018();
		world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		world.setSize(500,400);
		world.setVisible(true);
	}

}
//Event is what the user does 
//Event Handler is what the program does or makes when the user does a certain operation 

