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
    private JPasswordField password1;
    
    // creating a constructor 
    public Window1(){
        super("Students_Registration_System");
        setLayout(new FlowLayout());
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
            
            JOptionPane.showMessageDialog(null, this);
        }
        
        public String toString(){
            return String.format(nick, JOptionPane.PLAIN_MESSAGE);
        }
    }
    

}
