package gui_JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NickFury extends JFrame{
    private JButton button1;
    private JButton button2;
    
    public NickFury(){
        super("Java Buttons!..");
        setLayout(new FlowLayout());
        button1 = new JButton("Regular Button");
        add(button1);
        
    }
}
