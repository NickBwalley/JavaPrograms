package gui3;

import javax.swing.JFrame;
public class Gui {

	public static void main(String[] args) {
		NickFury nicky = new NickFury();
		nicky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nicky.setSize(500, 400);
		nicky.setVisible(true);
		
		FoodStuffs chicken = new FoodStuffs();
		chicken.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chicken.setSize(500, 400);
		chicken.setVisible(true);
	}

}
