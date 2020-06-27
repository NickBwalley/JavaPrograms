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
    private JLabel label1;
    
    public NickFury(){
        super("Java Buttons!..");        
        setLayout(new FlowLayout());
        label1 = new JLabel("Just a test for the JButtons!..");
        add(label1);
        button1 = new JButton("Regular Button");
        add(button1);
        Icon nick1 = new ImageIcon(getClass().getResource("cool1.png"));
        Icon nick2 = new ImageIcon(getClass().getResource("cool2.png"));
        button2 = new JButton("Cool Image", nick1);
        button2.setRolloverIcon(nick2);
        add(button2);
        //creating an ActionListener Class handler
        handlerClass handler = new handlerClass();
        button1.addActionListener(handler);
        button2.addActionListener(handler);
    }
    
    private class handlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, event.getActionCommand());
        }
    }
}
