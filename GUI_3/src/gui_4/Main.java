package gui_4;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		Window nicky = new Window();
		nicky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nicky.setSize(400,300);
		nicky.setLocation(400, 300);
		nicky.setVisible(true);
	}

}
