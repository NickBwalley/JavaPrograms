
package eventhandler;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Mango extends JFrame{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField myPassword;
    
    public Mango(){
        super("WrestleMania!!");
        setLayout(new FlowLayout());
        
        item1 = new JTextField("Who Won the Womens-Money-in-the-Bank", 40);
        item1.setEditable(false);
        add(item1);
        
        item2 = new JTextField(10);
        add(item2);
        
        myPassword = new JPasswordField();
        add(myPassword);
        
        //creating an object for the ActionListener
        actionList pointer = new actionList();
        item1.addActionListener(pointer);
        item2.addActionListener(pointer);
        myPassword.addActionListener(pointer);
        
    }
    
   private class actionList implements ActionListener{
       
       public void actionPerformed(ActionEvent event){
           String pears = "";
           if(event.getSource() == item1)
               pears = String.format("Your Choice was: %s", event.getActionCommand());
           else if(event.getSource() == item2)
               pears = String.format("You", os)
       }
   } 
}
