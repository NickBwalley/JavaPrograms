package guiJButton;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		NickJButton nicky = new NickJButton();
		nicky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nicky.setSize(500,400);
		nicky.setLocation(400,100);
		nicky.setVisible(true);
	}

}
