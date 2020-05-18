package eventHandlers;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class WorldCup2018 extends JFrame {
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JTextField item4;
	
	public WorldCup2018() {
		super("WorldCup2018!");
		setLayout(new FlowLayout());
		
		item1 = new JTextField("Who Won the Mens WorldCup 2018?", 30);
		item1.setEditable(false);
		add(item1);
		
		item2 = new JTextField("Who Won the Womens WorldCup 2018?", 30);
		item2.setEditable(false);
		add(item2);
		
	}
	
}
