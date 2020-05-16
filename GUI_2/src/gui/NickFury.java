package gui;

import java.awt.FlowLayout;//imports how things are placed in our workspace//layout 
import javax.swing.JFrame;//gives you basic features of a window like quit, minimize, maximize
import javax.swing.JLabel;//allows you to output text and images on the screen 

public class NickFury extends JFrame {
	private JLabel item1;
	private JLabel item2;
	
	public NickFury() {
		super("WrestleMania");
		setLayout(new FlowLayout());
		item1 = new JLabel("Becky Lynch && Seth Rollins");
		item1.setToolTipText("The Man, The Beast Slayer");
		add(item1);
	}

}
