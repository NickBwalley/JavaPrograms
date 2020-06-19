package gui_2;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;

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
