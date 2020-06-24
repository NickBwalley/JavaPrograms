package jButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NickJButton extends JFrame{
	private JButton regular;
	private JButton custom;
	
	public NickJButton() {
		super("Title-Bar");
		setLayout(new FlowLayout());
		
		regular = new JButton("Regular Button");
		add(regular);
		
		Icon nick1 = new ImageIcon(getClass().getResource("nick1.png"));
		Icon nick2 = new ImageIcon(getClass().getResource("nick2.png"));
		custom = new JButton("Customized", nick1);
		custom.setRolloverIcon(nick2);
		add(custom);
	}
}
