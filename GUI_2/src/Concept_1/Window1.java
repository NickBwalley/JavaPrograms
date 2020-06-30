package Concept_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window1 extends JFrame{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JCheckBox checkbox1;
    private JCheckBox checkbox2;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JLabel textfont1;
    private JTextField textfont2;
    private JPasswordField password1;
    private JCheckBox boldBox;
    private JCheckBox italicBox;
    private JTextField emptyLine;
    // creating a constructor 
    public Window1(){
        super("Students_Registration_System");
        setLayout(new FlowLayout());
        textfont1 = new JLabel("JCheckBox");
        textfont2 = new JTextField("Welcome to Strathmore University!..",20);
        textfont2.setFont(new Font("Serif",Font.PLAIN, 14));
        boldBox = new JCheckBox("Bold");
        italicBox = new JCheckBox("Italic");
        emptyLine = new JTextField("",100);
        add(textfont1);
        add(textfont2);
        add(boldBox);
        add(italicBox);
        add(emptyLine);
        label1 = new JLabel("Enter Your Name: ");
        textfield1 = new JTextField("",20);
        label2 = new JLabel("Enter Your E-Mail: ");
        textfield2 = new JTextField("",20);
        label3 = new JLabel("Enter Your Password: ");
        password1 = new JPasswordField("",20);
        button1 = new JButton("Sports");
        Icon nicky1 = new ImageIcon(getClass().getResource("cool1.png"));
        Icon nicky2 = new ImageIcon(getClass().getResource("cool2.png"));
        button2 = new JButton("Reports", nicky1);
        button2.setRolloverIcon(nicky2);
        add(label1);
        add(textfield1);
        add(label2);
        add(textfield2);
        add(label3);       
        add(password1);
        add(button1);
        add(button2);
        // creating the actionListener
        handlerClass handler = new handlerClass();
        textfield1.addActionListener(handler);
        textfield2.addActionListener(handler);
        password1.addActionListener(handler);
        button1.addActionListener(handler);
        button2.addActionListener(handler);
        //Creating the ItemListener
        itemList item = new itemList();
        boldBox.addItemListener(item); 
        italicBox.addItemListener(item);
    }
    //implementing the ActionListener Class
    private class handlerClass implements ActionListener{
        private String nick = "";
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == textfield1)
                nick = String.format("Your Name is: %s", event.getActionCommand());
            else if(event.getSource() == textfield2)
                nick = String.format("Your Email is: %s", event.getActionCommand());
            else if(event.getSource() == password1)
                nick = String.format("Password set: %s", event.getActionCommand());
            else if(event.getSource() == button1)
                nick = String.format("Fancy Button: %s", event.getActionCommand());
            else if(event.getSource() == button2)
                nick = String.format("Fancy Button: %s", event.getActionCommand());
            
            JOptionPane.showMessageDialog(null, this);
        }
        
        public String toString(){
            return String.format(nick, JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    //implementing the ItemListener Class
    private class itemList implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            Font nick = null;
            if(boldBox.isSelected() && italicBox.isSelected())
                nick = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if(boldBox.isSelected())
                nick = new Font("Serif", Font.BOLD, 14);
            else if(italicBox.isSelected())
                nick = new Font("Serif", Font.ITALIC, 14);
            else 
                nick = new Font("Serif", Font.PLAIN, 14);
            textfont2.setFont(nick);
        }
    }
    

}
