package gui1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FoodStuffs extends JFrame {
	
	private JLabel kfc;
	private JLabel chickenInn;
	
	public FoodStuffs() {
		super("Best Chicken Selling");
		setLayout(new FlowLayout());
		kfc = new JLabel("Bucket costs KSH1000!");
		kfc.setToolTipText("Buy one bucket get soda 2L Free!");
		add(kfc);
		
	}

}
