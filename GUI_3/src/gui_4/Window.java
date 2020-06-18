package gui_4;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane; 
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Window extends JFrame {
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField password;
	
	public Window() {
		super("This is Nick");
		setLayout(new FlowLayout());
		
		item1 = new JTextField("Shayna Bazsler - The kirifuda Clutch");
		add(item1);
		
		item2 = new JTextField("Samoa Joe - The kokina Clutch");
		add(item2);
		
		item3 = new JTextField("Drew Mcintyre - Claymore", 30);
		item3.setEditable(false);
		add(item3);
		
		password = new JPasswordField("", 10);
		add(password);
		
		myHandler handler = new myHandler();
		//actionListener implementation
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		password.addActionListener(handler);		
		
	}
	
	private class myHandler implements ActionListener{
		
	}
}
