package gui_3;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Diamond {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField username;
    private JTextField email;
    private JPasswordField password;
    
    public void Window(){
        JFrame nicky = new JFrame();
        nicky.setSize(400,200);
        nicky.setLocation(400,100);
        nicky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nicky.setTitle("Nicky's Restaurant");//super is used in first stmt of a constructor
        nicky.setLayout(new FlowLayout());
        label1 = new JLabel("Enter Your UserName: ");
        username = new JTextField("",20);
        nicky.add(label1);       
        nicky.add(username);
        
        label2 = new JLabel("Enter Your Email: ");
        email = new JTextField("",20);
        nicky.add(label2);
        nicky.add(email);
        
        label3 = new JLabel("Enter New Password: ");
        password = new JPasswordField("",20);
        nicky.add(label3);
        nicky.add(password);
        nicky.setVisible(true);//needs to be set at the end of the last statement
        //implementing the action listener
        actionListener events = new actionListener();
        username.addActionListener(events);
        email.addActionListener(events);
        password.addActionListener(events);
        
    }
    
    //class to handle the ActionListener
    public class actionListener implements ActionListener{
        String biiy = "";
        public void actionPerformed(ActionEvent event){            
            if(event.getSource()==username)
                biiy = String.format("Username set: %s", event.getActionCommand());
            else if(event.getSource()==email)
                biiy = String.format("Email set: %s", event.getActionCommand());
            else if(event.getSource()==password)
                biiy = String.format("Password set: %s", event.getActionCommand());
            
            JOptionPane.showMessageDialog(null, this);
        }
        
        public String toString(){
            return String.format(biiy, JOptionPane.PLAIN_MESSAGE);
        }
    }
    
}
