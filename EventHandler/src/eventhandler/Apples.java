package eventhandler;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Apples extends JFrame{
    private JTextField item1;
    private JTextField item2;
    private JPasswordField myPassword;
    
    public Apples(){
        super("World Cup 2018!");
        setLayout(new FlowLayout());
        item1 = new JTextField(10);
        add(item1);
        
        item2 = new JTextField("World-Cup Finals", 20);
        item2.setEditable(false);
        add(item2);
        
        myPassword = new JPasswordField(10);
        add(myPassword);
        //creating an action Listener
        theHandler Handler = new theHandler();
        item1.addActionListener(Handler);
        item2.addActionListener(Handler);
        myPassword.addActionListener(Handler);        
            
    }
    
    private class theHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            String str = "";
            if(event.getSource() == item1)
                str = String.format("Field 1: %s", event.getActionCommand());
            else if(event.getSource() == item2)
                str = String.format()
        }
    }
}
