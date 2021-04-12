package guieventhandler;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		Apples apples = new Apples();
		apples.setSize(400,300);
		apples.setLocation(400,100);
		apples.setVisible(true);
		apples.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	

}
