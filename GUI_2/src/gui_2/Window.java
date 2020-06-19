package gui_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Window extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField item1;
    private JTextField item2;
    private JPasswordField password;
    
    //constructor
    public Window(){
        super("Registration-Form");
        setLayout(new FlowLayout());
        label1 = new JLabel("Enter Your Full-Name: ");
        label1.setToolTipText("Please Use Your Official Name:");
        add(label1);
        
        item1 = new JTextField("",20);
        add(item1);
        
        label2 = new JLabel("Enter Your Username: ");
        label2.setToolTipText("Does Not Have to be Official Name:");
        add(label2);
        
        item2 = new JTextField("", 20);
        add(item2);
        
        label3 = new JLabel("Enter Your Password: ");
        label3.setToolTipText("Password must be atleast 8characters Long!");
        add(label3);
        
        password = new JPasswordField("",20);
        add(password);
        
        //create a method to implement the ActionListener and ActionEvent
        theHandler handler = new theHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        password.addActionListener(handler);
        
        
        //end of our constructor  
        
    }
    
    //class to implement our ActionListener
    private class theHandler implements ActionListener{
        String nicky = "";
        public void actionPerformed(ActionEvent event){
            
            if(event.getSource()==item1)
                nicky = String.format("Your Name is: %s",event.getActionCommand());
            else if(event.getSource()==item2)
                nicky = String.format("Your Username is: %s", event.getActionCommand());
            else if(event.getSource()==password)
                nicky = String.format("Password is: %s", event.getActionCommand());
            
            JOptionPane.showMessageDialog(null, this);
          
        }
        
        public String toString(){
            return String.format(nicky, JOptionPane.PLAIN_MESSAGE);
        }
    }
    
}
