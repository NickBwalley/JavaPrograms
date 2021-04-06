package gui1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NickFury extends JFrame{
	
	private JLabel item1;
	
	public NickFury() {
		super("HeavyWeight Title");
		setLayout(new FlowLayout());
		item1 = new JLabel("Deontay Wilder!");
		item1.setToolTipText("The Bronze Bomber...");
		add(item1);
		
	}
}
