
package gui;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NickFury extends JFrame {
    
    private JLabel kfc;
    
    public NickFury(){
        super("Special Offers!");
        setLayout(new FlowLayout());
        kfc = new JLabel("Buy bucket KFC at KSH1000..Special Offer!");
        kfc.setToolTipText("Buy one get one free!");
        add(kfc);
    }
}
