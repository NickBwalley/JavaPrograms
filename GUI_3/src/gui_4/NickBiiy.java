package gui_4;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NickBiiy extends JFrame {
	private JTextField item1;
	private JTextField entry1;
	private JTextField item2;
	private JPasswordField password;
	//constructor
	public NickBiiy() {
		super("Students' Self-Enrollment System");
		setLayout(new FlowLayout());
		item1 = new JTextField("Enter Your Name: ");
		item1.setEditable(false);
		entry1 = new JTextField("",20);
		item2 = new JTextField("Set Your Password");;
		item2.setEditable(false);
		password = new JPasswordField("",20);
		//implementing the the ActionListener and ActionEvent
		add(item1);
		add(entry1);
		add(item2);
		add(password);
	}

}
