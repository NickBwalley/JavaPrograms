package guieventhandler;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apples extends JFrame {
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField password;
	
	//constructor
	/**
	 * 
	 */
	public Apples() {
		super("Nicky's Restaurant System.");
		setLayout(new FlowLayout());
		label1 = new JLabel("Enter Your UserName: ");
		textField1 = new JTextField("",15);
		add(label1);
		add(textField1);
		
		label2 = new JLabel("Enter Your EmailAddress: ");
		textField2 = new JTextField("", 15);
		add(label2);
		add(textField2);
		
		label3 = new JLabel("Enter New Password: ");
		password = new JPasswordField("",15);
		
		// un-editable text field
		textField3 = new JTextField("I Agree on the Terms and Conditions", 30);
		textField3.setEditable(false);
		add(label3);
		add(password);
		add(textField3);
		
		
		theHandler handler = new theHandler();//implementing the action listeners
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		password.addActionListener(handler);
	}
	
	//creating a class to implement the action listener inside our constructor 
	private class theHandler implements ActionListener{
		String nicky = "";
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == textField1)
				nicky = String.format("Your Username is: %s", event.getActionCommand());
			else if(event.getSource() == textField2)
				nicky = String.format("Your Email is: %s", event.getActionCommand());
			else if(event.getSource() == password)
				nicky = String.format("Password set is: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, this);
		}
		//create a toString method to implement the 'this' keyword
		
		public String toString() {
			return String.format(nicky, JOptionPane.PLAIN_MESSAGE);
		}
	}
	
}
