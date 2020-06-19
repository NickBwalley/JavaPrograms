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
    //constructor
    public Window(){
        super("Registration-Form");
        setLayout(new FlowLayout());
        label1 = new JLabel("Enter Your Name: ");
        label1.setToolTipText("Please Enter Your Official Name: ");
        add(label1);
    }
    
}
