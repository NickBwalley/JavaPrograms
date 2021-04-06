package gui2;
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
		
		add(item1);
		add(entry1);
		add(item2);
		add(password);
		
		//implementing the the ActionListener and ActionEvent
		theHandler handler = new theHandler();
		item1.addActionListener(handler);
		entry1.addActionListener(handler);
		item2.addActionListener(handler);
		password.addActionListener(handler);
	}
	
	//class to implement the ActionListener
	//class Nesting
	private class theHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String nick = "";
			if(event.getSource()==entry1)
				nick = String.format("Your Name is: %s", event.getActionCommand());
			else if(event.getSource() == password)
				nick = String.format("Your Password is: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, nick, "Student-Details", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
