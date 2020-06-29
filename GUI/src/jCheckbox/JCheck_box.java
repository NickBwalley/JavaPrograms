package jCheckbox;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JCheck_box extends JFrame{
	private JTextField text1;
	private JCheckBox boldBox;
	private JCheckBox italicBox;
	
	//creating a constructor 
	public JCheck_box() {
		super ("Strathmore University");
		setLayout(new FlowLayout());		
		text1 = new JTextField("Strathmore University", 20);		
		text1.setFont(new Font("Serif", Font.PLAIN, 14));
		add(text1);
		
		boldBox = new JCheckBox("Bold");
		italicBox = new JCheckBox("italic");
		
		
	}
}
