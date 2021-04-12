package eventhandlers;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class NickFury extends JFrame {
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField myPassword;
	
	public NickFury() {
		super("Students Self-Enrollment-System");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField(10);
		add(item2);
		
		item3 = new JTextField("NickBiiy", 10);
		item3.setEditable(false);
		add(item3);
		
		myPassword = new JPasswordField(20);
		add(myPassword);
		
		theHandler handler = new theHandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		myPassword.addActionListener(handler);
	}
	
		private class theHandler implements ActionListener{
			
			public void actionPerformed (ActionEvent event) {
				String str = "";
				
				if(event.getSource() == item1)
					str = String.format("Field 1: %s", event.getActionCommand());
				else if(event.getSource() == item2)
					str = String.format("Field 2: %s", event.getActionCommand());
				else if(event.getSource() == item3)
					str = String.format("Field 3: %s", event.getActionCommand());
				else if(event.getSource() == myPassword)
					str = String.format("Password field: %s", event.getActionCommand());
				
				JOptionPane.showMessageDialog(null, str);
				
			}


		}
}
