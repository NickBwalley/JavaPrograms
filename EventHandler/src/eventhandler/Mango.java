
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
    private JPasswordField myPassword;
    
    public Mango(){
        super("WrestleMania!!");
        setLayout(new FlowLayout());
        item1 = new JTextField(10);
        add(item1);
        
        item2 = new JTextField("Royal-Rumble-Winner", 20);
        item2.setEditable(false);
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
           
       }
   } 
}
