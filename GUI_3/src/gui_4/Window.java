package gui_4;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Window extends JFrame{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField password;
	
	public Window() {
		super("Registration-Form");
		setLayout(new FlowLayout());		
		item1 = new JTextField("What is Your Name", 20);
		item1.setEditable(false);
		item2 = new JTextField("",10);
		item3 = new JTextField("Set Your Password", 20);
		item3.setEditable(false);
		password = new JPasswordField("",10);
		add(item1);
		add(item2);
		add(password);
		
		
	}
}
