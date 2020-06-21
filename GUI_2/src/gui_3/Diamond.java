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
        nicky.setSize(400,300);
        nicky.setLocation(400,100);

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
        
    }
    
}
