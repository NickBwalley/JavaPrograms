package guiJFrame;

import javax.swing.JFrame;
public class MainClass {

	public static void main(String[] args) {
		NickJFrame nicky = new NickJFrame();
		nicky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nicky.setSize(500, 400);
		nicky.setVisible(true);
	}

}
