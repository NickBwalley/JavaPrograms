package guijframe;

import java.awt.FlowLayout;//imports how things are placed in our workspace//layout 
import javax.swing.JFrame;//gives you basic features of a window like quit, minimize, maximize
import javax.swing.JLabel;//allows you to output text and images on the screen 

public class NickJFrame extends JFrame {
	private JLabel item1;
	private JLabel item2;
	
	public NickJFrame() {
		super("Strathmore University");
		setLayout(new FlowLayout());
		item1 = new JLabel("My Name is Nick Biiy Bwalley");
		item1.setToolTipText("Experienced Java, Python Programmer");
		add(item1);
		item2 = new JLabel("I Study Bachelor in Informatics and Computer Science!");
		item2.setToolTipText("2021-2025");
		add(item2);
	}

}
