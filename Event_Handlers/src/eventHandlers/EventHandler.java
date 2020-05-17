package eventHandlers;

import javax.swing.JFrame;
public class EventHandler {

	public static void main(String[] args) {
		NickFury nicky = new NickFury();
		nicky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nicky.setSize(500,400);
		nicky.setVisible(true);
	}

}
//Event is what the user does 
//Event Handler is what the program does or makes when the user does a certain operation 

