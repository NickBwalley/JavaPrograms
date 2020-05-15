package gui;
import javax.swing.JOptionPane;
public class GraphicalUserInterface {

	public static void main(String[] args) {
		String fNum = JOptionPane.showInputDialog("Enter First Number: ");
		String lNum = JOptionPane.showInputDialog("Enter Second Number: ");
		
		int num1 = Integer.parseInt(fNum);
		int num2 = Integer.parseInt(lNum);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "Result is: " + sum, "Addition", JOptionPane.PLAIN_MESSAGE);
		
	}

}
