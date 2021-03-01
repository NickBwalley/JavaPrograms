package guiJCheckBox;
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
		add(boldBox);
		add(italicBox);
		//implementing the action listener 
		handlerClass handler = new handlerClass();
		
		boldBox.addItemListener(handler);
		italicBox.addItemListener(handler);
				
	}
	
	private class handlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			if(boldBox.isSelected() && italicBox.isSelected())
				font = new Font("Serif", Font.BOLD + font.ITALIC, 14);
			else if(boldBox.isSelected())
				font = new Font("Serif", Font.BOLD, 14);
			else if(italicBox.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else
				font = new Font("Serif", Font.PLAIN, 14);
			text1.setFont(font);
				
		}
	}
}
